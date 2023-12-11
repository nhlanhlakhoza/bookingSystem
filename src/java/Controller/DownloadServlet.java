import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "DownloadServlet", urlPatterns = {"/DownloadServlet"})
public class DownloadServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");

            // Replace "application" with your table name and "idFileColumn" with your column name
            String sql = "SELECT idFile FROM application WHERE id = ?"; // Assuming you have an ID to retrieve a specific record
            int recordId = Integer.parseInt(request.getParameter("id")); // Get the record ID from the request

            ps = con.prepareStatement(sql);
            ps.setInt(1, recordId);

            rs = ps.executeQuery();
            if (rs.next()) {
                Blob idFileBlob = rs.getBlob("idFile");
                if (idFileBlob != null) {
                    InputStream idFileInputStream = idFileBlob.getBinaryStream();

                    // Set the content type and response headers for the file download
                    response.setContentType("application/octet-stream");
                    response.setHeader("Content-Disposition", "attachment; filename=\"idFile.pdf\""); // Adjust the filename as needed

                    // Read the binary data and write it to the response output stream
                    OutputStream out = response.getOutputStream();
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = idFileInputStream.read(buffer)) != -1) {
                        out.write(buffer, 0, bytesRead);
                    }
                    idFileInputStream.close();
                    out.flush();
                } else {
                    // Handle case where the file is not found
                    response.getWriter().write("ID file not found");
                    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            // Handle exceptions
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
