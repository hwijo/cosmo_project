<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<div>
	<c:forEach var="notice" items="${notice}">
		<table>
			<tr>
				<td>${notice.no}</td>
				<td>${notice.title}</td>
				<fmt:formatDate value="${notice.createdAt}" pattern="yy-MM-dd"
					var="writeDate"></fmt:formatDate>
				<td>${createdAt}</td>
			</tr>
		</table>
	</c:forEach>
	

</div>
<script type="text/javascript">

$(document).ready(function(){
	console.log("${notice}");
    $.ajax({
        url: "<c:url value="/find" />",
        type: "get",
        data: JSON.stringify(${notice}),
        dataType: "json",
        contentType: "application/json",
        success: function(data) {
            alert("성공");
        },
        error: function(errorThrown) {
            alert(errorThrown.statusText);
        }
    });
});

</script>
</body>
</html>
