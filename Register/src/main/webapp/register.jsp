<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3">
				<div class="card">
					<div class="card-content">
						<h3>Register here!!</h3>
						
						<div class="form center-align" >
							<form action="RegisterServlet" method="post">
								<input type="text" name="user_name" placeholder="Enter user name">
								<input type="password" name="user_password" placeholder="Enter user password">
								<input type="email" name="user_email" placeholder="Enter user email">
								
								<button type="button" class="btn" value="Submit">Submit</button>
							</form>
						
						</div>
						<div class="lodder">
						
						</div>						
					
					</div>
				</div>
			</div>
		</div>
			
	
	</div>
</body>
</html>