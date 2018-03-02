package cn.monitor.modules.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.monitor.core.common.controller.BaseController;

/**
 * 
 *
 * 
 * @title: GridDemoController.java
 * @package cn.monitor.modules.demo.controller
 * @description: GridDemo
 * @author: blue
 * @date: 2017年5月18日 下午6:17:24
 * @version V1.0
 * @copyright: 2017 . All rights reserved.
 *
 */

@Controller
@RequestMapping("${admin.url.prefix}/demo/grid")
public class GridDemoController extends BaseController {

	/**
	 * 
	 * @title: list
	 * @description: 列表
	 * @return
	 * @return: String
	 */
	@RequestMapping("/list")
	public String list() {
		return display("list");
	}
	/**
	 * 
	 * @title: list
	 * @description: 列表
	 * @return
	 * @return: String
	 */
	@RequestMapping("/list_inline")
	public String listLline() {
		return display("list-inline");
	}

	 

}
