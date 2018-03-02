package cn.monitor.modules.sys.service.impl;

import cn.monitor.core.common.service.impl.TreeCommonServiceImpl;
import cn.monitor.modules.sys.entity.Organization;
import cn.monitor.modules.sys.mapper.OrganizationMapper;
import cn.monitor.modules.sys.service.IOrganizationService;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("organizationService")
public class OrganizationServiceImpl extends TreeCommonServiceImpl<OrganizationMapper, Organization, String>
		implements IOrganizationService {

	@Override
	public List<Organization> findListByUserId(String userid) {
		return baseMapper.findListByUserId(userid);
	}

}
