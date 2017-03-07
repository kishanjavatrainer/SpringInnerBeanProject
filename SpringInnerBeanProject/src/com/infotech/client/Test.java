package com.infotech.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotech.model.Employee;
import com.infotech.model.Pancard;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
		
		Employee employee = ctx.getBean("employee", Employee.class);
		
		System.out.println(employee.getEmployeeId()+"\t"+employee.getEmployeeName()+"\t"+employee.getGender());
		
		System.out.println("----------------------------------");
		
		Pancard pancard = employee.getPancard();
		
		((AbstractApplicationContext) ctx).close();
		
		System.out.println(pancard.getPanHolderName()+"\t"+pancard.getPanNo());

	}

}
