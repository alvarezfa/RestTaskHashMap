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
	
	public void updateTask(int id, String name) throws Exception{
		Task task = tasks.get(id);
		if(!ObjectUtils.isEmpty(task)){
			task.setName(name);
		}else{
			throw new Exception("Data not found.");
		}
	}
	
	public void deleteTast(int id) throws Exception{
		Task task= tasks.get(id);
		if(!ObjectUtils.isEmpty(task)){
			tasks.remove(id);
		}else{
			throw new Exception("Data not found.");
		}
	}
	
	public String sayHi(String id, String name, String lastname){
		return "Hi "+ name + " "+lastname + " id: "+id;
	}
	
}
