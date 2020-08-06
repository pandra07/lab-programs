package com.capg.springmvc.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.capg.springmvc.model.Trainee;

@Repository
public class TraineeDao {

	Map<Integer, Trainee> traineeList =new HashMap<Integer, Trainee>();
	
	public Trainee addTrainee(Trainee t)
	{
		traineeList.put(t.gettId(), t);
		return t;
	}
	
	public Trainee findTrainee(int id)
	{
		return traineeList.get(id);
	}
}
