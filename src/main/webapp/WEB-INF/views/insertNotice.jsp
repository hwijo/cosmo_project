<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- 글 등록/수정 -->

<div class="work-area">	
　　　　   <div align="center">
          <h2>등록/수정</h2>
      </div>
			<form id="insertForm" name="insert" action="/insertNotice" method="post">
			<table class="table table-bordered">				
			    <tr>
					<td class="text-center"><strong>제목</strong></td>		
					<td colspan="3"><input type="text" required="required" id="title" name="title" class="col-sm-9 col-form-label"></td>		
				</tr>
				<tr>
					<td class="text-center align-middle"><strong>내용</strong></td>
					<td colspan="3"><textarea required="required" id="contents" name="contents" rows="7" class="col-sm-9 col-form-label"></textarea></td>
				</tr>
				
				</table>
				<div class="d-grid gap-2 col-6 mx-auto">
					<button type="submit" class="btn btn-primary float-right">등록</button>
				</div>		
			</form>


</div>


