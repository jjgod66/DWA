<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../user/header.jsp" %>

<!-- Main content -->
<div class="content">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<div class="card card-primary">
					<div class="card-header">
						<h3 class="card-title">글작성</h3>
						<div class="card-tools">
							<button type="button" class="btn btn-tool"
								data-card-widget="collapse" title="Collapse">
								<i class="fas fa-minus"></i>
							</button>
						</div>
					</div>
					<form method="post" action="<%=request.getContextPath()%>/board/contentInsert.do">
						<div class="card-body">
							<div class="form-group">
								<label for="inputName">제목</label> 
								<input type="text" id="inputName" name="name" class="form-control" required>
							</div>
							<div class="form-group">
								<label for="inputDescription">내용</label>
								<textarea id="inputDescription" name="content" class="form-control" rows="4"></textarea>
							</div>
							<div>
								<button type="submit" class="btn btn-success btn-sm">등록</button>
								<button class="btn btn-default btn-sm" onclick="history.go(-1)">취소</button>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
</div>	

<%@ include file="../user/footer.jsp" %>