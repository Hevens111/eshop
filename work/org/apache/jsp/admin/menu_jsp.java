package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

String path = request.getContextPath();

      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<HTML>\r\n");
      out.write("\t<HEAD>\r\n");
      out.write("\t\t<TITLE></TITLE>\r\n");
      out.write("\t\t<META http-equiv=Content-Type content=\"text/html; charset=utf-8\">\r\n");
      out.write("\t\t<STYLE type=text/css>\r\n");
      out.write("\t\t\t.np\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tfont-family: Webdings;\r\n");
      out.write("\t\t\tfont-size:15px;\r\n");
      out.write("\t\t\tcolor:black;\r\n");
      out.write("\t\t\tcursor:hand;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tA:link { COLOR: #000000; FONT-SIZE: 15px; TEXT-DECORATION: none}\r\n");
      out.write("\t\t\tA:visited { COLOR: #000000; FONT-SIZE: 15px; TEXT-DECORATION: none}\r\n");
      out.write("\t\t\tA:hover { COLOR: #99d767; FONT-SIZE: 15px; TEXT-DECORATION: none}\r\n");
      out.write("\t\t\tBODY { FONT-SIZE: 15px; scrollbar-face-color:#F0F0E5; scrollbar-shadow-color:#000000; scrollbar-highlight-color:#000000; scrollbar-3dlight-color:#F0F0E5; scrollbar-darkshadow-color:#F0F0E5; scrollbar-track-color:#F0F0E5; scrollbar-arrow-color:#000000}\r\n");
      out.write("\t\t\tTD { FONT-SIZE: 15px; line-height: 150%}\r\n");
      out.write("\t  </style>\r\n");
      out.write("\t\t<SCRIPT language=javascript>\r\n");
      out.write("\t\t\tfunction switchSysBar()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif (switchPoint.innerText==3)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tswitchPoint.innerText=4\r\n");
      out.write("\t\t\t\t\tdocument.all(\"mnuList\").style.display=\"none\"\r\n");
      out.write("\t\t\t\t\ttop.content.cols=\"16,*\"\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\tswitchPoint.innerText=3\r\n");
      out.write("\t\t\t\t\tdocument.all(\"mnuList\").style.display=\"\" \r\n");
      out.write("\t\t\t\t\ttop.content.cols=\"166,*\" \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t    }\r\n");
      out.write("</SCRIPT>\r\n");
      out.write("\t</HEAD>\r\n");
      out.write("\t<BODY leftMargin=\"0\" topMargin=\"1\" marginheight=\"0\" marginwidth=\"0\"\r\n");
      out.write("\t\tbgcolor=\"#FFFFFF\">\r\n");
      out.write("\t\t<SCRIPT>\r\n");
      out.write("\t\t\tfunction showitem(id,name)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tif(name=='安全退出')\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\treturn (\"<span><a href='\"+id+\"' target=_top>\"+name+\"</a></span><br>\")\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\telse\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\treturn (\"<span><a href='\"+id+\"' target=main>\"+name+\"</a></span><br>\")\r\n");
      out.write("\t\t\t\t}\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction switchoutlookBar(number)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tvar i = outlookbar.opentitle;\r\n");
      out.write("\t\t\toutlookbar.opentitle=number;\r\n");
      out.write("\t\t\tvar id1,id2,id1b,id2b\r\n");
      out.write("\t\t\tif (number!=i && outlooksmoothstat==0){\r\n");
      out.write("\t\t\tif (number!=-1)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tif (i==-1)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tid2=\"blankdiv\";\r\n");
      out.write("\t\t\tid2b=\"blankdiv\";}\r\n");
      out.write("\t\t\telse{\r\n");
      out.write("\t\t\tid2=\"outlookdiv\"+i;\r\n");
      out.write("\t\t\tid2b=\"outlookdivin\"+i;\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+i).style.border=\"1px none navy\";\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+i).style.background=\"#99d767\";\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+i).style.color=\"#ffffff\";\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+i).style.textalign=\"center\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tid1=\"outlookdiv\"+number\r\n");
      out.write("\t\t\tid1b=\"outlookdivin\"+number\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+number).style.border=\"1px none white\";\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+number).style.background=\"#99d767\"; //title\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+number).style.color=\"#ffffff\";\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+number).style.textalign=\"center\";\r\n");
      out.write("\t\t\tsmoothout(id1,id2,id1b,id2b,0);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tdocument.all(\"blankdiv\").style.display=\"\";\r\n");
      out.write("\t\t\tdocument.all(\"blankdiv\").sryle.height=\"100%\";\r\n");
      out.write("\t\t\tdocument.all(\"outlookdiv\"+i).style.display=\"none\";\r\n");
      out.write("\t\t\tdocument.all(\"outlookdiv\"+i).style.height=\"0%\";\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+i).style.border=\"1px none navy\";\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+i).style.background=\"#99d767\";\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+i).style.color=\"#ffffff\";\r\n");
      out.write("\t\t\tdocument.all(\"outlooktitle\"+i).style.textalign=\"center\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction smoothout(id1,id2,id1b,id2b,stat)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tif(stat==0){\r\n");
      out.write("\t\t\ttempinnertext1=document.all(id1b).innerHTML;\r\n");
      out.write("\t\t\ttempinnertext2=document.all(id2b).innerHTML;\r\n");
      out.write("\t\t\tdocument.all(id1b).innerHTML=\"\";\r\n");
      out.write("\t\t\tdocument.all(id2b).innerHTML=\"\";\r\n");
      out.write("\t\t\toutlooksmoothstat=1;\r\n");
      out.write("\t\t\tdocument.all(id1b).style.overflow=\"hidden\";\r\n");
      out.write("\t\t\tdocument.all(id2b).style.overflow=\"hidden\";\r\n");
      out.write("\t\t\tdocument.all(id1).style.height=\"0%\";\r\n");
      out.write("\t\t\tdocument.all(id1).style.display=\"\";\r\n");
      out.write("\t\t\tsetTimeout(\"smoothout('\"+id1+\"','\"+id2+\"','\"+id1b+\"','\"+id2b+\"',\"+outlookbar.inc+\")\",outlookbar.timedalay);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tstat+=outlookbar.inc;\r\n");
      out.write("\t\t\tif (stat>100)\r\n");
      out.write("\t\t\tstat=100;\r\n");
      out.write("\t\t\tdocument.all(id1).style.height=stat+\"%\";\r\n");
      out.write("\t\t\tdocument.all(id2).style.height=(100-stat)+\"%\";\r\n");
      out.write("\t\t\tif (stat<100) \r\n");
      out.write("\t\t\tsetTimeout(\"smoothout('\"+id1+\"','\"+id2+\"','\"+id1b+\"','\"+id2b+\"',\"+stat+\")\",outlookbar.timedalay);\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tdocument.all(id1b).innerHTML=tempinnertext1;\r\n");
      out.write("\t\t\tdocument.all(id2b).innerHTML=tempinnertext2;\r\n");
      out.write("\t\t\toutlooksmoothstat=0;\r\n");
      out.write("\t\t\tdocument.all(id1b).style.overflow=\"auto\";\r\n");
      out.write("\t\t\tdocument.all(id2).style.display=\"none\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction getOutLine()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\toutline=\"<table \"+outlookbar.otherclass+\">\";\r\n");
      out.write("\t\t\tfor (i=0;i<(outlookbar.titlelist.length);i++)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\toutline+=\"<tr><td name=outlooktitle\"+i+\" id=outlooktitle\"+i+\" \"; \r\n");
      out.write("\t\t\tif (i!=outlookbar.opentitle) \r\n");
      out.write("\t\t\toutline+=\" nowrap align=center style='cursor:hand;background-color:#99d767;color:#ffffff;height:5;border:1 none navy' \";\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\toutline+=\" nowrap align=center style='cursor:hand;background-color:#99d767;color:white;height:5;border:1 none white' \";\r\n");
      out.write("\t\t\toutline+=outlookbar.titlelist[i].otherclass\r\n");
      out.write("\t\t\toutline+=\" onclick='switchoutlookBar(\"+i+\")'><span class=smallFont>\";\r\n");
      out.write("\t\t\toutline+=outlookbar.titlelist[i].title+\"</span></td></tr>\";\r\n");
      out.write("\t\t\toutline+=\"<tr><td name=outlookdiv\"+i+\" valign=top align=center id=outlookdiv\"+i+\" style='width:100%\"\r\n");
      out.write("\t\t\tif (i!=outlookbar.opentitle) \r\n");
      out.write("\t\t\toutline+=\";display:none;height:0%;\";\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\toutline+=\";display:;height:100%;\";\r\n");
      out.write("\t\t\toutline+=\"'><div name=outlookdivin\"+i+\" id=outlookdivin\"+i+\" style='overflow:auto;width:100%;height:100%'>\";\r\n");
      out.write("\t\t\tfor (j=0;j<outlookbar.itemlist[i].length;j++)\r\n");
      out.write("\t\t\toutline+=showitem(outlookbar.itemlist[i][j].key,outlookbar.itemlist[i][j].title);\r\n");
      out.write("\t\t\toutline+=\"</div></td></tr>\"\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\toutline+=\"</table>\"\r\n");
      out.write("\t\t\treturn outline\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction show()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tvar outline;\r\n");
      out.write("\t\t\toutline=\"<div id=outLookBarDiv name=outLookBarDiv style='width=100%;height:100%'>\"\r\n");
      out.write("\t\t\toutline+=outlookbar.getOutLine();\r\n");
      out.write("\t\t\toutline+=\"</div>\"\r\n");
      out.write("\t\t\tdocument.write(outline);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tfunction theitem(intitle,instate,inkey)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tthis.state=instate;\r\n");
      out.write("\t\t\tthis.otherclass=\" nowrap \";\r\n");
      out.write("\t\t\tthis.key=inkey;\r\n");
      out.write("\t\t\tthis.title=intitle;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction addtitle(intitle)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\toutlookbar.itemlist[outlookbar.titlelist.length]=new Array();\r\n");
      out.write("\t\t\toutlookbar.titlelist[outlookbar.titlelist.length]=new theitem(intitle,1,0);\r\n");
      out.write("\t\t\treturn(outlookbar.titlelist.length-1);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction additem(intitle,parentid,inkey)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tif (parentid>=0 && parentid<=outlookbar.titlelist.length)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\toutlookbar.itemlist[parentid][outlookbar.itemlist[parentid].length]=new theitem(intitle,2,inkey);\r\n");
      out.write("\t\t\toutlookbar.itemlist[parentid][outlookbar.itemlist[parentid].length-1].otherclass=\" nowrap align=left style='height:5' \";\r\n");
      out.write("\t\t\treturn(outlookbar.itemlist[parentid].length-1);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\telse\r\n");
      out.write("\t\t\tadditem=-1;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction outlook()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\tthis.titlelist=new Array();\r\n");
      out.write("\t\t\tthis.itemlist=new Array();\r\n");
      out.write("\t\t\tthis.divstyle=\"style='height:100%;width:100%;overflow:auto' align=center\";\r\n");
      out.write("\t\t\tthis.otherclass=\"border=0 cellspacing='0' cellpadding='0' style='height:100%;width:100%'valign=middle align=center \";\r\n");
      out.write("\t\t\tthis.addtitle=addtitle;\r\n");
      out.write("\t\t\tthis.additem=additem;\r\n");
      out.write("\t\t\tthis.starttitle=-1;\r\n");
      out.write("\t\t\tthis.show=show;\r\n");
      out.write("\t\t\tthis.getOutLine=getOutLine;\r\n");
      out.write("\t\t\tthis.opentitle=this.starttitle;\r\n");
      out.write("\t\t\tthis.reflesh=outreflesh;\r\n");
      out.write("\t\t\tthis.timedelay=50;\r\n");
      out.write("\t\t\tthis.inc=10;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction outreflesh()\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t    document.all(\"outLookBarDiv\").innerHTML=outlookbar.getOutLine();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tfunction locatefold(foldname)\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tfor (var i=0;i<outlookbar.titlelist.length;i++)\r\n");
      out.write("\t\t\t\tif(foldname==outlookbar.titlelist[i].title)\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t   outlookbar.starttitle=i;\r\n");
      out.write("\t\t\t\t   outlookbar.opentitle=i;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tvar outlookbar=new outlook();\r\n");
      out.write("\t\t\tvar tempinnertext1,tempinnertext2,outlooksmoothstat\r\n");
      out.write("\t\t\toutlooksmoothstat = 0;\r\n");
      out.write("\t    </SCRIPT>\r\n");
      out.write("\t\t<SCRIPT>\r\n");
      out.write("\t\t    document.write(\"<script src=");
      out.print(path );
      out.write("/admin/js/list_nav.js></\"+\"script>\");\r\n");
      out.write("\t\t</SCRIPT>\r\n");
      out.write("\t\t<table cellspacing=0 cellpadding=0 border=0 height=\"100%\" width=\"162\" align=\"left\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td id=mnuList>\r\n");
      out.write("\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\tlocatefold(\"系统属性\")\r\n");
      out.write("\t\t\t\t\t\toutlookbar.show() \r\n");
      out.write("\t\t\t\t    </script>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td width=\"15\" bgcolor=#FFFFFF background=\"");
      out.print(path );
      out.write("/img/menu_bg_02.gif\">\r\n");
      out.write("\t\t\t\t\t<table cellspacing=0 cellpadding=0 border=0>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td width=\"10\" align=middle valign=center>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"np\" id=\"switchPoint\" onClick=\"switchSysBar()\" title=\"\">3</span>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</BODY>\r\n");
      out.write("</HTML>\r\n");
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
