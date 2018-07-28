<!DOCTYPE html>
<%@ page language="java" contentType="text/html" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="Header.jsp" %>


<c:forEach items="${productlist}" var="product">
<div class="row">
   
   <div class="col-sm-6 col-md-4">
      <div class="thumbnail">
      <h4>
      <span data-toggle="tooltip">${product.productName} &nbsp; Rs.${product.price}/-</span>
      </h4>
    <img src="<c:url value="/resources/images/${product.productId}.jpg"/>" width="100" height="100" alt = "Image not supported">
      <a href="<c:url value="/totalProductInfo/${product.productId}"/>" class="btn btn-primary col-xs-12" role="button">Show this product</a>
      <div class="clearfix"></div>
      
      </div>
      </div>
   </c:forEach> 

</body>
</html>
