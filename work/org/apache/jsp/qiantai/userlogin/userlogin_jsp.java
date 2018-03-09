package org.apache.jsp.qiantai.userlogin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class userlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fs_005felse;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fs_005felse = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fs_005felse.release();
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

      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<script language=\"JavaScript\" src=\"");
      out.print(path );
      out.write("/js/public.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t        function reg()\r\n");
      out.write("\t        {\r\n");
      out.write("\t                var url=\"");
      out.print(path );
      out.write("/qiantai/userinfo/userReg.jsp\";\r\n");
      out.write("\t                var n=\"\";\r\n");
      out.write("\t                var w=\"480px\";\r\n");
      out.write("\t                var h=\"500px\";\r\n");
      out.write("\t                var s=\"resizable:no;help:no;status:no;scroll:yes\";\r\n");
      out.write("\t\t\t\t    openWin(url,n,w,h,s);\r\n");
      out.write("\t        }\r\n");
      out.write("\t        function login()\r\n");
      out.write("\t        {\r\n");
      out.write("\t           if(document.userLogin.userName.value==\"\")\r\n");
      out.write("\t           {\r\n");
      out.write("\t               alert(\"请输入用户名\");\r\n");
      out.write("\t               return;\r\n");
      out.write("\t           }\r\n");
      out.write("\t           if(document.userLogin.userPw.value==\"\")\r\n");
      out.write("\t           {\r\n");
      out.write("\t               alert(\"请输入密码\");\r\n");
      out.write("\t               return;\r\n");
      out.write("\t           }\r\n");
      out.write("\t           document.userLogin.submit();\r\n");
      out.write("\t        }\r\n");
      out.write("\t        \r\n");
      out.write("\t</script>\r\n");
      out.write("  </head>\r\n");
      out.write("  \r\n");
      out.write("  <body>\r\n");
      out.write("       ");
      //  s:if
      org.apache.struts2.views.jsp.IfTag _jspx_th_s_005fif_005f0 = (org.apache.struts2.views.jsp.IfTag) _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.get(org.apache.struts2.views.jsp.IfTag.class);
      _jspx_th_s_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005fif_005f0.setParent(null);
      // /qiantai/userlogin/userlogin.jsp(46,7) name = test type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_s_005fif_005f0.setTest("#session.user==null");
      int _jspx_eval_s_005fif_005f0 = _jspx_th_s_005fif_005f0.doStartTag();
      if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005fif_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005fif_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("\t\t\t<form action=\"");
          out.print(path );
          out.write("/userLogin.action\" name=\"userLogin\" method=\"post\">\r\n");
          out.write("\t\t\t      <table cellspacing=\"0\" cellpadding=\"0\" width=\"98%\" align=\"center\" border=\"0\">\r\n");
          out.write("\t\t\t          <tr>\r\n");
          out.write("\t\t\t            <td align=\"center\" colspan=\"2\" height=\"10\"></td>\r\n");
          out.write("\t\t\t          </tr>\r\n");
          out.write("\t\t\t          <tr>\r\n");
          out.write("\t\t\t            <td align=\"right\" width=\"31%\" height=\"30\" style=\"font-size: 11px;\">用户名：</td>\r\n");
          out.write("\t\t\t            <td align=\"left\" width=\"69%\"><input class=\"input\" id=\"userName\" title=\"用户名不能为空\" size=\"14\" name=\"userName\" type=\"text\" /></td>\r\n");
          out.write("\t\t\t          </tr>\r\n");
          out.write("\t\t\t          <tr>\r\n");
          out.write("\t\t\t            <td align=\"right\" height=\"30\" style=\"font-size: 11px;\">密　码：</td>\r\n");
          out.write("\t\t\t            <td align=\"left\"><input class=\"input\" title=\"密码不能为空\" type=\"password\" size=\"16\" name=\"userPw\"/></td>\r\n");
          out.write("\t\t\t          </tr>\r\n");
          out.write("\t\t\t          <tr>\r\n");
          out.write("\t\t\t            <td align=\"center\" colspan=\"2\" height=\"10\"><font color=\"red\">");
          if (_jspx_meth_s_005fproperty_005f0(_jspx_th_s_005fif_005f0, _jspx_page_context))
            return;
          out.write("</font></td>\r\n");
          out.write("\t\t\t          </tr>\r\n");
          out.write("\t\t\t          <tr>\r\n");
          out.write("\t\t\t            <td align=\"center\" colspan=\"2\" height=\"30\">\r\n");
          out.write("\t\t\t               &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t               <input type=\"button\" value=\"登  录\" onclick=\"login()\" style=\"border:#ccc 1px solid; background-color:#FFFFFF; font-size:12px; padding-top:3px;\" />\r\n");
          out.write("\t\t\t\t\t\t   &nbsp;\r\n");
          out.write("\t\t\t\t\t\t   <input type=\"button\" value=\"注  册\" onclick=\"reg()\" style=\"border:#ccc 1px solid; background-color:#FFFFFF; font-size:12px; padding-top:3px;\" />\r\n");
          out.write("\t\t\t            </td>\r\n");
          out.write("\t\t\t          </tr>\r\n");
          out.write("\t\t\t      </table>\r\n");
          out.write("\t\t    </form>\r\n");
          out.write("\t\t    ");
          int evalDoAfterBody = _jspx_th_s_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005fif_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fs_005fif_0026_005ftest.reuse(_jspx_th_s_005fif_005f0);
      out.write("\r\n");
      out.write("\t\t    ");
      //  s:else
      org.apache.struts2.views.jsp.ElseTag _jspx_th_s_005felse_005f0 = (org.apache.struts2.views.jsp.ElseTag) _005fjspx_005ftagPool_005fs_005felse.get(org.apache.struts2.views.jsp.ElseTag.class);
      _jspx_th_s_005felse_005f0.setPageContext(_jspx_page_context);
      _jspx_th_s_005felse_005f0.setParent(null);
      int _jspx_eval_s_005felse_005f0 = _jspx_th_s_005felse_005f0.doStartTag();
      if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_s_005felse_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_s_005felse_005f0.doInitBody();
        }
        do {
          out.write("\r\n");
          out.write("\t\t        <br/>\r\n");
          out.write("\t\t\t     欢迎您：");
          if (_jspx_meth_s_005fproperty_005f1(_jspx_th_s_005felse_005f0, _jspx_page_context))
            return;
          out.write(" &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t    <a href=\"");
          out.print(path );
          out.write("/userLogout.action\">安全退出</a> &nbsp;&nbsp;&nbsp;&nbsp;\r\n");
          out.write("\t\t\t    <br/><br/><br/>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_s_005felse_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_s_005felse_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_s_005felse_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fs_005felse.reuse(_jspx_th_s_005felse_005f0);
      out.write("\r\n");
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

  private boolean _jspx_meth_s_005fproperty_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f0 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f0.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005fif_005f0);
    // /qiantai/userlogin/userlogin.jsp(61,76) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f0.setValue("#request.error");
    int _jspx_eval_s_005fproperty_005f0 = _jspx_th_s_005fproperty_005f0.doStartTag();
    if (_jspx_th_s_005fproperty_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f0);
    return false;
  }

  private boolean _jspx_meth_s_005fproperty_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_s_005felse_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:property
    org.apache.struts2.views.jsp.PropertyTag _jspx_th_s_005fproperty_005f1 = (org.apache.struts2.views.jsp.PropertyTag) _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.get(org.apache.struts2.views.jsp.PropertyTag.class);
    _jspx_th_s_005fproperty_005f1.setPageContext(_jspx_page_context);
    _jspx_th_s_005fproperty_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_s_005felse_005f0);
    // /qiantai/userlogin/userlogin.jsp(76,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_s_005fproperty_005f1.setValue("#session.user.userName");
    int _jspx_eval_s_005fproperty_005f1 = _jspx_th_s_005fproperty_005f1.doStartTag();
    if (_jspx_th_s_005fproperty_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fs_005fproperty_0026_005fvalue_005fnobody.reuse(_jspx_th_s_005fproperty_005f1);
    return false;
  }
}
