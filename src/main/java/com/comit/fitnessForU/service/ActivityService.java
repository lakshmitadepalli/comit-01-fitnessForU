package com.comit.fitnessForU.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.comit.fitnessForU.bean.ActivityBean;
import com.comit.fitnessForU.dao.ActivityDao;

@Service
public class ActivityService {
	@Autowired

	ActivityDao activityDao;

	public List<ActivityBean> listActivities(){
 List<ActivityBean> activities=this.activityDao.listActivities();
 return activities;
}
}