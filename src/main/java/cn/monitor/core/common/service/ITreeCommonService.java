package cn.monitor.core.common.service;

import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;

import cn.monitor.core.common.entity.tree.TreeNode;
import cn.monitor.core.query.data.Queryable;

public interface ITreeCommonService<T extends Serializable & TreeNode<ID>, ID extends Serializable>
		extends ICommonService<T> {
	public List<T> selectTreeList(Wrapper<T> wrapper);
    public List<T> selectTreeList(Queryable queryable,Wrapper<T> wrapper);
}