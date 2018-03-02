package cn.monitor.modules.sys.service.impl;

import cn.monitor.core.common.service.impl.CommonServiceImpl;
import cn.monitor.modules.sys.entity.RoleMenu;
import cn.monitor.modules.sys.mapper.RoleMenuMapper;
import cn.monitor.modules.sys.service.IRoleMenuService;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("roleMenuService")
public class RoleMenuServiceImpl extends CommonServiceImpl<RoleMenuMapper,RoleMenu> implements IRoleMenuService {

}
