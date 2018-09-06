<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form method="post" action="" enctype="multipart/form-data">
		<table>
			<tr>
			<td> First Name</td>
			<td> <input type="text" name="fname"  maxlength="15" size="10" disabled/></td>
			</tr>
			<tr>
			<td> Last Name</td>
			<td> <input type="text" name="lname" readonly/></td>
			</tr>
			<tr>
			<td> Password</td>
			<td> <input type="password" name="password"/></td>
			</tr>
			<tr> <td> Gender</td><<td> <input type="radio" name="gender"/checked>Male
			<input type="radio" name="gender"/>Female
			</td></tr>
			
			<input type="file"/>
			<tr>
				<td>Location</td>
				<td>
				<select name="location">
					<option value="">Select Location</option>
					<option value="Bangalore">Bangalore</option>
					<option value="Chennai">Chennai</option>
					<option value="Hyderabad">Hyderabad</option>
					<option value="Pune">Pune</option>
					<option value="Mumbai">Mumbai</option>
					<option value="Cochin">Cochin</option>
					<option value="Kolkata">Kolkata</option>
					<option value="New Delhi">New Delhi</option>
				</select>
				
				</td>
			</tr>
			<tr>
				<td>
					Comments
				</td>
				<td>
					<textarea name="comments">
					</textarea>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"/></td>
				<td><input type="reset" value="clear"/></td>
				<td></td>
			</tr>
		
		</table>
		</form>
	
</body>
</html>