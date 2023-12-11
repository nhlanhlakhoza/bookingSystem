<%@page import="java.sql.Connection, java.sql.DriverManager, java.sql.PreparedStatement, java.sql.ResultSet"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Your Title Here</title>
    <link href="dist/css/style.css" rel="stylesheet" type="text/css" />
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css">
    <script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
     <link href="../_include/css/main.css" rel="stylesheet">
   
     <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>
<body>
    
     <div class="sidebar">
    <div class="logo-details">
      <!--i class='bx bxl-c-plus-plus'></i-->
      <span class="logo_name"></span>
    </div>
      <ul class="nav-links">
        <li>
          <a href="admin_dashboard.jsp"> <!-- a class="active"-->
            <i class='bx bx-grid-alt' ></i>
            <span class="links_name">Dashboard</span>
             
          </a>
        </li>
        <!--li>
          <a href="#">
            <i class='bx bx-box' ></i>
            <span class="links_name">Application</span>
          </a>
        </li-->
        
        <li>
            <a href="#">
            <i class='bx bx-pie-chart-alt-2' ></i>
            <span class="links_name">Application status</span>
          </a>
        </li>
        
       
        <li>
          <a href="ProfileServlet">
            <i class='bx bx-cog' ></i>
            <span class="links_name">Settings</span>
          </a>
        </li>
        <li>
          <a href="User.jsp">
            <i class='bx bx-user' ></i>
            <span class="links_name">List of User</span>
          </a>
        </li>
        <!--li>
          <a href="#">
            <i class='bx bx-heart' ></i>
            <span class="links_name">Favorites</span>
          </a>
        </li-->
        <!--li>
          <a href="ProfileServlet">
            <i class='bx bx-cog' ></i>
            <span class="links_name">Setting</span>
          </a>
        </li-->
        <li class="log_out">
          <a href="login.jsp">
            <i class='bx bx-log-out'></i>
            <span class="links_name">Log out</span>
          </a>
        </li>
      </ul>
  </div>
  <section class="home-section">
    <nav>
      <div class="sidebar-button">
        <i class='bx bx-menu sidebarBtn'></i>
        <span class="dashboard">Welcome to 4IRI Admin</span>
      </div>
      <!--div class="search-box">
        <input type="text" placeholder="Search">
        <i class='bx bx-search' ></i>
      </div-->
      <div class="profile-details">
        <img src="../_include/img/avatar15.jpg" alt="">
        <span class="admin_name">Administrator</span>
        <!--i class='bx bx-chevron-down' ></i-->
      </div>
    </nav>

    <div class="home-content">
        <div class="overview-boxess">
   
<h2>Applications</h2>
<table class="table table-striped table-hover table-bordered" id="data-table">
    <thead>
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Course</th>
            <th>Status</th>
            <th>View</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <%
            String jdbcUrl = "jdbc:mysql://localhost/login";
            String dbUser = "root";
            String dbPassword = "";

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
                String sql = "SELECT * FROM application";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String username = rs.getString("userName");
                    String course = rs.getString("courseName");
                    String status = rs.getString("status");
                %>
                <tr>
                    <td><%= id %></td>
                    <td><%= username %></td>
                    <td><%= course %></td>
                    <td>
                        <%= status %>
                    </td>
                    <td>
                        <a href="view_docs.jsp?id=<%= id %>&type=idFile" target="_blank">View ID</a>
                        <a href="view_docs.jsp?id=<%= id %>&type=matricFile" target="_blank">View Matric</a>
                        <a href="view_docs.jsp?id=<%= id %>&type=qualification" target="_blank">View Qualification</a>
                    </td>
                    <td>
                        <select id="status<%= id %>" name="status">
                            <option value="Accepted" <%= "Accepted".equals(status) ? "selected" : "" %>>Accepted</option>
                            <option value="Rejected" <%= "Rejected".equals(status) ? "selected" : "" %>>Rejected</option>
                        </select>
                        <button type="button" onclick="updateStatus(<%= id %>)">Update</button>
                    </td>
                </tr>
                <%
                }
                rs.close();
                pstmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>
    </tbody>
</table>
   
        </div >
        

      
  </section>



    <script>
        $(document).ready(function () {
            $('#data-table').DataTable({
                "pageLength": 10
            });
        });
    </script>
   <script>
    function updateStatus(id) {
        var status = document.getElementById("status" + id).value;
        // Send an AJAX request to update the status in the database
        // You will need to implement the update logic on the server side
        // You can use JavaScript, jQuery, or other technologies for the AJAX request
        // For example, here's a jQuery-based AJAX request:
        $.ajax({
            url: "update_status.jsp", // Replace with the actual URL to your server-side script
            type: "POST",
            data: { id: id, status: status },
            success: function(data) {
                // Handle success
                // You can update the UI or display a success message
                alert("Status updated successfully");
                 window.location.href = "User.jsp";
            },
            error: function() {
                // Handle error
                // You can display an error message or perform error handling
                alert("An error occurred while updating the status");
            }
        });
    }
</script>

</body>
</html>
