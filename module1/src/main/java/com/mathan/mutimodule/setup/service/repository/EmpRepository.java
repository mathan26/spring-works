package com.mathan.mutimodule.setup.service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mathan.mutimodule.setup.service.domain.Emp;

@Repository
public interface EmpRepository extends CrudRepository<Emp, Integer> {
	@Query(value="SELECT sno,name FROM Emp u WHERE u.sno = :status and u.name = :name",nativeQuery=true)
	List<Emp> findUserByStatusAndNameNamedParams(
	  @Param("status") Integer sno, 
	  @Param("name") String name);
}
