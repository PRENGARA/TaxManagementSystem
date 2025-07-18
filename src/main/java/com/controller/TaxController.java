package com.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.UserClaim;
import com.service.TaxServiceImpl;

@Controller
public class TaxController {
//Autowiring the TaxServiceImpl class
	@Autowired
	private TaxServiceImpl taxService;
//Mapping according to the /getTaxClaimFormPage url
	@RequestMapping(value = "/getTaxClaimFormPage", method = RequestMethod.GET)
	public String claimPage(@ModelAttribute("userClaim") UserClaim userClaim) {
		return "taxclaim";
	}

	@RequestMapping(value = "/calculateTax", method = RequestMethod.GET)
	public String calculateTax(@Valid @ModelAttribute("userClaim") UserClaim userClaim, BindingResult result, ModelMap map) {
		String c="";
		if (!result.hasErrors()) {
			double totalcost = taxService.calculateTax(userClaim);
			map.put("cost", totalcost);
			c= "result";
		} else {
			c= "taxclaim";
		}
		return c;
	}
// code to add the values to the expenseList
	@ModelAttribute("expenseList")
	public List<String> populateExpense() {
		List<String> types = new ArrayList<String>();
		types.add("MedicalExpense");
		types.add("TravelExpense");
		types.add("FoodExpense");
		return types;
	}

}
