<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Search Result</title>
 
    <style>
        tr:first-child{
            font-weight: bold;
            background-color: #C6C9C4;
        }
    </style>
 
</head>
 
 
<body>
    <h2>List of students</h2>  
    <table>
        <tr>
            <td>NAME</td><td>AGE</td><td>DATE OF JOINING</td><td>CURRENT YEAR</td><td></td>
        </tr>
        
            <tr>
            <td>${student.name}</td>
            <td>${student.age}</td>
            <td>${student.dateOfJoining}</td>
            <td>${student.currentYear}</td>
            </tr>
       
    </table>
    <br/>
    
</body>
</html>