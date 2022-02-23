package com.cvofocus.java.basictasklist;

import com.cvofocus.java.basictasklist.service.dto.Task;
import com.cvofocus.java.basictasklist.service.manager.TaskManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BasictasklistApplication {

	public static void main(String[] args) {



		ApplicationContext ctx = SpringApplication.run(BasictasklistApplication.class, args);

		//System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));

		List<Task> allTasks = ((TaskManager)ctx.getBean("taskManager")).getAll();

		System.out.println("taskList");
		allTasks.forEach(t -> System.out.println(t));



		/// this should be done somewhere else...



	}

}
