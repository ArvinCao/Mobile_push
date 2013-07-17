package org.esp.dispatcher;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.esp.config.EspConfig;
import org.esp.config.GlobalParams;

/**
 * 分发器用于处理特定后缀的拦截
 * 
 * @author Arvin
 * 
 */
public class ESPServlet extends HttpServlet {

	private Log log = LogFactory.getLog(ESPServlet.class);
	private final static String MOBILEPUSH = "MobilePush";
	private final static String WEBPUSH = "WebPush";
	private final static String KEEP_CONNECTION_TIME = "keepConnectionTime";
	private final static String DATATYPE = "DataType";
	private final static String FROM = "from";//发送方

	/**
	 * 初始化参数 读取servlet参数，并交予全局参数，对整个框架进行初始化
	 */
	@Override
	public void init(ServletConfig config) {
		log.info("初始化服务器推送...");
		try {
			super.init(config);
			String mobilepush = config.getInitParameter(MOBILEPUSH);
			String webpush = config.getInitParameter(WEBPUSH);
			String keepConnectionTime = config
					.getInitParameter(KEEP_CONNECTION_TIME);
			String dataType = config.getInitParameter("");
			if (mobilepush != null) {
				EspConfig.MOBILE_PUSH = Boolean.valueOf(mobilepush);
				log.info("开启移动推送方式...");
			}
			if (webpush != null) {
				EspConfig.WEB_PUSH = Boolean.valueOf(webpush);
				log.info("开启服务器推送方式...");
			}
			if (keepConnectionTime != null) {
				EspConfig.KEEP_CONNECTION_TIME = Long
						.valueOf(keepConnectionTime);
			}
			if(dataType !=null){
				EspConfig.DATA_TYPE = dataType;
				log.info("推送数据传输类型为"+dataType);
			}
		} catch (ServletException e) {
			e.printStackTrace();
			log.error("初始化服务器推送失败");
		}
		log.info("初始化服务器成功...");	
	}

	/**
	 * get请求
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	/**
	 * post请求 阻塞当前请求保持长连接
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if(!EspConfig.WEB_PUSH&&!EspConfig.MOBILE_PUSH){
			throw new RuntimeException("您未启用任何服务器推送方式");
		}
		int from =  (Integer) req.getAttribute(FROM);
	}

}
