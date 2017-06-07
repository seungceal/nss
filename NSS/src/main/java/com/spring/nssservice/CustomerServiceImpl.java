package com.spring.nssservice;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.nssdao.CustomerDao;
import com.spring.nssvo.CustomerVO;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	Logger logger = Logger.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerDao customerDao;

	@Override
	public List<CustomerVO> customerList(CustomerVO cvo) {
		// TODO Auto-generated method stub
		List<CustomerVO> myList = null;
		myList = customerDao.customerList(cvo);
		return myList;
	}

}
