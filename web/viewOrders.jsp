<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> View Orders</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container" align="center">
<h1>Orders</h1>
<table class="table" style="color:white">
  <thead>
    <tr>
      <th scope="col">username</th>
      <th scope="col">total items</th>
      <th scope="col">total cost</th>
      <th scope="col">address</th>
      <th scope="col">phone no.</th>
    </tr>
  </thead>
  <tbody>
  <s:iterator value="orders" var="order">
    <tr>
      
      <td> <s:property  value="#order.userName"/></td>
      <td> <s:property  value="#order.totalItems"/></td>
      <td> <s:property  value="#order.totalCost"/></td>
      <td> <s:property  value="#order.address"/></td>
      <td> <s:property  value="#order.phoneNo"/></td>
    </tr>
    </s:iterator>
    </tbody>
    

</table>
</div>
</body>
</html>