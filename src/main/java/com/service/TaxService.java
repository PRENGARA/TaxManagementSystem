package com.service;
import org.springframework.stereotype.Service;

import com.model.UserClaim;
//making these as a Service class 
@Service
public interface TaxService {
	
	public double calculateTax(UserClaim userClaim);

}
