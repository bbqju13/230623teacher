/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-06-21 04:15:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/D:/_spring_workspace/_spring_project2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring_project2/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("jar:file:/D:/_spring_workspace/_spring_project2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring_project2/WEB-INF/lib/jstl-1.2.jar!/META-INF/fn.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1685681159057L));
    _jspx_dependants.put("jar:file:/D:/_spring_workspace/_spring_project2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/spring_project2/WEB-INF/lib/spring-security-taglibs-5.5.3.jar!/META-INF/security.tld", Long.valueOf(1634555638000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-security-taglibs-5.5.3.jar", Long.valueOf(1687137455178L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/header.jsp", out, false);
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/nav.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <main>\n");
      out.write("\n");
      out.write("	<!-- 현재 인증한 사용자의 정보를 가져오는 태그입니다. \n");
      out.write("	스프링 Security 구조대로 짰다면 손쉽게 태그를 이용해 가져올 수 있습니다. \n");
      out.write("아래와 같이 프로퍼티를 principal로 주고 변수에 담아주면 자바 코드에서 getProperty()를 실행한것과 동일합니다. \n");
      out.write("즉 사용자 정보를 담고 있는 UserDetails 객체가 반환됩니다. -->\n");
      if (_jspx_meth_sec_005fauthentication_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"py-5 text-center\">\n");
      out.write("      <img class=\"d-block mx-auto mb-4\" src=\"/resources/image/icons-hero.png\" alt=\"\" width=\"100\" height=\"80\">\n");
      out.write("      <h2>Product Register</h2>\n");
      out.write("      <p class=\"lead\">Below is an example form built entirely with Bootstrap’s form controls. Each required form group has a validation state that can be triggered by attempting to submit the form without completing it.</p>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"row g-5\">\n");
      out.write("      <div class=\"col-md-5 col-lg-4 order-md-last\">\n");
      out.write("        <h4 class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("          <span class=\"text-primary\">Your cart</span>\n");
      out.write("          <span class=\"badge bg-primary rounded-pill\">3</span>\n");
      out.write("        </h4>\n");
      out.write("        <ul class=\"list-group mb-3\">\n");
      out.write("          <li class=\"list-group-item d-flex justify-content-between lh-sm\">\n");
      out.write("            <div>\n");
      out.write("              <h6 class=\"my-0\">Product name</h6>\n");
      out.write("              <small class=\"text-muted\">Brief description</small>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"text-muted\">$12</span>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-group-item d-flex justify-content-between lh-sm\">\n");
      out.write("            <div>\n");
      out.write("              <h6 class=\"my-0\">Second product</h6>\n");
      out.write("              <small class=\"text-muted\">Brief description</small>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"text-muted\">$8</span>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-group-item d-flex justify-content-between lh-sm\">\n");
      out.write("            <div>\n");
      out.write("              <h6 class=\"my-0\">Third item</h6>\n");
      out.write("              <small class=\"text-muted\">Brief description</small>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"text-muted\">$5</span>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-group-item d-flex justify-content-between bg-light\">\n");
      out.write("            <div class=\"text-success\">\n");
      out.write("              <h6 class=\"my-0\">Promo code</h6>\n");
      out.write("              <small>EXAMPLECODE</small>\n");
      out.write("            </div>\n");
      out.write("            <span class=\"text-success\">−$5</span>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"list-group-item d-flex justify-content-between\">\n");
      out.write("            <span>Total (USD)</span>\n");
      out.write("            <strong>$20</strong>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("\n");
      out.write("        <form class=\"card p-2\">\n");
      out.write("          <div class=\"input-group\">\n");
      out.write("            <input type=\"text\" class=\"form-control\" placeholder=\"Promo code\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-secondary\">Redeem</button>\n");
      out.write("          </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("<!-- 상품등록란 시작 -->\n");
      out.write("      <div class=\"col-md-7 col-lg-8\">\n");
      out.write("        <h4 class=\"mb-3\">Input product information</h4>\n");
      out.write("        <form action=\"/board/register\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("          <div class=\"row g-3\">\n");
      out.write("          \n");
      out.write("          	<div class=\"col-12\">\n");
      out.write("              <label for=\"title\" class=\"form-label\">Title</label>\n");
      out.write("              <input type=\"text\" class=\"form-control\" name=\"title\"\n");
      out.write("               id=\"title\" placeholder=\"Title\">              \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("              <label for=\"email\" class=\"form-label\">Writer</label>\n");
      out.write("              <div class=\"input-group has-validation\">\n");
      out.write("                <span class=\"input-group-text\">@</span>\n");
      out.write("                <input type=\"email\" class=\"form-control\" name=\"writer\"\n");
      out.write("                id=\"writer\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${authEmail }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"Writer\">              \n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-12\">\n");
      out.write("              <label for=\"cont\" class=\"form-label\">Content</label>\n");
      out.write("              <textarea class=\"form-control\" name=\"content\"\n");
      out.write("               id=\"desc\" placeholder=\"Content\"></textarea>              \n");
      out.write("            </div>\n");
      out.write("			<div class=\"col-12 d-grid\">\n");
      out.write("  				<input class=\"form-control\" type=\"file\" style=\"display: none;\"\n");
      out.write("  				 id=\"files\" name=\"files\" multiple>\n");
      out.write("  				<button type=\"button\" id=\"trigger\" class=\"btn btn-outline-primary btn-block d-block\">Files Upload</button>\n");
      out.write("			</div>		\n");
      out.write("			<div class=\"col-12\" id=\"fileZone\">\n");
      out.write("				\n");
      out.write("			</div>\n");
      out.write("          <button class=\"w-100 btn btn-primary btn-lg my-5\" id=\"regBtn\" type=\"submit\">Continue to Register</button>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </main>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script src=\"/resources/js/board.register.js\"></script>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../common/footer.jsp", out, false);
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_sec_005fauthentication_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_005fauthentication_005f0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    boolean _jspx_th_sec_005fauthentication_005f0_reused = false;
    try {
      _jspx_th_sec_005fauthentication_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sec_005fauthentication_005f0.setParent(null);
      // /WEB-INF/views/board/register.jsp(16,0) name = property type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f0.setProperty("principal.mvo.email");
      // /WEB-INF/views/board/register.jsp(16,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_sec_005fauthentication_005f0.setVar("authEmail");
      int _jspx_eval_sec_005fauthentication_005f0 = _jspx_th_sec_005fauthentication_005f0.doStartTag();
      if (_jspx_th_sec_005fauthentication_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fsec_005fauthentication_0026_005fvar_005fproperty_005fnobody.reuse(_jspx_th_sec_005fauthentication_005f0);
      _jspx_th_sec_005fauthentication_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_sec_005fauthentication_005f0, _jsp_getInstanceManager(), _jspx_th_sec_005fauthentication_005f0_reused);
    }
    return false;
  }
}
