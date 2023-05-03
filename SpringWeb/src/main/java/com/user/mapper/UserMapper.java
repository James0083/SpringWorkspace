package com.user.mapper;

import com.user.model.UserVO;
//UserMapper를 implements 하는 클래스를 스프링이 자동으로 구현하여 메모리에 올린다
//=>Proxy객체를 스프링이 만듦 ==> datasource-context.xml에 mybatis-spring:scam설정을 해야함

public interface UserMapper {

	int createUser(UserVO user);
	UserVO getUser(int idx);
	
	Integer idCheck(String userid); //회원번호가 없을 때는 null을 반환하기 때문에 null을 받을 수 있는 객체로 선언함
	UserVO findUser(UserVO user);
	
	int deleteUser(int idx);
	int updateUser(UserVO user);
	
}
