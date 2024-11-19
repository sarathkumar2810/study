package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.List;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.DatabaseModel;

public interface ModelRepo extends JpaRepository<DatabaseModel, Integer>{

//	List<DatabaseModel> findByTech(String tech);
//
//	List<DatabaseModel> findByAidGreaterThan(int aid);
//	
//	@Query("from DatabaseModel where tech=?1 order by aname")
//	List<DatabaseModel> findByTechSorted(String tech);

}
