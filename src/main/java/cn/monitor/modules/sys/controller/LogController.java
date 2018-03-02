package cn.monitor.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.monitor.core.common.controller.BaseCRUDController;
import cn.monitor.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.monitor.modules.sys.entity.Log;

/**
 * 
 *
 * 
 * @title: 系统日志
 * @package cn.monitor.modules.sys.controller
 * @description: 系统日志
 * @author: blue
 * @date: 2017年5月29日 下午11:35:26
 * @version V1.0
 * @copyright: 2017 . All rights reserved.
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/sys/log")
@RequiresPathPermission("sys:log")
public class LogController extends BaseCRUDController<Log, String> {

}
