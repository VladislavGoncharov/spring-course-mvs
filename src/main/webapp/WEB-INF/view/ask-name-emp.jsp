<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>


<body>

<h2> Write your name </h2>
<br>

<form:form action="showViewEmployee" modelAttribute="employee">

    Name: <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname: <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary: <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department: <form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>
    <br><br>
    Car: <form:radiobuttons path="car" items="${employee.carBrand}"/>
    <br><br>
    Language:
    EN <form:checkbox path="language" value="English"/>
    RU <form:checkbox path="language" value="Russian"/>
    DE <form:checkbox path="language" value="Deutsch"/>
    ES <form:checkbox path="language" value="Espanol"/>
    <br><br>
    Phone number: <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email: <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    <input type="submit" value="Continue">


</form:form>

</body>
</html>