package com.example.springone;

import com.example.springone.bean.UserConfig;
import com.example.springone.proxylecture.Person;
import com.example.springone.proxylecture.PersonInvocationHandler;
import com.example.springone.proxylecture.man;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;
import java.time.Period;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringoneApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringoneApplication.class, args);
		//For beans
//		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserConfig userConfig = (UserConfig) context.getBean("userConfig");

		//For Proxies
//		man mohan = new man("Mohan", 30, "Delhi", "India");
//		ClassLoader classLoader = man.class.getClassLoader();
//		Class[] interfaces =new Class[]{Person.class};
//		System.out.println("11");
//		Person proxymohan=(Person) Proxy.newProxyInstance(classLoader,interfaces,new PersonInvocationHandler(mohan));
//		proxymohan.introduce(mohan.getName());
//		System.out.println("22");
	}
}
