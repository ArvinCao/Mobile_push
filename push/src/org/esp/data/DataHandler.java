package org.esp.data;

/**
 * 数据处理接口
 * 负责数据的封装与解析
 * @author Arvin
 *
 */
public interface DataHandler {
	
	/**
	 * 封装数据
	 * @param obj需要被封装的数据
	 */
	public void encapsulationData(Object obj);
	
	/**
	 * 解析数据
	 * @param obj 需要被解析的数据
	 * @return 一个解析完的数据
	 */
	public Object parseData(Object obj);
	
	/**
	 * 获取数据
	 * @return
	 */
	public Object getData();
	
}
