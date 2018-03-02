package cn.monitor.modules.email.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.monitor.core.common.controller.BaseCRUDController;
import cn.monitor.core.security.shiro.authz.annotation.RequiresPathPermission;
import cn.monitor.modules.email.entity.EmailTemplate;

/**   
 * @Title: 邮件发送模板
 * @Description: 邮件发送模板
 * @author blue
 * @date 2017-06-10 07:46:14
 * @version V1.0   
 *
 */
@Controller
@RequestMapping("${admin.url.prefix}/email/emailtemplate")
@RequiresPathPermission("email:emailtemplate")
public class EmailTemplateController extends BaseCRUDController<EmailTemplate, String> {

}
