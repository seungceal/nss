package com.spring.nssservice;

import java.util.List;

import com.spring.nssvo.CustomerVO;

public interface CustomerService {
	public List<CustomerVO> customerList(CustomerVO cvo);
}
