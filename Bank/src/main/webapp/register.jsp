<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>

    <meta charset="UTF-8">

    <link rel="stylesheet" href="css/style.css">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<div class="container">
    <input type="checkbox" id="flip">
    <div class="cover">
      <div class="front">
        <img src="image/bk.jpg" alt="">
      </div>
    </div>
    <div class="forms">
        <div class="form-content">        
  	     <div class="signup-form">
          <div class="title">Signup</div>
        <form action="register" method="post" autocomplete="on">
            <div class="input-boxes">
              <div class="input-box">
                <i class="fas fa-user"></i>
                <input type="text" placeholder="Enter your name" name="username" required>
              </div>
              <div class="input-box">
                <i class="fas fa-envelope"></i>
                <input type="text" placeholder="Enter your email" name="useremail" required>
              </div>
              <div class="input-box">
                <i class="fas fa-lock"></i>
                <input type="password" placeholder="Enter your password" name="userpassword" required>
              </div>
              <div class="button input-box">
                <input type="submit" value="Sumbit">
              </div>
              <div class="text sign-up-text">Already have an account? <label for=""><a href="login.jsp">Login now</a></label></div>
            </div>
      </form>
    </div>
    </div>
    </div>
  </div>
</body>
</html>