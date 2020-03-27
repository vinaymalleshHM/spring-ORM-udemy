package com.udemy.spring.springorm.passenger.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.udemy.spring.springorm.passenger.dao.PassengerDao;
import com.udemy.spring.springorm.passenger.entity.Passenger;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/udemy/spring/springorm/passenger/test/config.xml");
		PassengerDao passengerDao = (PassengerDao) context.getBean("passengerDao");
		Passenger passenger = new Passenger();
		passenger.setId(3);
		passenger.setFirstName("Bharath");
		passenger.setLastName("Thippereddy");
		//		passengerDao.create(passenger);
		//		passengerDao.update(passenger);
		//		passengerDao.delete(passenger);
		//		Passenger passenger2 = passengerDao.find(3);
		//		System.out.println("Passenger details : " + passenger2);
		List<Passenger> passengers = passengerDao.findAll();
		System.out.println("All Passengers : " + passengers);

	}
}
