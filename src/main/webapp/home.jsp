<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 3.03.2023
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>

    <style>
        /* Bordered form */
        form {
            border: 3px solid #f1f1f1;
        }

        /* Full-width inputs */
        input[type=text], input[type=password] {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
        }

        /* Set a style for all buttons */
        a {
            background-color: #04AA6D;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            cursor: pointer;
            width: 100%;
            text-decoration: auto;
        }

        /* Add a hover effect for buttons */
        a:hover {
            opacity: 0.8;
        }

        /* Extra style for the cancel button (red) */
        .cancelbtn {
            width: auto;
            padding: 10px 18px;
            background-color: #f44336;
        }

        /* Center the avatar image inside this container */
        .imgcontainer {
            text-align: center;
            margin: 24px 0 12px 0;
        }

        /* Avatar image */
        img.avatar {
            width: 40%;
            border-radius: 50%;
        }

        /* Add padding to containers */
        .container {
            padding: 16px;
        }

        /* The "Forgot password" text */
        span.psw {
            float: right;
            padding-top: 16px;
        }

        /* Change styles for span and cancel button on extra small screens */
        @media screen and (max-width: 300px) {
            span.psw {
                display: block;
                float: none;
            }
            .cancelbtn {
                width: 100%;
            }
        }
    </style>
</head>
<body>

<div style="text-align: center;margin-left: auto;margin-top: 40px;margin-right: auto;">
    <h1 style="color:green;">Welcome To FLYAWAY!</h1>
    <h4 style="color:rgba(0,128,0,0.66);">Please select one of the options:</h4>
    <div style="
    height: 56px;
">  <a href="FlightsListController">Flight List</a><br>  </div>
    <div style="
    height: 56px;
">  <a href="searchFlight.jsp">Search Flight</a><br> </div>
    <div style="
    height: 56px;
">  <a href="changePassword.jsp">Change Password</a><br> </div>
</div>
</body>
</html>
