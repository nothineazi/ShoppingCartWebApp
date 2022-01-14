<%--
  Created by IntelliJ IDEA.
  User: yasser
  Date: 12/01/2022
  Time: 00:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Page</title>
</head>
<body>

<table cellpadding="2" cellspacing="2" border="1">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Photo</th>
        <th>Price</th>
        <th>Buy</th>
    </tr>
    <c:forEach var="product" items="${products }">
        <tr>
            <td>${product.id }</td>
            <td>${product.name }</td>
            <td>
                <img src="${pageContext.request.contextPath }/assets/images/${product.photo }" width="120">
            </td>
            <td>${product.price }</td>
            <td align="center">
                <a href="${pageContext.request.contextPath }/cart?&action=buy&id=${product.id }">Buy</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
