package org.esp.data;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.esp.config.GlobalParams;
import org.esp.data.impl.JsonDataHandler;

/**
 * 用于数据处理类的创建,单例模式
 * 
 * @author Arvin
 * 
 */
public class DataHandlerFactory {
	private DataHandlerFactory dataHandlerFactory;
	private static Log log = LogFactory.getLog(DataHandlerFactory.class);
	
	/**
	 * 私有构造器
	 */
	private DataHandlerFactory() {
		log.info("创建数据工厂...");
	}
	
	/**
	 * 创建数据处理类的工厂
	 * @return
	 */
	public DataHandlerFactory create(){
		if(dataHandlerFactory!=null){
			return dataHandlerFactory;
		}
		dataHandlerFactory = new DataHandlerFactory();
		return dataHandlerFactory;
	}
	
	/**
	 * 根据参数类型，返回指定参数类型的处理类
	 * @param dataType
	 * @return
	 */
	public DataHandler getDataHandler(String dataType){
		if(dataType.equals(GlobalParams.DATA_JSON)){
			return new JsonDataHandler();
		}
		if(dataType.equals(GlobalParams.DATA_PROTOBUF)){
			
		}
		return new JsonDataHandler();
	}
}
