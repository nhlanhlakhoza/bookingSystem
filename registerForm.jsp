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


<title>Shortcodes | Brushed | Responsive One Page Template</title>   

<meta name="description" content="Insert Your Site Description" /> 

<!-- Mobile Specifics -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="HandheldFriendly" content="true"/>
<meta name="MobileOptimized" content="320"/>   

<!-- Mobile Internet Explorer ClearType Technology -->
<!--[if IEMobile]>  <meta http-equiv="cleartype" content="on">  <![endif]-->

<!-- Bootstrap -->


<!-- Main Style -->
<link href="_include/css/main.css" rel="stylesheet">

<!-- Supersized -->



<!-- FancyBox -->


<!-- Font Icons -->


<!-- Shortcodes -->



<meta charset="UTF-8">
    <title> Responsiive Admin Dashboard | CodingLab </title>
    <link rel="stylesheet" href="style.css">
    <!-- Boxicons CDN Link -->
    <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="_include/css/main.css" rel="stylesheet">
  <link href='https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap' rel='stylesheet' type='text/css'>
<!-- Google Font -->
<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,200italic,300,300italic,400italic,600,600italic,700,700italic,900' rel='stylesheet' type='text/css'>

<!-- Fav Icon -->
<link rel="shortcut icon" href="#">

<link rel="apple-touch-icon" href="#">
<link rel="apple-touch-icon" sizes="114x114" href="#">
<link rel="apple-touch-icon" sizes="72x72" href="#">
<link rel="apple-touch-icon" sizes="144x144" href="#">

<!-- Modernizr -->
<script src="_include/js/modernizr.js"></script>

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
        
         
        
  
  <section class="home-section">
  <div class="containerssss">
    <h2> Application Form</h2>
    <form action="FileUploadDBServlet" method="Post" enctype="multipart/form-data"required >
      
         <label for="User">User Name</label>
      <input type="text" id="lname" name="userName" value="<%= (String) session.getAttribute("userName") %>"readonly>
      
        <label for="fname">First Name</label>
      <input type="text" id="fname" name="firstName" placeholder="Your name.."required>
      

      <label for="lname">Last Name</label>
      <input type="text" id="lname" name="lastName" placeholder="Your last name.."required>
      
      
      
      <label for="courseName">Selected Field</label>
        <input type="text" id="courseName" name="courseName" value="<%= request.getParameter("course") %>" readonly>
       <!--div class="gender-radio">
        <label>Gender:</label>
        <input type="radio" id="male" name="gender" value="male">
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="female">
        <label for="female">Female</label>
      </div>
      
      
      <div style="clear:both;"></div> <!-- Add a clearing div for separation -->
      
      
      
      <div style="clear:both;"></div> <!-- Add a clearing div for separation -->
      
      <!--label for="ID">ID Copy:</label>
      <input type="file" id="certificate" name="ID">
      <br>
      <!--label for="certificate">Matric certificate:</label>
      <input type="file" id="certificate" name="certificate">
      <br>
      <label for="Tertiary certificate">Tertiary certificate:</label>
      <input type="file" id="certificate" name="Tertiary certificate"-->
       
        <!--label for="CV">image:</label>
      <input type="file" id="ID" name="file">
      <br-->
        <label for="CV">ID:</label>
      <input type="file" id="ID" name="idFile"  accept=".pdf, .doc, .docx"required>
      <br>
       <label for="CV">CV:</label>
      <input type="file" id="CV" name="cvFile"accept=".pdf, .doc, .docx"required>
      <br>

         <label for="Matric">Matric certificate:</label>
      <input type="file" id="Matric" name="matricFile"accept=".pdf, .doc, .docx"required>
      <br>
  
     
       <label for="qualification">Tertiary Qualification:</label>
      <input type="file" id="Tertiary Qualification" name="qualification"accept=".pdf, .doc, .docx"required>
      <br>
  
      <br>
      <input type="submit" class="btn" value="Submit">
      <br>
      <br>
    </form>

         
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
 </script>
<!-- Js -->

<!-- End Js -->
</body>
</html>
