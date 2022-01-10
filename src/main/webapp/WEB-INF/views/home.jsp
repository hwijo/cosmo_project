<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %> --%>
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
<style>
body {
	font-family: Arial;
	margin: 0;
}

* {
	box-sizing: border-box;
}

img {
	vertical-align: middle;
}

/* Position the image container (needed to position the left and right arrows) */
.container {
	position: relative;
}

/* Hide the images by default */
.mySlides {
	display: none;
}

/* Add a pointer when hovering over the thumbnail images */
.cursor {
	cursor: pointer;
}

/* Next & previous buttons */
.prev, .next {
	cursor: pointer;
	position: absolute;
	top: 40%;
	width: auto;
	padding: 16px;
	margin-top: -50px;
	color: white;
	font-weight: bold;
	font-size: 20px;
	border-radius: 0 3px 3px 0;
	user-select: none;
	-webkit-user-select: none;
}

/* Position the "next button" to the right */
.next {
	right: 0;
	border-radius: 3px 0 0 3px;
}

/* On hover, add a black background color with a little bit see-through */
.prev:hover, .next:hover {
	background-color: rgba(0, 0, 0, 0.8);
}

/* Number text (1/3 etc) */
.numbertext {
	color: #f2f2f2;
	font-size: 12px;
	padding: 8px 12px;
	position: absolute;
	top: 0;
}

/* Container for image text */
.caption-container {
	text-align: center;
	background-color: #222;
	padding: 2px 16px;
	color: white;
}

.row:after {
	content: "";
	display: table;
	clear: both;
}

/* Six columns side by side */
.column {
	float: left;
	width: 16.66%;
}

/* Add a transparency effect for thumnbail images */
.demo {
	opacity: 0.6;
}

.active, .demo:hover {
	opacity: 1;
}
</style>


<body>

<div class="work-area">
	<div class="container" style="padding : 50px;"align="center">
	    <h2>ようこそ！</h2>
	</div>
	
	<div class="form-group">
		<button	onclick = "location.href='/calendar' "class="btn btn-primary" style="float:right">예약하기</button>
	</div>

        <!-- 슬라이드 -->
		<div class="container">
 		    <c:forEach var="roomList" items="${roomList}">
			<div class="mySlides">
				<div class="numbertext"></div>
<!-- 				<img src="https://img.ddnayo.com/DataImage/0040/acb9c3229d2b4780a2d1adb72fc88cc1.jpg" style="width: 100%"> -->
				
				<p style="background-image: url(/WEB-INF/images/aa.jpg);"></p>
			</div>
            </c:forEach>
<!-- 			<div class="mySlides">
				<div class="numbertext">2 / 6</div>
				<img src="http://placehold.it/500x100" style="width: 100%">
			</div>

			<div class="mySlides">
				<div class="numbertext">3 / 6</div>
				<img src="http://placehold.it/500x100" style="width: 100%">
			</div>

			<div class="mySlides">
				<div class="numbertext">4 / 6</div>
				<img src="http://placehold.it/500x100" style="width: 100%">
			</div>

			<div class="mySlides">
				<div class="numbertext">5 / 6</div>
				<img src="http://placehold.it/500x100" style="width: 100%">
			</div>

			<div class="mySlides">
				<div class="numbertext">6 / 6</div>
				<img src="http://placehold.it/500x100" style="width: 100%">
			</div> -->

			<a class="prev" onclick="plusSlides(-1)">❮</a> 
			<a class="next" onclick="plusSlides(1)">❯</a>

			<div class="caption-container">
				<p id="caption"></p>
			</div>

			<div class="row">
			<c:forEach var="roomList" items="${roomList}">
				<div class="column">
					<img class="demo cursor" src="https://img.ddnayo.com/DataImage/0040/acb9c3229d2b4780a2d1adb72fc88cc1.jpg"
						style="width: 100%" onclick="currentSlide(${roomList.no})" alt="${roomList.roomTitle}">
				</div>
			</c:forEach>	
<!-- 			<div class="column">
					<img class="demo cursor" src="http://placehold.it/500x100"
						style="width: 100%" onclick="currentSlide(2)"
						alt="Trolltunga, Norway">
				</div>
				<div class="column">
					<img class="demo cursor" src="http://placehold.it/500x100"
						style="width: 100%" onclick="currentSlide(3)"
						alt="Mountains and fjords">
				</div>
				<div class="column">
					<img class="demo cursor" src="http://placehold.it/500x100"
						style="width: 100%" onclick="currentSlide(4)"
						alt="Northern Lights">
				</div>
				<div class="column">
					<img class="demo cursor" src="http://placehold.it/500x100"
						style="width: 100%" onclick="currentSlide(5)"
						alt="Nature and sunrise">
				</div>
				<div class="column">
					<img class="demo cursor" src="http://placehold.it/500x100"
						style="width: 100%" onclick="currentSlide(6)"
						alt="Snowy Mountains">
				</div> -->
			</div>
		</div>


		<!-- 공지사항 -->
		<div style="padding : 100px;">
	    <p>お知らせ</p>
		<table class="table table-striped table-hover table-bordered">
			<tr class="table-info text-center">
				<td class="col-sm-5">title</td>
				<td class="col-sm-1">date</td>
			</tr>
		

	    <c:forEach var="notice" items="${notice}">
		
			<tr>
				<td class="text-center"><a href="notice?no=${notice.no}">${notice.title}</a></td>
				<fmt:formatDate value="${notice.updatedAt}" pattern="yy-MM-dd"
					var="rewriteDate"></fmt:formatDate>
				<td class="text-center">${rewriteDate}</td>
			</tr>
		
    	</c:forEach>
	    </table>
	    	<div class="form-group">
				<button	onclick = "location.href='/insertNotice' "class="btn btn-primary" style="float:right">등록(관리자전용)</button>
			</div>
	    </div>

</div>

<script type="text/javascript">
    // 슬라이드
	var slideIndex = 1;
	showSlides(slideIndex);

	function plusSlides(n) {
		showSlides(slideIndex += n);
	}

	function currentSlide(n) {
		showSlides(slideIndex = n);
	}

	function showSlides(n) {
		var i;
		var slides = document.getElementsByClassName("mySlides");
		var dots = document.getElementsByClassName("demo");
		var captionText = document.getElementById("caption");
		if (n > slides.length) {
			slideIndex = 1
		}
		if (n < 1) {
			slideIndex = slides.length
		}
		for (i = 0; i < slides.length; i++) {
			slides[i].style.display = "none";
		}
		for (i = 0; i < dots.length; i++) {
			dots[i].className = dots[i].className.replace(" active", "");
		}
		slides[slideIndex - 1].style.display = "block";
		dots[slideIndex - 1].className += " active";
		captionText.innerHTML = dots[slideIndex - 1].alt;
	}
</script>


</body>
</html>


