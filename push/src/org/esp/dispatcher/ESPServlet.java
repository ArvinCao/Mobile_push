package org.esp.dispatcher;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 分发器用于处理特定后缀的拦截
 * @author Arvin
 *
 */
public class ESPServlet extends HttpServlet{
	public final static String MOBILEPUSH = "MobilePush";
	//是否开启移动端推送
	public boolean canMoilePush;
	
	/**
	 * 初始化参数
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		String mobilepush = config.getInitParameter(MOBILEPUSH);
		canMoilePush = (!mobilepush.equals("")&&mobilepush!=null)?Boolean.valueOf(mobilepush):false;
	}

	/**
	 * get请求
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
		doPost(req,resp);
	}

	/**
	 * post请求
	 * 阻塞当前请求保持长连接
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
		
	}
	
	
	
}
