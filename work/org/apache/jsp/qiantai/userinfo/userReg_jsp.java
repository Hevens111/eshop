package org.apache.jsp.qiantai.userinfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class userReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t    <base target=\"_self\"/>\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\" />\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\" />\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\" />\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\" />\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\" />\r\n");
      out.write("\t\t<script language=\"javascript\">\r\n");
      out.write("            function closeOpen()\r\n");
      out.write("\t\t    {\r\n");
      out.write("\t\t       window.returnValue=false;\r\n");
      out.write("\t\t       window.close();\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    function check1()\r\n");
      out.write("\t\t    {\r\n");
      out.write("\t        \tif(document.form1.userName.value.length < 6)\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            alert(\"用户名不能小于6位\");\r\n");
      out.write("\t\t            return false;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        if(document.form1.userPw.value.length < 6)\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            alert(\"密码长度不能小于6位\");\r\n");
      out.write("\t\t            return false;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        if(document.form1.userPw.value!=document.form1.userPw1.value)\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            alert(\"两次密码不一致\");\r\n");
      out.write("\t\t            return false;\r\n");
      out.write("\t\t        }\r\n");
      out.write("\r\n");
      out.write("\t\t        if(document.form1.userTel.value !=\"\" && isMobile(document.form1.userTel.value)==false)\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            alert('请输入正确手机号码！');\r\n");
      out.write("\t\t            return false\r\n");
      out.write("\t\t        }\r\n");
      out.write("\t\t        if(document.form1.userEmail.value !=\"\" && emailYan(document.form1.userEmail.value)==false)\r\n");
      out.write("\t\t        {\r\n");
      out.write("\t\t            alert('请输入正确邮箱地址！');\r\n");
      out.write("\t\t            return false\r\n");
      out.write("\t\t        } \r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t  //校验手机号码：必须以数字开头，除数字外，可含有“-”\r\n");
      out.write("           function isMobile(phone)\r\n");
      out.write("           { \r\n");
      out.write("        \t   var ab=/^(13[0-9]|15[0|3|6|7|8|9]|18[8|9])\\d{8}$/;\r\n");
      out.write("\t\t\t\treturn ab.test(phone); \r\n");
      out.write("            }\r\n");
      out.write("\t           \r\n");
      out.write("\t\t    function emailYan(s)\r\n");
      out.write("\t\t    {\r\n");
      out.write("\t\t        var email=s;\r\n");
      out.write("\t\t\t    var pattern=/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+(\\.[a-zA-Z0-9_-])+/;\r\n");
      out.write("\t\t\t    var flag=pattern.test(email);\r\n");
      out.write("\t\t\t    if (flag)\r\n");
      out.write("\t\t\t    {\r\n");
      out.write("\t\t\t        return true;\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t\t    else\r\n");
      out.write("\t\t\t    {\r\n");
      out.write("\t\t\t         return false;\r\n");
      out.write("\t\t\t    }\r\n");
      out.write("\t\t    }\r\n");
      out.write("        </script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(path );
      out.write("/userReg.action\" name=\"form1\" method=\"post\">\r\n");
      out.write("\t\t\t\t<table width=\"98%\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"1\" bgcolor=\"#CCCCCC\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th height=\"40\" colspan=\"2\" bgcolor=\"#FFFFFF\" class=\"f12b-red\" style=\"font-size: 11px;\">\r\n");
      out.write("\t\t\t\t\t\t\t用 户 注 册\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th height=\"40\" colspan=\"2\" bgcolor=\"#FFFFFF\" class=\"f12b-red\" style=\"font-size: 11px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<font color=\"red\" style=\"font-size: 13px;\"> ");
 if( request.getAttribute("msg") != null ) out.print( request.getAttribute("msg") ); 
      out.write(" </font>\r\n");
      out.write("\t\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"20%\" height=\"30\" align=\"right\" bgcolor=\"#F9F9F9\" style=\"font-size: 11px;\">\r\n");
      out.write("\t\t\t\t\t\t\t用户名：\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td width=\"80%\" bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"userName\" id=\"userName\"/><font color=\"red\" style=\"font-size: 11px;\">(*用户名不能小于6位)</font>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"30\" align=\"right\" bgcolor=\"#F9F9F9\" style=\"font-size: 11px;\">\r\n");
      out.write("\t\t\t\t\t\t\t密 码：\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"userPw\"/><font color=\"red\" style=\"font-size: 11px;\">(*用户名不能小于6位)</font>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"30\" align=\"right\" bgcolor=\"#F9F9F9\" style=\"font-size: 11px;\">\r\n");
      out.write("\t\t\t\t\t\t\t密码确认：\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"password\" name=\"userPw1\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"30\" align=\"right\" bgcolor=\"#F9F9F9\" style=\"font-size: 11px;\">\r\n");
      out.write("\t\t\t\t\t\t\t真实姓名：\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"userRealname\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"30\" align=\"right\" bgcolor=\"#F9F9F9\" style=\"font-size: 11px;\">\r\n");
      out.write("\t\t\t\t\t\t\t住址：\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"userAddress\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"30\" align=\"right\" bgcolor=\"#F9F9F9\" style=\"font-size: 11px;\">\r\n");
      out.write("\t\t\t\t\t\t\t性别：\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"userSex\" value=\"男\" checked=\"checked\"/>男\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"radio\" name=\"userSex\" value=\"女\"/>女\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"30\" align=\"right\" bgcolor=\"#F9F9F9\" style=\"font-size: 11px;\">\r\n");
      out.write("\t\t\t\t\t\t\t手机号码：\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"userTel\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"30\" align=\"right\" bgcolor=\"#F9F9F9\" style=\"font-size: 11px;\">\r\n");
      out.write("\t\t\t\t\t\t\tE-mail：\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"userEmail\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"30\" align=\"right\" bgcolor=\"#F9F9F9\" style=\"font-size: 11px;\">\r\n");
      out.write("\t\t\t\t\t\t\tQQ：\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" name=\"userQq\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td height=\"30\" align=\"right\" bgcolor=\"#F9F9F9\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t<td bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t\t\t\t\t\t&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"submit\" value=\"确定\" onclick=\"return check1();\"/>\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"button\" value=\"取消\" onclick=\"closeOpen()\"/>\r\n");
      out.write("\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
