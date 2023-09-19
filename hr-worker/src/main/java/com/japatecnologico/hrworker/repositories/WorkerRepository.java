package com.japatecnologico.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.japatecnologico.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
