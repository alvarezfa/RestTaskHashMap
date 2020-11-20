package entity;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Task {

	private static final AtomicInteger count=new AtomicInteger(0);
	
	int id;
	String name;
	LocalDateTime date;
	
	
	public Task(String name){
		this.name=name;
		this.date=LocalDateTime.now();
		this.id=count.incrementAndGet();
	}
	
	public int getId(){
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDateTime getDate(){
		return date;
	}
	
}
