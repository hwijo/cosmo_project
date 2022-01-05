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
			<form id="createForm" name="create" action="/createNotice" method="post">
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
					<button type="button" onclick="writeSubmit()" class="btn btn-primary float-right">등록</button>
				</div>		
			</form>


</div>

<script type="text/javascript">
	//게시판 등록
	function writeSubmit(){

		//step2. 게시판 등록
		var params = {
			 title : $.trim($("#title").val())
			,contents : $.trim($("#contents").val())
			//,regId : $("#loginId").val()
			//,useYn : 'Y'
		}

        console.log(params);

		if(params.title == ""){
			alert("제목을 입력해주세요.");
			return false;
		}

		else if(params.contents == ""){
			alert("내용을 입력해주세요.");
			return false;
		}

		$.ajax({
	         type : 'POST'
	        ,url : "/createNotice"
	        ,dataType : 'json'
	        ,data : JSON.stringify(params)
	        ,contentType: 'application/json'
	        ,success : function(result) {
				alert("해당글이 정상적으로 등록되었습니다.");
				location.href="/";
	        },
	        error: function(request, status, error) {

	        }
	    })
	}
</script>

