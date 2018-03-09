package org.apache.jsp.qiantai.rili;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class rili_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
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

    String[] weekdays={"","日","一","二","三","四","五","六"};
    String[] days=new String[42];
    for(int i=0;i<42;i++)
    	days[i]="";

    GregorianCalendar currentDay = new GregorianCalendar();
    int year= currentDay.get(Calendar.YEAR);
    int month=currentDay.get(Calendar.MONTH);
    int today=currentDay.get(Calendar.DAY_OF_MONTH);
    int weekday=currentDay.get(Calendar.DAY_OF_WEEK);
    
    String now=year+"年"+(month+1)+"月"+today+"日"+" 星期"+weekdays[weekday];
    
    Calendar thisMonth=Calendar.getInstance();
    thisMonth.set(Calendar.MONTH, month );
    thisMonth.set(Calendar.YEAR, year );
    thisMonth.setFirstDayOfWeek(Calendar.SUNDAY);
    thisMonth.set(Calendar.DAY_OF_MONTH,1);
    
    int firstIndex=thisMonth.get(Calendar.DAY_OF_WEEK)-1;
    int maxIndex=thisMonth.getActualMaximum(Calendar.DAY_OF_MONTH);
    for(int i=0;i<maxIndex;i++){
        days[firstIndex+i]=String.valueOf(i+1);
    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("      <title>简易万年历</title>\r\n");
      out.write("      <script type=\"text/javascript\">\r\n");
      out.write("        function showTime(showWhere){\r\n");
      out.write("            var now=new Date();\r\n");
      out.write("\t        var hour=now.getHours();\r\n");
      out.write("\t        var minu=now.getMinutes();\r\n");
      out.write("\t        var sec=now.getSeconds();\r\n");
      out.write("         \r\n");
      out.write("            if(hour<10) hour=\"0\"+hour;\r\n");
      out.write("         \tif(minu<10) minu=\"0\"+minu;\r\n");
      out.write("         \tif(sec<10) sec=\"0\"+sec;\r\n");
      out.write("         \t\r\n");
      out.write("         \tshowWhere.value=hour+\":\"+minu+\":\"+sec;\r\n");
      out.write("            setTimeout(\"showTime(time)\",1000)\r\n");
      out.write("        }\r\n");
      out.write("      </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body onload=\"showTime(time)\">\r\n");
      out.write("        <table width=\"170\" border=\"0\" align=\"center\" cellspacing=\"1\">            \r\n");
      out.write("            <tr height=\"25\" bgcolor=\"#F0F0F0\" align=\"center\" style=\"font-size: 12px;\">\r\n");
      out.write("                <td style=\"border:1 solid\">日</td>\r\n");
      out.write("                <td style=\"border:1 solid\">一</td>\r\n");
      out.write("                <td style=\"border:1 solid\">二</td>\r\n");
      out.write("                <td style=\"border:1 solid\">三</td>\r\n");
      out.write("                <td style=\"border:1 solid\">四</td>\r\n");
      out.write("                <td style=\"border:1 solid\">五</td>\r\n");
      out.write("                <td style=\"border:1 solid\">六</td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr height=\"4\"><td colspan=\"7\"></td></tr>\r\n");
      out.write("            ");
 for(int j=0;j<6;j++) { 
      out.write("\r\n");
      out.write("            <tr style=\"font-size: 12px;\">\r\n");
      out.write("                ");
 
                  for(int i=j*7;i<(j+1)*7;i++) { 
                      if((i-firstIndex+1)==today){
      out.write("    \r\n");
      out.write("                      <td width=\"30\" height=\"23\" align=\"center\" bgcolor=\"gray\" style=\"border:1 solid\"><font color=\"#FFFFFF\"><b>");
      out.print(days[i]);
      out.write("</b></font></td>\r\n");
      out.write("                ");
    }else{ 
      out.write("\r\n");
      out.write("                      <td width=\"30\" height=\"23\" align=\"center\" style=\"border:1 solid\">");
      out.print(days[i]);
      out.write("</td>\r\n");
      out.write("                ");
    }
                  }
      out.write("\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("    </body>\r\n");
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
