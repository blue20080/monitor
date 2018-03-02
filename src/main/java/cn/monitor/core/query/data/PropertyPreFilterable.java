package cn.monitor.core.query.data;

import com.alibaba.fastjson.serializer.SerializeFilter;

/**
 * 
 *
 * 
 * @title: PropertyPreFilterable.java
 * @package cn.monitor.core.query.data
 * @description: JSON格式化输出
 * @author: blue
 * @date: 2017年5月1日 下午9:43:09
 * @version V1.0
 * @copyright: 2017 . All rights reserved.
 *
 */
public interface PropertyPreFilterable {
	
	public SerializeFilter constructFilter(Class<?> clazz);
	
	public void addQueryProperty(String... properties);
	
	public void addIncludeFilter(Class<?> clazz, String... properties);

	public void addExcludeFilter(Class<?> clazz, String... properties);
}
