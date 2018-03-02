package cn.monitor.modules.sys.service.impl;

import cn.monitor.core.common.service.impl.CommonServiceImpl;
import cn.monitor.modules.sys.entity.UserLastOnline;
import cn.monitor.modules.sys.mapper.UserLastOnlineMapper;
import cn.monitor.modules.sys.service.IUserLastOnlineService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 最后在线情况
 * @Description: 最后在线情况
 * @author blue
 * @date 2017-05-15 08:18:21
 * @version V1.0   
 *
 */
@Transactional
@Service("userLastOnlineService")
public class UserLastOnlineServiceImpl  extends CommonServiceImpl<UserLastOnlineMapper,UserLastOnline> implements  IUserLastOnlineService {

}
