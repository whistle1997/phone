<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="js/echarts.common.min.js"></script>
	<script type="text/javascript" src="js/jquery.min.js"></script>
	<script type="text/javascript">
		function getData(){
				var telephoneInfo = $("#telephoneInfo").val();
				if(!(/^1[34578]\d{9}$/.test(telephoneInfo))){ 
        			alert("手机号码有误，请重填"); 
        			$("#telephoneInfo").val(""); 
        			return false; 
    			} 
				$.ajax({
					type:"GET",
					url:"getLocal.do",
					data:{"num":encodeURI(telephoneInfo)},
					dataType:"json",
					contentType: "application/json;charset=UTF-8",
					success:function(rs){
						console.log(rs);
						var p = "<p>"+rs.msg+"</p>";
						$("#box").append(p);
					}
				})
			}
	</script>
	
  </head>
  
  <body>
    	<form>
    		输入电话号码:<input type="text" id="telephoneInfo" name="telephoneInfo">
    		<input type="button" onclick="getData()" value="开始查询">
    	</form>
    	
    	<div id="box"></div>
  </body>
</html>
