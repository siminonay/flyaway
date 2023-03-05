<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Change Password</title>

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
            input[type=submit] {
                background-color: #04AA6D;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                cursor: pointer;
                width: 100%;
            }

            /* Add a hover effect for buttons */
            input[type=submit]:hover {
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
<h4 style="color:rgba(0,128,0,0.66); width: 400px;margin-left: auto;margin-right: auto;">Please Enter Admin Login Information:</h4>
<div style="width: 400px;margin-left: auto;margin-right: auto;">
    <form action="ChangePasswordController" method="post">
        <div class="container">
            <label><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="name" required>

            <label><b>Old Password</b></label>
            <input type="password" placeholder="Enter Old Password" name="password" required>

            <label><b>New Password</b></label>
            <input type="password" placeholder="Enter New Password" name="newPassword" required>

            <input type="submit" name="Login"/>
        </div>
    </form>
</div>
</body>
</html>
