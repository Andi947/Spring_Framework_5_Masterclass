package com.company.springdemo.domain;

import com.company.springdemo.service.RecruitmentService;

public class HumanResourcesDept implements Department {
	
	private String departmentName;
	private RecruitmentService recruitmentService;
	private Organization organization;	

	public HumanResourcesDept(RecruitmentService recruitmentService, Organization organization) {
		this.recruitmentService = recruitmentService;
		this.organization = organization;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String hiringStatus(int numberOfRecruitments) {
		String hiringFacts = recruitmentService.recruitEmployees(organization.getCompanyName(), departmentName, numberOfRecruitments);
		return hiringFacts;
	}

}
