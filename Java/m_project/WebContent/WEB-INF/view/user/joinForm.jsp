<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<script>
	$(function(){
		$("#joinForm").on("submit", function (e) {
			console.log($("#joinForm").find(".is-invalid").length)
			if ($("#joinForm").find(".is-invalid").length > 0) {
				alert("형식에 맞게 입력해주세요.");
				$("#joinForm").find(".is-invalid").focus();
				e.preventDefault();
			}
		});
	})
</script>
<!-- Main content -->
<div class="content">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<div class="card card-info">
					<div class="card-header">
						<h3 class="card-title">Input Addon</h3>
					</div>
					<form method="post"
						action="<%=request.getContextPath()%>/insertUser.do" id="joinForm">
						<div class="card-body">
							<div class="input-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i
										class="fas fa-envelope"></i></span>
								</div>
								<input type="email" class="form-control" placeholder="email"
									name="email"> <span class="error invalid-feedback">이메일
									형식을 맞춰서 작성해주세요.</span>
							</div>
							<div class="input-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i
										class="fas fa-solid fa-key"></i></span>
								</div>
								<input type="password" class="form-control"
									placeholder="password" name="pass">
							</div>
							<div class="input-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i
										class="fas fa-solid fa-check"></i></span>
								</div>
								<input type="password" class="form-control"
									placeholder="check password">
							</div>
							<div class="input-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i
										class="fab fa-brands fa-kickstarter-k"></i></span>
								</div>
								<input type="text" class="form-control" placeholder="nickname"
									name="nick"> <span class="input-group-append">
									<button type="button" class="btn btn-info btn-flat">중복확인</button>
								</span>
							</div>
							<div class="input-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i
										class="fas fa-solid fa-user"></i></span>
								</div>
								<input type="text" class="form-control" placeholder="name"
									name="name">
							</div>
							<div class="input-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i
										class="fas fa-solid fa-calendar"></i></span>
								</div>
								<input type="text" class="form-control" placeholder="birth"
									name="bir">
							</div>
							<div class="input-group mb-3">
								<div class="input-group-prepend">
									<span class="input-group-text"><i
										class="fas fa-solid fa-venus-mars"></i></span>
								</div>
								<input type="text" class="form-control" placeholder="gender"
									name="bir">
							</div>
							<div class="input-group input-group-sm">
								<input type="text" class="form-control"> <span
									class="input-group-append">
									<button type="submit" class="btn btn-info btn-flat">Go!</button>
								</span>
							</div>
						</div>
					</form>
				</div>
			</div>
			<div class="col-md-3"></div>
		</div>
		<!-- /.row -->
	</div>
	<!-- /.container-fluid -->
</div>
<!-- /.content -->
<%@ include file="footer.jsp"%>