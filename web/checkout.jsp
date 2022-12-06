<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checkout</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="style.css">
</head>
<body>
<h1>Kindly Confirm your order:</h1>
<div class="container" align="center">
<s:label value="Name:"/>
<s:property value="userName"/><br/>
<s:label value="Total Items:"/>
<s:property value="totalItems" /><br/>
<s:label value="Total Cost:"/>
<s:property value="totalCost" /><br/>


<s:form action="checkoutAction" >
<s:textfield  name="phoneNo" label="Phone No." /><br/>
<s:textarea name="address" label="Address" cols="50" row="3"/>
<s:submit value="checkout"/>
</s:form>
</div>
</body>
</html>