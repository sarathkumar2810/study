package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ModelRepo;
import com.example.demo.model.DatabaseModel;

@RestController
public class ModelController {
	
	@Autowired
	ModelRepo repo;
	
	@RequestMapping("/model")
	public String model() {
		return "model";
	}
	
	@RequestMapping("/addmodel")
	public String addmodel(DatabaseModel databaseModel) {
		repo.save(databaseModel);
		return "model";
	}
	
//	@RequestMapping("/getmodel")
//	public ModelAndView getmodel(@RequestParam int aid) {
//		ModelAndView mv = new ModelAndView("show");
//		DatabaseModel databaseModel = repo.findById(aid).orElse(new DatabaseModel());	
//		System.out.println(repo.findByTech("Java"));
//		System.out.println(repo.findByAidGreaterThan(200));
//		System.out.println(repo.findByTechSorted("Java"));
//		mv.addObject(databaseModel);
//		return mv;	
		
		@RequestMapping(path="/databaseModels")
//		@ResponseBody
		public List<DatabaseModel> getmodels() {
			return repo.findAll();		
	}
		
		@PostMapping(path="/databaseModel", consumes="application/json")
//		@ResponseBody
		public DatabaseModel addmodels(@RequestBody DatabaseModel databaseModel) {
			repo.save(databaseModel);
			return databaseModel;		
	}
		
		@SuppressWarnings("deprecation")
		@DeleteMapping(path="/databaseModel/{aid}")
		public String deleteData(@PathVariable int aid) {
			
			DatabaseModel data = repo.getOne(aid);	
			repo.delete(data);
			return "Deleted";
		}	
		
//		@RequestMapping("/databaseModel/123")
//		@ResponseBody
//		public String getmodel() {
//			return repo.findById(123).toString();		
//	}
		
		@GetMapping("/databaseModel/{aid}")
//		@ResponseBody
		public Optional<DatabaseModel> getmodel(@PathVariable("aid") int aid) {
			return repo.findById(aid);		
	}
		
		@PutMapping(path="/databaseModel", consumes="application/json")
//		@ResponseBody
		public DatabaseModel putmodel(@RequestBody DatabaseModel databaseModel) {
			repo.save(databaseModel);
			return databaseModel;		
	}
	
	@RequestMapping("/deletemodel")
	public ModelAndView deletemodel(@RequestParam int aid) {
		ModelAndView mv = new ModelAndView("model");
		repo.deleteById(aid);
		return mv;	
	}

}
