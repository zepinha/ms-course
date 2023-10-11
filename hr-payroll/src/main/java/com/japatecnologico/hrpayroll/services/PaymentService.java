package com.japatecnologico.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.japatecnologico.hrpayroll.entities.Payment;
import com.japatecnologico.hrpayroll.entities.Worker;
import com.japatecnologico.hrpayroll.feignclients.WorkerFeignClient;



@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
	
		Worker worker = workerFeignClient.findAll(workerId).getBody();
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
