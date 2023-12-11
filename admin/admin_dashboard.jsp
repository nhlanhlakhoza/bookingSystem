<%-- 
    Document   : dashboard
    Created on : 18 Sep 2023, 2:43:57 PM
    Author     : User1
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- Coding by CodingNepal | www.codingnepalweb.com -->
<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8">
    <title> Responsiive Admin Dashboard | CodingLab </title>
    <link rel="stylesheet" href="style.css">
    <!-- Boxicons CDN Link -->
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="../_include/css/main.css" rel="stylesheet">
  <link href='https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap' rel='stylesheet' type='text/css'>
   <link
  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
  
  rel="stylesheet"
/>
       <meta charset="UTF-8" />
    <meta
      name="viewport"
      content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"
    />
   
    <meta
      name="description"
      content="A responsive bootstrap 4 admin dashboard template by hencework"
    />

    <!-- Favicon -->
    <link rel="shortcut icon" href="favicon.ico" />
    <link rel="icon" href="favicon.ico" type="image/x-icon" />

    <!-- vector map CSS -->
    <link
      href="vendors/vectormap/jquery-jvectormap-2.0.3.css"
      rel="stylesheet"
      type="text/css"
    />

    <!-- Toggles CSS -->
    <link
      href="vendors/jquery-toggles/css/toggles.css"
      rel="stylesheet"
      type="text/css"
    />
    <link
      href="vendors/jquery-toggles/css/themes/toggles-light.css"
      rel="stylesheet"
      type="text/css"
    />

    <!-- Morris Charts CSS -->
    <link
      href="vendors/morris.js/morris.css"
      rel="stylesheet"
      type="text/css"
    />

    <!-- Toastr CSS -->
    <link
      href="vendors/jquery-toast-plugin/dist/jquery.toast.min.css"
      rel="stylesheet"
      type="text/css"
    />
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <!-- Custom CSS -->
    <link href="dist/css/style.css" rel="stylesheet" type="text/css" />

    <link
  href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css"
  rel="stylesheet"
/>
   </head>
<body>
    <% String successMessage = (String) request.getAttribute("successMessage"); %>
<% if (successMessage != null) { %>
    <script>
        alert("<%= successMessage %>");
    </script>
<% } %>
           <% String errorMessage = (String) request.getAttribute("errorMessage"); %>
<% if (errorMessage != null) { %>
    <script>
        alert("<%= errorMessage %>");
    </script>
<% } %>

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
         <!--div class="intro">Welcome to 4IRI Internship program Application system  </div-->
         
<div class="home-content">
     <div class="home-content">
        <% String jdbcUrl = "jdbc:mysql://localhost/login";
        String dbUser = "root";
        String dbPassword = "";
        int approvedCount = 0;
        int pendingCount = 0;
        int rejectedCount = 0;

        try {
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection conn = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

          String approvedSql = "SELECT COUNT(*) AS approvedCount FROM application WHERE status = 'approved'";
          PreparedStatement approvedPstmt = conn.prepareStatement(approvedSql);
          ResultSet approvedRs = approvedPstmt.executeQuery();
          if (approvedRs.next()) {
            approvedCount = approvedRs.getInt("approvedCount");
          }
          approvedRs.close();
          approvedPstmt.close();

          String pendingSql = "SELECT COUNT(*) AS pendingCount FROM application WHERE status = 'pending'";
          PreparedStatement pendingPstmt = conn.prepareStatement(pendingSql);
          ResultSet pendingRs = pendingPstmt.executeQuery();
          if (pendingRs.next()) {
            pendingCount = pendingRs.getInt("pendingCount");
          }
          pendingRs.close();
          pendingPstmt.close();

          String rejectedSql = "SELECT COUNT(*) AS rejectedCount FROM application WHERE status = 'rejected'";
          PreparedStatement rejectedPstmt = conn.prepareStatement(rejectedSql);
          ResultSet rejectedRs = rejectedPstmt.executeQuery();
          if (rejectedRs.next()) {
            rejectedCount = rejectedRs.getInt("rejectedCount");
          }
          rejectedRs.close();
          rejectedPstmt.close();
        } catch (Exception e) {
          e.printStackTrace();
        }
        %>
    <div class="overview-boxes">
        <div class="box">
            <div class="right-side">
               
                <div class="indicator">
                    <i class='bx bx-user'></i>
                    <span class="text">Total Users</span>
                </div>
                <br>
                <div class="number">
                    <p>120</p>
                </div>
            </div>
        </div>
        <div class="box">
            <div class="right-side">
               
                
                <div class="indicator">
                    <i class='bx bx-check fa-4x custom-icon text-success'></i>
                    <span class="text">Approved Applications</span>
                </div>
                <br>
                 <div class="number">
              <p>${approvedCount}</p>
                </div>
            </div>
        </div>
        <div class="box">
            <div class="right-side">
                
                <div class="indicator">
                    <i class='bx bx-time-five'></i>
                    <span class="text">Pending Applications</span>
                </div>
                <br>
                 <div class="number">
                  
                </div>
            </div>
        </div>
        <div class="box">
            <div class="right-side">
              
                
          
                    <%-- Your logic to count and display the total number of rejected applications here --%>
                   
                
                <div class="indicator">
                    <i class='bx bx-x-circle'></i>
                    <span class="text">Rejected Applications</span>
                </div>
                <br>
                 <div class="number">
                    <p>120</p>
                </div>
            </div>
        </div>
    </div>
</div>





      
  </section>


    
    
  <script>
   let sidebar = document.querySelector(".sidebar");
let sidebarBtn = document.querySelector(".sidebarBtn");
sidebarBtn.onclick = function() {
  sidebar.classList.toggle("active");
  if(sidebar.classList.contains("active")){
  sidebarBtn.classList.replace("bx-menu" ,"bx-menu-alt-right");
}else
  sidebarBtn.classList.replace("bx-menu-alt-right", "bx-menu");
}


 // JavaScript function to handle the application
  function applyForCourse(course) {
    // Redirect to the registration form page with the selected course as a query parameter
    window.location.href = 'registerForm.jsp?course=' + encodeURIComponent(course);
  }

  // Add click event listeners to the Apply buttons
  document.querySelector("[data-course='Software Engineering']").addEventListener("click", function() {
    applyForCourse("Software Engineering");
  });

  document.querySelector("[data-course='Technical Support']").addEventListener("click", function() {
    applyForCourse("Technical Support");
  });

  document.querySelector("[data-course='Accounting']").addEventListener("click", function() {
    applyForCourse("Accounting");
  });


 </script>

</body>
</html>
