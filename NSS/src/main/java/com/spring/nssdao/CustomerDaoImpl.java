package com.spring.nssdao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.nssvo.CustomerVO;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SqlSession session;

	@Override
	public List<CustomerVO> customerList(CustomerVO cvo) {
		// TODO Auto-generated method stub
		return session.selectList("customerList", cvo);
	}
}
