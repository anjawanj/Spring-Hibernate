<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
        <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
            <title>Registration</title>
        </head>
        <body>
            <form:form id="regForm" modelAttribute="student" action="registerStudent" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="id">Student Id</form:label>
                        </td>
                        <td>
                            <form:input path="id" name="id" id="id" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="name">Name</form:label>
                        </td>
                        <td>
                            <form:input path="name" name="name" id="name" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="age">Age</form:label>
                        </td>
                        <td>
                            <form:input path="age" name="age" id="age" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="dateOfJoining">Date of Joining</form:label>
                        </td>
                        <td>
                            <form:input path="dateOfJoining" name="dateOfJoining" id="dateOfJoining" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="currentYear">Current Year</form:label>
                        </td>
                        <td>
                            <form:input path="currentYear" name="currentYear" id="currentYear" />
                        </td>
                    </tr>                    
                    <tr>
                        <td></td>
                        <td>
                            <form:button id="register" name="register">Register</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    <tr>
                        <td></td>
                        <td><a href="home.jsp">Home</a>
                        </td>
                    </tr>
                </table>
            </form:form>
        </body>
        </html>