package com.spring.nsscontroller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.nssservice.CustomerService;
import com.spring.nssvo.CustomerVO;

@Controller
@RequestMapping(value = "/customer")
public class CustomerController {
	Logger logger = Logger.getLogger(CustomerController.class);

	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/customerList", method = RequestMethod.GET)
	public String customerList(@ModelAttribute CustomerVO cvo, Model model) {
		logger.info("customerList 호출 성공");
		
		System.out.println("customerList 호출 성공");

		List<CustomerVO> customerList = customerService.customerList(cvo);
		model.addAttribute("customerList", customerList);

		return "customer/customerList";
	}
}
