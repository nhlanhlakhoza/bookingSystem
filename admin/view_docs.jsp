<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Blob"%>
<%
String jdbcUrl = "jdbc:mysql://localhost/login";
String dbUser = "root";
String dbPassword = "";
Blob file = null;
byte[] filedata = null;

try {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
    
    // Retrieve the id and type parameters from the URL
    int id = Integer.parseInt(request.getParameter("id"));
    String fileType = request.getParameter("type"); // This will be either "idFile" or "qualification"

    // Modify the SQL query to retrieve the specific file data based on the type
    String sql = "SELECT " + fileType + " FROM application WHERE id = ?";
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setInt(1, id);
    ResultSet rs = pstmt.executeQuery();

    if (rs.next()) {
        file = rs.getBlob(fileType);
        filedata = file.getBytes(1, (int) file.length());
    } else {
        out.println("File not found.");
        return;
    }

    response.setContentType("application/pdf"); // You can set the appropriate content type here
    response.setHeader("Content-Disposition", "inline");
    response.setContentLength(filedata.length);
    OutputStream output = response.getOutputStream();
    output.write(filedata);
    output.flush();

    rs.close();
    pstmt.close();
    conn.close();
} catch (Exception e) {
    e.printStackTrace();
}
%>
