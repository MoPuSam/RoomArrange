package org.tysf.ts.servlet.base;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String methodName = req.getParameter("method");
		String path = "";
		if (methodName == null || "".equals(methodName)) {
			methodName = "excute";
		}
		try {
			path = (String) this.getClass().getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class).invoke(this, req, resp);
			if (path != null && !"".equals(path)) {
				req.getRequestDispatcher(path).forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String excute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		return "/jsp/index.jsp";
	}
}
