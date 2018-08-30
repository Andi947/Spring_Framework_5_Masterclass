package com.company.springdemo.serviceimpl;

import java.util.Random;

import com.company.springdemo.service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " + 
					random.nextInt(numberOfRecruitments) + " employees " + 
					"using various recruitment agencies.";
		
		return hiringFacts;
	}

}
