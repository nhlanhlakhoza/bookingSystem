<%-- 
    Document   : dashboard
    Created on : 18 Sep 2023, 2:43:57 PM
    Author     : User1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- Coding by CodingNepal | www.codingnepalweb.com -->
<html lang="en" dir="ltr">
  <head>
    <!-- Meta Tags -->

<meta charset="UTF-8">
    <title> Responsiive Admin Dashboard | CodingLab </title>
    <link rel="stylesheet" href="style.css">
    <!-- Boxicons CDN Link -->
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="_include/css/main.css" rel="stylesheet">
  <link href='https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap' rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Analytics -->
<script type="text/javascript">

  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'Insert Your Code']);
  _gaq.push(['_trackPageview']);

  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();

</script>

  <style>
        .application-status-table {
            width: 40%;
            border-collapse: collapse;
            margin-top: 20px;
            margin-left: 10px;
        }

        .application-status-table th, .application-status-table td {
            border: 1px solid #5eded3;
            padding: 6px;
            text-align: left;
            padding-right: 120px;
        }

        .application-status-table th {
            background-color: #5eded3;
            font-weight: bold;
        }

        /* Add more custom styles as needed */
    </style>
   </head>
<body>
    
 <div class="sidebar">
    <div class="logo-details">
      <!--i class='bx bxl-c-plus-plus'></i-->
      <span class="logo_name"></span>
    </div>
      <ul class="nav-links">
        <li>
          <a href="dashboard.jsp"> <!-- a class="active"-->
            <i class='bx bx-grid-alt' ></i>
            <span class="links_name">Application</span>
             
          </a>
        </li>
        <!--li>
          <a href="#">
            <i class='bx bx-box' ></i>
            <span class="links_name">Application</span>
          </a>
        </li-->
        
        <li>
            <a href="ApplicationStatusServlet">
            <i class='bx bx-pie-chart-alt-2' ></i>
            <span class="links_name">Application status</span>
          </a>
        </li>
        
        <!--li>
          <a href="#">
            <i class='bx bx-book-alt' ></i>
            <span class="links_name">Total order</span>
          </a>
        </li-->
        <li>
          <a href="ProfileServlet">
            <i class='bx bx-cog' ></i>
            <span class="links_name">Settings</span>
          </a>
        </li>
        <li>
          <a href="#">
            <i class='bx bx-message' ></i>
            <span class="links_name">Messages</span>
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
        <span class="dashboard">Welcome to 4IRI</span>
      </div>
      <!--div class="search-box">
        <input type="text" placeholder="Search">
        <i class='bx bx-search' ></i>
      </div-->
      <div class="profile-details">
        <img src="_include/img/avatar15.jpg" alt="">
        <span class="admin_name"> <% String userName = (String) session.getAttribute("userName"); %>
            <%= userName %></span>
        <!--i class='bx bx-chevron-down' ></i-->
      </div>
    </nav>
        <br>
        <br>
        <br>
         
       
 

  <div class="containerssssssss">
        <h2>User Profile</h2>
        <form action="UpdateProfileServlet" method="post"  >
            
            <label for="userName">User Name</label>
            <input type="text" id="name" name="userName" value="${userName}" required>

            
                <label for="email">Email</label>
                <input type="text" id="email" name="email" value="${email}" required>
            
             <label for="password">password</label>
                <input type="text" id="email" name="password"  required>
            <input type="submit" class="btn" value="Update profile">
            <br>
            <br>
            
        </form>

        <!--a class="dashboard-link" href="dashboard.jsp">Return to Dashboard</a-->  
    </div>
       
 

 

  
 

    <!-- Add more HTML/CSS for formatting as needed -->
</section>

<section class="home-section">
    

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
 </script>
<!-- Js -->

<!-- End Js -->
</body>
</html>
