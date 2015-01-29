<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Hyvinvointikysely</title>
	
	<link type="text/css" rel="stylesheet" href ="css/bootstrap.css" />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta charset="UTF-8">
</head>
<body>
	
	<form class="well" method="post">
		<div class="container">
			<h3>Hyvinvointikysely</h3>
			<p></p>      
				
			<!-- Tekstikenttä -->
			<div class="form-group">
				<div class="input-group">
					<label for="InputMessage">Ole hyvä ja kerro, miltä sinusta nyt tuntuu:</label>
					<textarea name="InputMessage" id="InputMessage" class="form-control"  rows="5" required></textarea>
				</div>
			</div>
			<div>
				<a href="mailto:mikko.paussu@gmail.com" subject="The%20subject%20of%20the%20mail"><button class="btn btn-primary"  type="submit" value="Send">Submit</button></a>
				<button class="btn">Clear</button>
			</div>
		</div>
	</form>
	
	
	
	<script src="js/bootstrap.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/npm.js"></script>

</body>
</html>