package com.example.demo;

import java.util.HashMap;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import entity.Task;

@Service
public class Servicio {

	HashMap<Integer, Task> tasks=new HashMap<>();
	
	public Task saveTask(String name){
		Task task = new Task(name);		
		tasks.put(task.getId(), task);
		return task;
	}
	
	public Task updateTask(int id, String name) throws Exception{
		Task task = tasks.get(id);
		if(ObjectUtils.isEmpty(task))
			throw new Exception("Data not found.");
		task.setName(name);
		return task;
	}
	
	public void deleteTask(int id) throws Exception{
		Task task= tasks.get(id);
		if(ObjectUtils.isEmpty(task))
			throw new Exception("Data not found.");
		tasks.remove(id);
	}
	
	public Task getTask(int id){
		return tasks.get(id);
	}
	
}
