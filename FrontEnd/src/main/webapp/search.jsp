<%@page import="java.util.ArrayList"%>
<%@page import="ryerson.ca.helper.Game"%>
<%@page import="java.util.Set"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Search Results</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1>Search Results</h1>
    <table class="table">
        <thead>
        <tr>
            <th>Genre</th>
            <th>Title</th>
            <th>Developer</th>
        </tr>
        </thead>
        <tbody>
        <% 
            // Get the search results from the request attribute
            ArrayList<Game> searchResults = (ArrayList<Game>) request.getAttribute("gameList");
            // Loop through the search results and display them in the table
            for (Game game : searchResults) {
        %>
        <tr>
            <td><%= game.getGenre() %></td>
            <td><%= game.getTitle() %></td>
            <td><%= game.getdevName() %></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</div>
</body>
</html>