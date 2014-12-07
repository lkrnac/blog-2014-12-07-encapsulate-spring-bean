package net.lkrnac.blog.spring.encapsulatebean.service;

import org.springframework.stereotype.Service;

@Service
class AddressService {
	public String getAddress(String userName){
		return "3 Dark Corner";
	}
}
