package cn.monitor.modules.sms.service.impl;

import cn.monitor.core.common.service.impl.CommonServiceImpl;
import cn.monitor.modules.sms.entity.SmsTemplate;
import cn.monitor.modules.sms.mapper.SmsTemplateMapper;
import cn.monitor.modules.sms.service.ISmsTemplateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Title: 短信模版
 * @Description: 短信模版
 * @author blue
 * @date 2017-06-08 10:50:52
 * @version V1.0
 *
 */
@Transactional
@Service("smsTemplateService")
public class SmsTemplateServiceImpl extends CommonServiceImpl<SmsTemplateMapper,SmsTemplate> implements ISmsTemplateService {
}
