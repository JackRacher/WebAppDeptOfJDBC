package com.ojas.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ojas.dao.Dept_Repo;
import com.ojas.model.Department;

@Controller
public class DepartmentController {
	
	@Autowired
	private Dept_Repo depts;
	
	@RequestMapping("/adddept")
	public String addDept(ModelMap map) {
		Department dept = new Department();
		map.addAttribute("dept", dept);
		return "add_dept";
	}

	@RequestMapping(value = "/adddept", method = RequestMethod.POST)
	public String addDept(@Valid Department d, Errors errors, ModelMap map) {
		try {
			if(errors.getErrorCount() > 0) {
				throw new RuntimeException(errors.toString());
			}
			if(depts.findById(d.getId()).isPresent()) {
				throw new RuntimeException("Department ID Exists");
			}
			depts.save(d);
			return "redirect:/deptlist";
		} catch (Exception e) {
			map.addAttribute("dept", depts);
			map.addAttribute("message", e.getMessage());
			return "add_dept";
		}
	}
	
	@RequestMapping("/deptlist")
	public String getDeptList(ModelMap map) {
		map.addAttribute("depts",depts.findAll());
		return "deptlist";
	}
	
}
