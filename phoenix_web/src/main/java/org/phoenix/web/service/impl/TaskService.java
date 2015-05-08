package org.phoenix.web.service.impl;

import javax.annotation.Resource;

import org.phoenix.basic.paging.Pager;
import org.phoenix.web.dao.ITaskDao;
import org.phoenix.web.dto.TaskStatusType;
import org.phoenix.web.model.TaskModel;
import org.phoenix.web.service.ITaskService;
import org.springframework.stereotype.Service;

/**
 * 任务服务实现
 * @author mengfeiyang
 *
 */
@Service
public class TaskService implements ITaskService{
	private ITaskDao taskDao;

	public ITaskDao getTaskDao() {
		return taskDao;
	}
    @Resource
	public void setTaskDao(ITaskDao taskDao) {
		this.taskDao = taskDao;
	}

	@Override
	public void add(TaskModel taskModel) {
		taskDao.add(taskModel);
	}

	@Override
	public void delete(int id) {
		taskDao.delete(id);
	}

	@Override
	public void update(TaskModel taskModel) {
		taskDao.update(taskModel);
	}

	@Override
	public TaskModel getTaskModel(int id) {
		return taskDao.load(id);
	}

	@Override
	public Pager<TaskModel> getTaskModelPagerByUser(int uid) {
		return taskDao.getTaskModelPagerByUser(uid);
	}

	@Override
	public Pager<TaskModel> getTaskModelPagerByStatus(TaskStatusType taskStatusType) {
		return taskDao.getTaskModelPagerByStatus(taskStatusType);
	}

}