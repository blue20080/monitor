package cn.monitor.modules.codegen.service;

import java.util.List;
import cn.monitor.core.common.service.ICommonService;
import cn.monitor.modules.codegen.entity.Column;

public interface IColumnService extends ICommonService<Column> {
	List<Column> selectListByTableId(String tableId);
}
