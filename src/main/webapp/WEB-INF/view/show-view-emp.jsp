<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>



<body>

<h2>Congratulations on joining our club</h2>
<br>

<br>
<br>
<h1>You have joined our club here are your details:</h1>
<br><br>
<h3>Your Surname: ${employee.surname}</h3>
<br>
<h3>Your Name: ${employee.name}</h3>
<br>
<h3>Your Salary: ${employee.salary}</h3>
<br>
<h3>Your Department: ${employee.department}</h3>
<br>
<h3>Your Car: ${employee.car}</h3>
<br>
<h3>Your language(s):
<ul>
    <c:forEach var="lang" items="${employee.language}">
        <li> ${lang} </li>
    </c:forEach>
</ul></h3>
<br>
<h3>Your phone number: ${employee.phoneNumber}</h3>
<h3>Your email: ${employee.email}</h3>


Ну что? оценил?



</body>
</html>