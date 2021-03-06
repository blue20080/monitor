package cn.monitor.modules.sys.service.impl;

import cn.monitor.core.common.service.impl.CommonServiceImpl;
import cn.monitor.modules.sys.entity.UserRole;
import cn.monitor.modules.sys.mapper.UserRoleMapper;
import cn.monitor.modules.sys.service.IUserRoleService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("userRoleService")
public class UserRoleServiceImpl extends CommonServiceImpl<UserRoleMapper,UserRole> implements IUserRoleService {

}
