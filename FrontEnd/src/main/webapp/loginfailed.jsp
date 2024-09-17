<%-- 
    Document   : loginfailed
    Created on : Feb 25, 2024, 3:40:51 PM
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<style>
body {
  background-color:  #282a33 !important;
  color: #fff !important;
}
</style>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Z Games</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>

<body>
    <center>  <center>
    <img src="resources/zgames.png" width ="375" height ="150  " >
    <br/>
    <h3 class="fw-bold">Sign In</h3>
    <br/>
    <p class="text-danger">Incorrect Login Credentials</p>
    <form action="FrontEnd" method="post">
        <input type="hidden" name="pageName" value="login"/>
        
        <table border= 0px align="center" cellpadding="5" cellspacing="5">
        <tr>
            <td> Enter username </td>
            <td>
                <Label for="username"></Label>
                <input type="text" id="username" name="username" size="30" placeholder="Username"> 
            </td>
        </tr>
        <tr>
            <td> Enter password </td>
            <td>
                <Label for="password"></Label> 
                <input type="password" id="password" name="password" size="30" placeholder="Password">
            </td>
        </tr>
        <tr>
            <td ColSpan = 2>
                <center> <input class="btn btn-primary" type="submit" value="Login" > </center>
            </td>
        </tr>
        </table>
        <br>
        <div class="container mt-3 mb-5 p-4">
            <h3 class="fw-bold">New User?</h3>
            <p>Join our community for free to access hundreds of games!</p>

            <div>
                <a href="register.jsp" class="btn btn-outline-primary">Register</a>
            </div>
    </form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>