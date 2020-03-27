package com.udemy.spring.springorm.passenger.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.udemy.spring.springorm.passenger.dao.PassengerDao;
import com.udemy.spring.springorm.passenger.entity.Passenger;

@Component("passengerDao")
public class PassengerDaoImpl implements PassengerDao {

	@Autowired
	HibernateTemplate hibernateTemplate;

	@Transactional
	public int create(Passenger passenger) {
		int result = (Integer) hibernateTemplate.save(passenger);
		return result;
	}

	@Transactional
	public void update(Passenger passenger) {
		hibernateTemplate.update(passenger);
	}

	@Transactional
	public void delete(Passenger passenger) {
		hibernateTemplate.delete(passenger);
	}

	public Passenger find(int id) {
		Passenger passenger = hibernateTemplate.get(Passenger.class, id);
		return passenger;
	}

	public List<Passenger> findAll() {
		List<Passenger>passengers = hibernateTemplate.loadAll(Passenger.class);
		return passengers;
	}

}
