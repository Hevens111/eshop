package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=utf-8");
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
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'login1.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("        body {margin-left: 0px;margin-top: 0px;margin-right: 0px;margin-bottom: 0px;overflow:hidden;}\r\n");
      out.write("        .STYLE3 {font-size: 12px; color: #adc9d9; }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/interface/loginService.js'></script>\r\n");
      out.write("    <script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/engine.js'></script>\r\n");
      out.write("    <script type='text/javascript' src='");
      out.print(path );
      out.write("/dwr/util.js'></script>\r\n");
      out.write("    <script language=\"javascript\">\r\n");
      out.write("\t\t function denglu()\r\n");
      out.write("\t\t {                                                                                         \r\n");
      out.write("\t\t     if(document.ThisForm.userName.value==\"\")\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t \talert(\"请输入用户名\");\r\n");
      out.write("\t\t\t\tdocument.ThisForm.userName.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t if(document.ThisForm.userPw.value==\"\")\r\n");
      out.write("\t\t\t {\r\n");
      out.write("\t\t\t \talert(\"请输入密码\");\r\n");
      out.write("\t\t\t\tdocument.ThisForm.userPw.focus();\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t }\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t document.getElementById(\"indicator\").style.display=\"block\";\r\n");
      out.write("\t\t\t loginService.login(document.ThisForm.userName.value,document.ThisForm.userPw.value,0,callback);\r\n");
      out.write("\t\t }\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t function callback(data)\r\n");
      out.write("\t\t {\r\n");
      out.write("\t\t    document.getElementById(\"indicator\").style.display=\"none\";\r\n");
      out.write("\t\t    if(data==\"no\")\r\n");
      out.write("\t\t    {\r\n");
      out.write("\t\t        alert(\"用户名或密码错误\");\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    if(data==\"yes\")\r\n");
      out.write("\t\t    {\r\n");
      out.write("\t\t        alert(\"通过验证,系统登录成功\");\r\n");
      out.write("\t\t        window.location.href=\"");
      out.print(path );
      out.write("/loginSuccess.jsp\";\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t }\r\n");
      out.write("     </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("  <table width=\"100%\"  height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t     <td bgcolor=\"#1075b1\">&nbsp;</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("      <tr>\r\n");
      out.write("         <td height=\"608\" background=\"images/login_03.gif\">\r\n");
      out.write("\t\t    <form name=\"ThisForm\" method=\"POST\" action=\"\">\r\n");
      out.write("\t\t    <table width=\"847\" border=\"0\" align=\"center\" cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t\t           <td height=\"318\" background=\"");
      out.print(path );
      out.write("/images/login_04.gif\">&nbsp;</td>\r\n");
      out.write("\t\t        </tr>\r\n");
      out.write("\t\t        <tr>\r\n");
      out.write("\t               <td height=\"84\">\r\n");
      out.write("\t                   <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t                      <tr>\r\n");
      out.write("\t               \t\t\t <td width=\"381\" height=\"84\" background=\"");
      out.print(path );
      out.write("/images/login_06.gif\">&nbsp;</td>\r\n");
      out.write("\t                         <td width=\"162\" valign=\"middle\" background=\"");
      out.print(path );
      out.write("/images/login_07.gif\">\r\n");
      out.write("\t                             <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t                <tr>\r\n");
      out.write("\t\t\t\t\t\t                   <td width=\"44\" height=\"24\" valign=\"bottom\"><div align=\"right\"><span class=\"STYLE3\">用户:</span></div></td>\r\n");
      out.write("\t\t\t\t\t\t                   <td width=\"10\" valign=\"bottom\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t                   <td height=\"24\" colspan=\"2\" valign=\"bottom\">\r\n");
      out.write("\t\t\t\t\t\t\t                  <div align=\"left\">\r\n");
      out.write("\t\t\t\t\t\t\t                    <input type=\"text\" name=\"userName\" id=\"textfield\" style=\"width:100px; height:17px; background-color:#87adbf; border:solid 1px #153966; font-size:12px; color:#283439; \">\r\n");
      out.write("\t\t\t\t\t\t\t                  </div>\r\n");
      out.write("\t\t\t\t\t\t                   </td>\r\n");
      out.write("\t\t\t\t\t\t                </tr>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("\t\t\t\t\t\t\t                <td height=\"24\" valign=\"bottom\"><div align=\"right\"><span class=\"STYLE3\">密码:</span></div></td>\r\n");
      out.write("\t\t\t\t\t\t\t                <td width=\"10\" valign=\"bottom\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t\t\t                <td height=\"24\" colspan=\"2\" valign=\"bottom\"><input type=\"password\" name=\"userPw\" id=\"textfield2\" style=\"width:100px; height:17px; background-color:#87adbf; border:solid 1px #153966; font-size:12px; color:#283439; \"></td>\r\n");
      out.write("\t\t\t\t\t\t                </tr>\r\n");
      out.write("\t\t\t\t\t\t                \r\n");
      out.write("\t\t\t\t\t\t               \r\n");
      out.write("                                 </table>\r\n");
      out.write("                             </td>\r\n");
      out.write("                             <td width=\"26\"><img src=\"images/login_08.gif\" width=\"26\" height=\"84\"></td>\r\n");
      out.write("                             <td width=\"67\" background=\"images/login_09.gif\">\r\n");
      out.write("                                 <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t\t\t\t\t              <tr>\r\n");
      out.write("\t\t\t\t\t\t                <td height=\"25\"><div align=\"center\"><img src=\"images/dl.gif\" width=\"57\" height=\"20\" onclick=\"denglu()\"></div></td>\r\n");
      out.write("\t\t\t\t\t\t              </tr>\r\n");
      out.write("\t\t\t\t\t\t              <tr>\r\n");
      out.write("\t\t\t\t\t\t                <td height=\"25\"><div align=\"center\"><img src=\"images/cz.gif\" width=\"57\" height=\"20\" onclick=\"chongzhi()\"></div></td>\r\n");
      out.write("\t\t\t\t\t\t              </tr>\r\n");
      out.write("                                 </table>\r\n");
      out.write("                             </td>\r\n");
      out.write("                             <td width=\"211\" background=\"images/login_10.gif\"></td>\r\n");
      out.write("                          </tr>\r\n");
      out.write("                       </table>\r\n");
      out.write("                   </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                   <td height=\"206\" background=\"images/login_11.gif\">\r\n");
      out.write("                       <table>\r\n");
      out.write("                           <tr>\r\n");
      out.write("                              <td width=\"450\"></td>\r\n");
      out.write("                              <td><img id=\"indicator\" src=\"");
      out.print(path );
      out.write("/images/loading.gif\" style=\"display:none\"/></td>\r\n");
      out.write("                           </tr>\r\n");
      out.write("                       </table>\r\n");
      out.write("                   </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            </form>\r\n");
      out.write("         </td>\r\n");
      out.write("      </tr>\r\n");
      out.write("\t  <tr>\r\n");
      out.write("\t     <td bgcolor=\"#152753\">&nbsp;</td>\r\n");
      out.write("\t  </tr>\r\n");
      out.write("  </table>\r\n");
      out.write("  </body>\r\n");
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
