<%
String path = request.getContextPath();
%>

<%@ page language="java" contentType="text/html; charset=GBK"
	pageEncoding="GBK"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=GBK">
		<title>支付宝即时到帐付款</title>
		<META content=网上购物/网上支付/安全支付/安全购物/购物，安全/支付,安全/支付宝/安全,支付/安全，购物/支付, 
name=description 在线 付款,收款 网上,贸易 网上贸易.>
<META content=网上购物/网上支付/安全支付/安全购物/购物，安全/支付,安全/支付宝/安全,支付/安全，购物/支付, name=keywords 
在线 付款,收款 网上,贸易 网上贸易.><LINK href="images/layout.css" 
type=text/css rel=stylesheet>

<SCRIPT language=JavaScript>
function CheckForm()
{
	if (document.alipayment.aliorder.value.length == 0) {
		alert("请输入商品名称.");
		document.alipayment.aliorder.focus();
		return false;
	}
	if (document.alipayment.alimoney.value.length == 0) {
		alert("请输入付款金额.");
		document.alipayment.alimoney.focus();
		return false;
	}
	var reg	= new RegExp(/^\d*\.?\d{0,2}$/);
	if (! reg.test(document.alipayment.alimoney.value))
	{
        alert("请正确输入付款金额");
		document.alipayment.alimoney.focus();
		return false;
	}
	if (Number(document.alipayment.alimoney.value) < 0.01) {
		alert("付款金额金额最小是0.01.");
		document.alipayment.alimoney.focus();
		return false;
	}

}  

</SCRIPT>

	</head>
<BODY text=#000000 bgColor=#ffffff leftMargin=0 topMargin=4>
<CENTER>

<TABLE cellSpacing=0 cellPadding=0 width=760 border=0>
  <TBODY>
  <TR>
    <TD class=title>支付宝即时到帐付款快速通道</TD>
  </TR></TBODY>
