<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select Meal</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid" align="center" style="color:white; background-color: black; min-height: 100vh">
<h1>Choose your yummy meal...</h1>

<div class="row">
<s:iterator value="productList" var="product">

<div class="col">
<s:a action="addToCart">
<s:param name="id" value="%{#product.productId}"/>

<div class="card m-3" style="background-color: black">
<div class="card-body">
<img height=200 width=200 src=<s:property value="#product.productImage"/>/>
</div> 
    <div class="card-footer">
     <s:property value="#product.productName"/><br/>
    Rs 
    <s:property value="#product.productPrice"/>/- 
   
    </div>
</div>
</s:a>
</div>
</s:iterator>
</div>
<a href="orderDetails">
Checkout
</a>
</div>


</body>
</html>