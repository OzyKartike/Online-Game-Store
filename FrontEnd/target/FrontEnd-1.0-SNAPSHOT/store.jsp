<%-- 
    Document   : store
    Created on : Feb 25, 2024, 3:43:44 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<style>
body {
  background-color:  #282a33 !important;
  color: #fff !important;
  
}

table {
    border-collapse: collapse !important;
    
}
td {
    border: solid 2px lightgrey !important;
}


</style>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Store</title>
        <!--External Library-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel ="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel = "stylesheet" href="style.css">
    </head>
    <body>
        <form action="ViewProfile" method="post">
            <center><h2>Hello <%=session.getAttribute("username")%></h2></center>
            <div>
                <br/>
                <center> <a href="profile.jsp" class="btn btn-primary">View Profile</a> </center>
                <br/>
            </div>
        </form>
        
    <!-- Search bar -->
    <div class="container mt-3">
        <form action="FrontEnd" method="get">
            <input type="hidden" name="pageName" value="search"/>
            <div class="input-group mb-3">
                <input type="text" class="form-control" placeholder="Search for games" name="query">
                <div class="input-group-append">
                    <button class="btn btn-primary" type="submit">Search</button>
                </div>
            </div>
        </form>
    </div>
        
        <div class="main_container"> 
    <div class="product">
    <img src="resources/sekiro.jpg" alt="">
    <div class="product_desc">
      <h3>Sekiro</h3>
      <p>$133.23</p>
      <div class="rating">
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star"></span>
        <span class = "fa fa-star"></span>
      </div>
    </div>
  </div>
  <div class="product">
    <img src="resources/elden.jpg" alt="">
    <div class="product_desc">
      <h3>Elden Ring</h3>
      <p>$122.23</p>
      <div class="rating">
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
      </div>
    </div>
  </div>
  <div class="product">
    <img src="resources/minecraft.jpg" alt="">
    <div class="product_desc">
      <h3>Minecraft</h3>
      <p>$30.23</p>
      <div class="rating">
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star"></span>
      </div>
    </div>
  </div>
  <div class="product">
    <img src="resources/GOW.jpg" alt="">
    <div class="product_desc">
      <h3>God of War</h3>
      <p>$70.32</p>
      <div class="rating">
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star "></span>
        <span class = "fa fa-star "></span>
        <span class = "fa fa-star"></span>
        <span class = "fa fa-star"></span>
      </div>
    </div>
  </div>
  <div class="product">
    <img src="resources/nba.jpg" alt="">
    <div class="product_desc">
      <h3>NBA 2k24</h3>
      <p>$13.23</p>
      <div class="rating">
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star"></span>
      </div>
    </div>
  </div>
  <div class="product">
    <img src="resources/hogwarts.jpg" alt="">
    <div class="product_desc">
      <h3>Hogwarts Lecacy</h3>
      <p>$45.82</p>
      <div class="rating">
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star "></span>
        <span class = "fa fa-star"></span>
        <span class = "fa fa-star"></span>
      </div>
    </div>
  </div>
  <div class="product">
    <img src="resources/rdr2.jpg" alt="">
    <div class="product_desc">
      <h3>Read dead Redemption 2</h3>
      <p>$68.23</p>
      <div class="rating">
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star"></span>
        <span class = "fa fa-star"></span>
      </div>
    </div>
  </div>
  <div class="product">
    <img src="resources/cod.jpg" alt="">
    <div class="product_desc">
      <h3>Modern Warfare</h3>
      <p>$123.23</p>
      <div class="rating">
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star checked"></span>
        <span class = "fa fa-star"></span>
        <span class = "fa fa-star"></span>
      </div>
    </div>
  </div>
  </div>
        
        
        <script>
        function Profile() {
            // Redirect to the profile page
            window.location.href = "profile.jsp";
        }
    </script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    </body>
</html>
