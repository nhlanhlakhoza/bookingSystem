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
    <meta charset="UTF-8">
    <title> Responsiive Admin Dashboard | CodingLab </title>
    <link rel="stylesheet" href="style.css">
    <!-- Boxicons CDN Link -->
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="_include/css/main.css" rel="stylesheet">
  <link href='https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap' rel='stylesheet' type='text/css'>
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

    <div class="home-content">
         <!--div class="intro">Welcome to 4IRI Internship program Application system  </div-->
         
      <div class="overview-boxes">
        <div class="box" >
          <div class="right-side">
            <div class="box-topic">Software Engineer</div>
            <br>
            <div class="number">Requirement and Qualification</div>
            <div class="indicator">
              <!--i class='bx bx-up-arrow-alt'></i-->
              <span class="text">Diploma/Degree in Computer Science or related field</span>
            
              
            </div>
            <br>
             <button type="button" class="btn"   data-course="Software Engineering">Apply</button>
          </div>
          <!--i class='bx bx-cart-alt cart'></i-->
        </div>
        <div class="box">
          <div class="right-side">
            <div class="box-topic">Technical Support</div>
                   <br>
            <div class="number">Requirement and Qualification</div>
            <div class="indicator">
              <!--i class='bx bx-up-arrow-alt'></i-->
              <span class="text">Diploma/Degree in Networking or related field</span>
            </div>
            <br>
             <button type="button" class="btn" data-course="Technical Support">Apply</button>
          </div>
          <!--i class='bx bxs-cart-add cart two' ></i-->
        </div>
        <div class="box">
          <div class="right-side">
            <div class="box-topic">Accounting</div>
                   <br>
            <div class="number">Requirement and Qualification</div>
            <div class="indicator">
              <!--i class='bx bx-up-arrow-alt'></i-->
              <span class="text">Diploma/Degree in Accounting or related field</span>
            </div>
            <br>
          <button type="button" class="btn" data-course="Accounting">Apply</button>
          </div>
          <!--i class='bx bx-cart cart three' ></i-->
        </div>
        <!--div class="box">
          <div class="right-side">
            <div class="box-topic">Total Return</div>
            <div class="number">11,086</div>
            <div class="indicator">
              <i class='bx bx-down-arrow-alt down'></i>
              <span class="text">Down From Today</span>
            </div>
          </div>
          <i class='bx bxs-cart-download cart four' ></i>
        </div>
      </div-->

      
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
