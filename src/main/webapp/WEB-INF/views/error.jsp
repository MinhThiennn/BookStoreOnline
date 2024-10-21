<%@ page isErrorPage="true" contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error Page</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/css/style.css"> <!-- Link tới file CSS của bạn -->
</head>
<body>
    <div class="error-container">
        <h1>Error Occurred</h1>
        <h2>Status Code: <%= request.getAttribute("javax.servlet.error.status_code") %></h2>
        <h3>Error Message: <%= request.getAttribute("javax.servlet.error.message") %></h3>
        <h3>Servlet Name: <%= request.getAttribute("javax.servlet.error.servlet_name") %></h3>
        <h3>Requested URI: <%= request.getAttribute("javax.servlet.error.request_uri") %></h3>

        <p>We are sorry for the inconvenience. Please try again later or contact support.</p>
        <a href="${pageContext.request.contextPath}/home">Go Back to Home</a>
    </div>

    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8d7da;
            color: #721c24;
            margin: 0;
            padding: 20px;
        }

        .error-container {
            max-width: 600px;
            margin: auto;
            padding: 20px;
            border: 1px solid #f5c6cb;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
        }

        h1 {
            color: #c0392b;
        }

        a {
            text-decoration: none;
            color: #c0392b;
        }

        a:hover {
            text-decoration: underline;
        }
    </style>
</body>
</html>
