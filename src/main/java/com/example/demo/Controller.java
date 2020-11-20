package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import entity.Task;


@RestController
@RequestMapping("Task")
public class Controller {
	
	@Autowired
	Servicio service;
	
	@PostMapping
	public Task saveTast(@RequestParam String name){
		return service.saveTask(name);
	}
	
	@PutMapping("/{id}")
	public Task updateTask(@PathVariable int id,@RequestParam String name) throws Exception{
		return service.updateTask(id,name);
	}
	
	@DeleteMapping("/{name}")
	public void deleteTas(@PathVariable int id) throws Exception{
		service.deleteTask(id);
	}
	
	@GetMapping("/{id}")
	public Task getTask(@PathVariable int id){
		return service.getTask(id);
	}
	
	@GetMapping
	public String getAll(){
		
		return "tasks";
	}

}
