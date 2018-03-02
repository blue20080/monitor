package cn.monitor.modules.email.dao;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import cn.monitor.core.disruptor.email.EmailDao;
import cn.monitor.core.disruptor.email.EmailData;
import cn.monitor.core.utils.StringUtils;
import cn.monitor.core.utils.email.EmailResult;
import cn.monitor.modules.email.entity.EmailSendLog;
import cn.monitor.modules.email.service.IEmailSendLogService;

/**
 * 
 *
 * 
 * @title: EmailDaoIml.java
 * @package cn.monitor.modules.email.dao
 * @description: 邮件信息返回
 * @author: blue
 * @date: 2017年6月8日 上午11:20:04
 * @version V1.0
 * @copyright: 2017 . All rights reserved.
 *
 */
public class EmailDaoIml implements EmailDao {
	@Autowired
	private IEmailSendLogService emailSendLogService;

	@Override
	public void doStart() {

	}

	@Override
	public void doSend(String eventId, EmailData emailData) {
		EmailSendLog emailSendLog = new EmailSendLog();
		emailSendLog.setId(eventId);
		emailSendLog.setBusinessType(emailData.getBusinessType());
		emailSendLog.setSubject(emailData.getSubject());
		emailSendLog.setContent(emailData.getContent());
		emailSendLog.setEmail(emailData.getEmail());
		emailSendLog.setSenddata(StringUtils.join(emailData.getDatas(), ","));
		emailSendLog.setStatus("0");
		emailSendLogService.insert(emailSendLog);
	}

	@Override
	public void doResult(String eventId, EmailData emailData, EmailResult emailResult) {
		EmailSendLog emailSendLog = emailSendLogService.selectById(eventId);
		emailSendLog.setMsg(emailResult.getMsg());
		if (emailResult.isSuccess()) {
			emailSendLog.setStatus("1");
		} else {
			emailSendLog.setStatus("0");
		}
		emailSendLog.setResponseDate(new Date());
		emailSendLogService.insertOrUpdate(emailSendLog);
	}

	@Override
	public void doShutdown() {

	}

}
