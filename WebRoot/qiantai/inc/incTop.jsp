<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <style type="text/css">
        .Header {CLEAR: both; DISPLAY: block; FLOAT: left; BACKGROUND-IMAGE: url(<%=path %>/img/reservation01.jpg); WIDTH: 972px; POSITION: relative; HEIGHT: 100px}
        .Header .HeaderTop {HEIGHT: 60px}
    </style>
    <script language="JavaScript" src="<%=path %>/js/public.js" type="text/javascript"></script>
    <script type="text/javascript">
        function liuyanAll()
        {
            <s:if test="#session.user==null">
                  alert("请先登录");
            </s:if>
            
            <s:else>
			     var url="<%=path %>/liuyanAll.action";
			     window.open(url,"_blank");
            </s:else>
        }
        function userzhongxin()
        {
            <s:if test="#session.user==null">
                  alert("请先登录");
            </s:if>
            
            <s:else>
			     window.location.href="<%=path %>/qiantai/userinfo/userzhongxin.jsp";
            </s:else>
        }
        
        
        function myXinxi()
        {
            <s:if test="#session.user==null">
                  alert("请先登录");
            </s:if>
            
            <s:else>
                var url="<%=path %>/qiantai/userinfo/userXinxi.jsp";
                var n="";
                var w="480px";
                var h="500px";
                var s="resizable:no;help:no;status:no;scroll:yes";
			    openWin(url,n,w,h,s);
            </s:else>
        }
    </script>
  </head>
  
  <body>
	 <div align="center" class="Wrapper">
		 <div class="Header">
				<div class="HeaderTop">
				    <br/>
				    <font size="22px;">基于J2EE的校园二手交易系统</font>
				</div>
				<div id="Menu" class="Menu">
					<div id="fstMenu" class="fstMenu"></div>
					<div class="secMenu">
						<span id="secMenu0" class="secMenu-center">
						     <a href="<%=path %>/qiantai/default.jsp">首页</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
							 <a href="#" onclick="liuyanAll()">留言板</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
							 <a href="#" onclick="myXinxi()">我的信息</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
							 <a href="#" onclick="userzhongxin()">会员中心</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
							 <a target="_blank" href="<%=path %>/login.jsp">进入后台</a>
						</span>
					</div>
				</div>
		    </div>
        </div>	
  </body>
</html>
