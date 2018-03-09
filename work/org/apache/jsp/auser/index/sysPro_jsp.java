package org.apache.jsp.auser.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import sun.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

public final class sysPro_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String path = request.getContextPath();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"pragma\" content=\"no-cache\" />\r\n");
      out.write("\t\t<meta http-equiv=\"cache-control\" content=\"no-cache\" />\r\n");
      out.write("\t\t<meta http-equiv=\"expires\" content=\"0\" />\r\n");
      out.write("\t\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\" />\r\n");
      out.write("\t\t<meta http-equiv=\"description\" content=\"This is my page\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.print(path );
      out.write("/css/base.css\" />\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body leftmargin=\"2\" topmargin=\"9\" background='");
      out.print(path );
      out.write("/images/allbg.gif'>\r\n");
      out.write("\t    <table width=\"98%\" align=\"center\" border=\"0\" cellpadding=\"4\" cellspacing=\"1\" bgcolor=\"#CBD8AC\" style=\"margin-bottom:8px\">\r\n");
      out.write("\t\t  <tr bgcolor=\"#EEF4EA\">\r\n");
      out.write("\t\t    <td colspan=\"2\" background=\"");
      out.print(path );
      out.write("/images/wbg.gif\" class='title'><span>系统基本信息</span></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">操作系统版本：</td>\r\n");
      out.write("\t\t    <td width=\"75%\" bgcolor=\"#FFFFFF\">");
      out.print(System.getProperty("os.name") );
      out.write("&nbsp;&nbsp;");
      out.print(System.getProperty("os.version") );
      out.write("</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">操作系统类型：</td>\r\n");
      out.write("\t\t    <td>");
      out.print(System.getProperty("os.arch") );
      out.write("<!-- x32,x86 --></td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">用户,目录,临时目录：</td>\r\n");
      out.write("\t\t    <td>");
      out.print(application.getRealPath("/"));
      out.write("</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">JDK版本：</td>\r\n");
      out.write("\t\t    <td>");
      out.print(System.getProperty("java.version") );
      out.write("</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">JKD安装目录：</td>\r\n");
      out.write("\t\t    <td>");
      out.print(System.getProperty("java.home") );
      out.write("</td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t  <tr bgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t    <td width=\"25%\" bgcolor=\"#FFFFFF\" align=\"right\">总内存/剩余内存：</td>\r\n");
      out.write("\t\t    <td>\r\n");
      out.write("                ");
 OperatingSystemMXBean osmb = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
      out.write("\r\n");
      out.write("\t\t\t\t<b>");
      out.print(osmb.getTotalPhysicalMemorySize() / 1024/1024 );
      out.write("</b>MB&nbsp;&nbsp;/&nbsp;&nbsp;<b>");
      out.print(osmb.getFreePhysicalMemorySize() / 1024/1024 );
      out.write("</b>MB\r\n");
      out.write("            </td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
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
