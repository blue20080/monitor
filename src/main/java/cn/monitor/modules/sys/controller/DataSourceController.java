package cn.monitor.modules.sys.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.monitor.core.common.controller.BaseCRUDController;
import cn.monitor.core.model.AjaxJson;
import cn.monitor.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.monitor.modules.sys.data.SysDatabaseEnum;
import cn.monitor.modules.sys.entity.DataSource;

/**
 * @Title: 数据源
 * @Description: 数据源
 * @author blue
 * @date 2017-05-10 12:01:57
 * @version V1.0
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/sys/datasource")
@RequiresPathPermission("sys:datasource")
public class DataSourceController extends BaseCRUDController<DataSource, String> {

	@RequestMapping(value = "dataSourceParameter")
	@ResponseBody
	public AjaxJson dataSourceParameter(@RequestParam String dbType) {
		AjaxJson j = new AjaxJson();
		SysDatabaseEnum sysDatabaseEnum = SysDatabaseEnum.toEnum(dbType);

		if (sysDatabaseEnum != null) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("driverClass", sysDatabaseEnum.getDriverClass());
			map.put("url", sysDatabaseEnum.getUrl());
			map.put("dbtype", sysDatabaseEnum.getDbtype());
			j.setData(map);
		} else {
			j.setData(null);
		}
		return j;
	}
}
