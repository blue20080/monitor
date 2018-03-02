package cn.monitor.modules.task.service;

import org.quartz.SchedulerException;

import cn.monitor.core.common.service.ICommonService;
import cn.monitor.modules.task.entity.ScheduleJob;

/**
 * @Title: 任务
 * @Description: 任务
 * @author blue
 * @date 2017-05-09 23:22:51
 * @version V1.0
 *
 */
public interface IScheduleJobService extends ICommonService<ScheduleJob> {
	/**
	 * 
	 * @title: initSchedule
	 * @description: 初始化任务
	 * @throws SchedulerException
	 * @return: void
	 */
	public void initSchedule() throws SchedulerException;

	/**
	 * 更改状态
	 * 
	 * @throws SchedulerException
	 */
	public void changeStatus(String jobId, String cmd) throws SchedulerException;

	/**
	 * 更改任务 cron表达式
	 * 
	 * @throws SchedulerException
	 */
	public void updateCron(String jobId) throws SchedulerException;
}
