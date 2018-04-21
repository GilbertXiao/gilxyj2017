package com.wlb.main;

import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;

import com.wlb.bean.Task;

public class UsePriorityBlockingQue {
	public static void main(String[] args) {
		PriorityBlockingQueue<Task> q = new PriorityBlockingQueue<Task>();

		Task t1 = new Task();
		t1.setId(1);
		t1.setName("立式");

		Task t2 = new Task();
		t2.setId(5);
		t2.setName("3434");

		Task t3 = new Task();
		t3.setId(34);
		t3.setName("666");
		Task t4 = new Task();

		t4.setId(3);
		t4.setName("发发发");
		Task t5 = new Task();

		t5.setId(7);
		t5.setName("六六六");
		q.add(t1);
		q.add(t2);
		q.add(t3);
		q.add(t4);
		q.add(t5);
		for (int i=q.size();i>0;i--) {
			Task poll = q.poll();
			System.out.println(poll.getId()+","+poll.getName());
			
		} 
	}
}
