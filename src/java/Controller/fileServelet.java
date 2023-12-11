package Controller;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fileServelet")
public class fileServelet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String fileType = request.getParameter("type");

        String columnName = ""; // Name of the database column for the selected file type
        String contentDisposition = "";
        String contentType = "application/pdf";

        switch (fileType) {
            case "cv":
                columnName = "cvFile";
                contentDisposition = "inline; filename=cv.pdf";
                break;
            case "id":
                columnName = "idFile";
                contentDisposition = "inline; filename=id.pdf";
                break;
            case "matric":
                columnName = "matricFile";
                contentDisposition = "inline; filename=matric.pdf";
                break;
            default:
                response.getWriter().println("Invalid file type.");
                return;
        }

        String dbUrl = "jdbc:mysql://localhost/login";
        String dbUser = "root";
        String dbPassword = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);

            String query = "SELECT " + columnName + " FROM application WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();

            if (result.next()) {
                response.setContentType(contentType);
                response.setHeader("Content-Disposition", contentDisposition);

                OutputStream out = response.getOutputStream();
                byte[] buffer = new byte[4096];
                while (result.getBinaryStream(columnName).read(buffer) > 0) {
                    out.write(buffer);
                    out.flush();
                }
                out.close();
            }
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
