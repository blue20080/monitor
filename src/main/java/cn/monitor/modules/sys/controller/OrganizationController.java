package cn.monitor.modules.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.monitor.core.common.controller.BaseTreeController;
import cn.monitor.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.monitor.modules.sys.entity.Organization;

@Controller
@RequestMapping("${admin.url.prefix}/sys/organization")
@RequiresPathPermission("sys:organization")
public class OrganizationController extends BaseTreeController<Organization, String> {
	
}
