<%@page import="kr.or.dw.board.vo.ReplyVO"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="kr.or.dw.board.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../user/header.jsp" %>

<%
	BoardVO boardVo = (BoardVO)request.getAttribute("boardVo");
	List<ReplyVO> replyList = (List<ReplyVO>) request.getAttribute("replyList");
	DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	if(boardVo.getPic_path() != null){
		src = "/profilePath/" + boardVo.getPic_path();
	}
%>

<script>
	$(function(){
		
		function replyTemplate(reply) {
			let replySrc = "/profilePath/default/defaultProfile.jpg"; 
			if (reply.pic_path != null || reply.pic_path != "") {
				replySrc = "/profilePath/" + reply.pic_path;
			}
			
			
			$("#re_container").prepend(
				 '	<div class="row">'
				+'		<div class="col-md-4">'
				+'			<div class="user-block">'
				+'				<img class="img-circle img-bordered-sm" src="' + replySrc + '" alt="user image">'
				+'				<span class="username">'
				+'					<a href="#">' + reply.nick + '</a>'
				+'					<a href="#" class="float-right btn-tool">'
				+'						<i class="fas fa-times"></i>'
				+'					</a>'
				+'				</span>'
				+'				<span class="description">' + reply.re_wdt + '</span>'
				+'			</div>'
				+'		</div>'
				+'		<div class="col-md-8">'	+ reply.re_content + '</div>'
				+'	</div>'	
			);
		}
		
		$("#re_form").on("submit", function(e){
			e.preventDefault();
			
			let re_content = $("#re_form").find("input").val();
			let bd_no = "<%=boardVo.getBd_no()%>";
			$.ajax({
				url : "<%=request.getContextPath()%>/board/reply.do",
				dataType : "json",
				method : "post",
				data : {
					"bd_no" : bd_no,
					"re_content" : re_content
				},
				success : function(res){
					console.log(res);
					replyTemplate(res.reply);
				},
				error : function(){
					
				}
			});
		});
	});
</script>

<div class="content">
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-8">
				<div class="card card-primary card-outline">
					<div class="card-header">
						<h3><%= boardVo.getBd_title() %></h3>
					</div>

					<div class="card-body p-0">
						<div class="mailbox-read-info">
							<div class="image">
								<img style="width: 5%;" src="<%=src%>" class="img-circle elevation-2">
								<%= boardVo.getNick() %>
							</div>
							<h6>
								<span class="mailbox-read-time float-right"><%= boardVo.getBd_wdt() %></span>
							</h6>
						</div>

						<div class="mailbox-read-message">
							<p><%= boardVo.getBd_content() %></p>
						</div>

					</div>

					<div class="card-footer">
						<div class="float-right">
						<% if ( vo != null && boardVo.getUser_no() == vo.getUser_no() ) { %>
							<a type="button" class="btn btn-default btn-sm" href="<%= request.getContextPath()%>/board/deleteContent.do?bd_no=<%=boardVo.getBd_no()%>">
								<i class="far fa-trash-alt"></i> 삭제
							</a>
							<a type="button" class="btn btn-default btn-sm" href="<%= request.getContextPath()%>/board/boardInsert.do?bd_no=<%=boardVo.getBd_no()%>">
								<i class="fas fa-pen"></i> 수정
							</a>
						<% } %>
							<a type="button" class="btn btn-default btn-sm" href="<%= request.getContextPath()%>/board/boardMain.do">
								<i class="fas fa-reply"></i> 목록
							</a>
						</div>
						<hr>
						<p>
							<a href="#" class="link-black text-sm mr-2"><i class="fas fa-share mr-1"></i> Share</a>
							<a href="#" class="link-black text-sm"><i class="far fa-thumbs-up mr-1"></i> Like</a>
							<span class="float-right">
								<a href="#" class="link-black text-sm">
									<i class="far fa-comments mr-1"></i> Comments (5)
								</a>
							</span>
						</p>
						<form id="re_form">
							<input class="form-control form-control-sm" type="text" placeholder="Type a comment">
							<button type="submit" style="display:none;"></button>
						</form>
					</div>
				</div>
				<div class="card" id="re_container">
				
				<%
					for (ReplyVO replyVo : replyList) {
				%>
					<div class="row">
						<div class="col-md-4">
							<div class="user-block">
								<img class="img-circle img-bordered-sm" src="<%=replyVo.getPic_path() == null ? "/profilePath/default/defaultProfile.jpg" : "/profilePath/" + replyVo.getPic_path()%>" alt="user image">
								<span class="username">
									<a href="#"><%=replyVo.getNick() %></a>
									<a href="#" class="float-right btn-tool">
										<i class="fas fa-times"></i>
									</a>
								</span>
								<span class="description"><%=replyVo.getRe_wdt() %></span>
							</div>
						</div>
						<div class="col-md-8"><%=replyVo.getRe_content() %>
						</div><hr style="margin: 0;">
					</div>
				<% } %>	
				</div>
			</div>
			<div class="col-md-2"></div>
		</div>
	</div>
</div>

<%@ include file="../user/footer.jsp" %>