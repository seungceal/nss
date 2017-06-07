package com.spring.nssdao;

import java.util.List;

import com.spring.nssvo.CustomerVO;

public interface CustomerDao {
	public List<CustomerVO> customerList(CustomerVO cvo);

}
