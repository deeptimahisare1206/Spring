package com.mypackage;

import java.util.List;
import java.util.*;

public class Employee {
	
	String name;
	List<String> skills;
	Set<Integer> mobile;
	Map<String, String> projects;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Set<Integer> getMobile() {
		return mobile;
	}
	public void setMobile(Set<Integer> mobile) {
		this.mobile = mobile;
	}
	public Map<String, String> getProjects() {
		return projects;
	}
	public void setProjects(Map<String, String> projects) {
		this.projects = projects;
	}
	
	

}