</TABLE><BR>
<FORM name=alipayment onSubmit="return CheckForm();" action="http://www.alipay.com" 
method=post>
<table>
 <tr>
   <td>
     <TABLE cellSpacing=0 cellPadding=0 width=740 border=0>
        <TR>
          <TD class=form-left>收款方： </TD>
          <TD class=form-star>* </TD>
          <TD class=form-right>&nbsp;</TD>
        </TR>
        <TR>
          <TD colspan="3" align="center"><HR width=600 SIZE=2 color="#999999"></TD>
        </TR>
        <TR>
          <TD class=form-left>标题： </TD>
          <TD class=form-star>* </TD>
          <TD class=form-right><INPUT size=30 name=aliorder maxlength="200"><span>如：7月5日定货款。</span></TD>
        </TR>
        <TR>
          <TD class=form-left>付款金额： </TD>
          <TD class=form-star>*</TD>
          <TD class=form-right><INPUT maxLength=10 size=30 name=alimoney onfocus="if(Number(this.value)==0){this.value='';}" value="00.00"/>
            <span>如：112.21</span></TD>
        </TR>
        <TR>
          <TD class=form-left>备注：</TD>
          <TD class=form-star></TD>
          <TD class=form-right><TEXTAREA name=alibody rows=2 cols=40 wrap="physical"></TEXTAREA><BR>
          （如联系方法，商品要求、数量等。100汉字内）</TD>
        </TR>
        <TR>
          <TD class=form-left>支付方式：</TD>
          <TD class=form-star></TD>
          <TD class=form-right>
               <table>
                 <tr>
                   <td><input type="radio" name="pay_bank" value="directPay" checked><img src="<%=path %>/images/alipay_1.gif" border="0"/></td>
                 </tr>
                 <tr>
                   <td><input type="radio" name="pay_bank" value="ICBCB2C"/><img src="<%=path %>/images/ICBC_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="CMB"/><img src="<%=path %>/images/CMB_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="CCB"/><img src="<%=path %>/images/CCB_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="BOCB2C"><img src="<%=path %>/images/BOC_OUT.gif" border="0"/></td>
                 </tr>
                 <tr>
                   <td><input type="radio" name="pay_bank" value="ABC"/><img src="<%=path %>/images/ABC_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="COMM"/><img src="<%=path %>/images/COMM_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="SPDB"/><img src="<%=path %>/images/SPDB_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="GDB"><img src="<%=path %>/images/GDB_OUT.gif" border="0"/></td>
                 </tr>
                 <tr>
                   <td><input type="radio" name="pay_bank" value="CITIC"/><img src="<%=path %>/images/CITIC_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="CEBBANK"/><img src="<%=path %>/images/CEB_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="CIB"/><img src="<%=path %>/images/CIB_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="SDB"><img src="<%=path %>/images/SDB_OUT.gif" border="0"/></td>
                 </tr>
                 <tr>
                   <td><input type="radio" name="pay_bank" value="CMBC"/><img src="<%=path %>/images/CMBC_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="HZCBB2C"/><img src="<%=path %>/images/HZCB_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="SHBANK"/><img src="<%=path %>/images/SHBANK_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="NBBANK "><img src="<%=path %>/images/NBBANK_OUT.gif" border="0"/></td>
                 </tr>
                 <tr>
                   <td><input type="radio" name="pay_bank" value="SPABANK"/><img src="<%=path %>/images/SPABANK_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="BJRCB"/><img src="<%=path %>/images/BJRCB_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="ICBCBTB"/><img src="<%=path %>/images/ENV_ICBC_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="CCBBTB"/><img src="<%=path %>/images/ENV_CCB_OUT.gif" border="0"/></td>
                 </tr>
                 <tr>
                   <td><input type="radio" name="pay_bank" value="SPDBB2B"/><img src="<%=path %>/images/ENV_SPDB_OUT.gif" border="0"/></td>
                   <td><input type="radio" name="pay_bank" value="ABCBTB"/><img src="<%=path %>/images/ENV_ABC_OUT.gif" border="0"/></td>
				   <td><input type="radio" name="pay_bank" value="fdb101" /><img src="<%=path %>/images/FDB_OUT.gif" border="0" /></td>
				   <td><input type="radio" name="pay_bank" value="PSBC-DEBIT" /><img src="<%=path %>/images/PSBC_OUT.gif" border="0" /></td>
                 </tr>
               </table>
          </TD>
        </TR>
         <TR>
          <TD class=form-left></TD>
          <TD class=form-star></TD>
          <TD class=form-right><INPUT type=image 
            src="<%=path %>/images/button_sure.gif" value=确认订单 
            name=nextstep></TD>
        </TR>
</TABLE>
   </td>
   <td vAlign=top width=205 style="font-size:12px;font-family:'宋体'">
   <span id="glowtext">小贴士：</span>
   </td>
 </tr>
</table>

</FORM>

<TABLE cellSpacing=1 width=760 border=0>
  <TR>
    <TD><FONT class=note-help>如果您点击“购买”按钮，即表示您已经接受“支付宝服务协议”，同意向卖家购买此物品。 
      <BR>
      您有责任查阅完整的物品登录资料，包括卖家的说明和接受的付款方式。卖家必须承担物品信息正确登录的责任！ 
  </FONT>
 </TD>
 </TR>
</TABLE>

<TABLE cellSpacing=0 cellPadding=0 width=760 align=center border=0>
  <TR align=middle>
    <TD class="txt12 lh15"><A href="http://china.alibaba.com/" 
      target=_blank>阿里巴巴旗下公司</A> | 支付宝版权所有 2004-2012</TD>
  </TR>
  <TR align=middle>
    <TD class="txt12 lh15"><IMG alt="支付宝通过“国际权威安全认证” " 
      src="<%=path %>/images/logo_vbvv.gif" border=0><BR>支付宝通过“国际权威安全 
  认证”
    </TD>
  </TR>
</TABLE>
</BODY>
</html>
