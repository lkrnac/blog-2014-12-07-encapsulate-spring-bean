package net.lkrnac.blog.spring.encapsulatebean;

import net.lkrnac.blog.spring.encapsulatebean.service.UserService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests {
	@Autowired
	private UserService userService;
	
	@Test
	public void isPackagePrivateBeanCalled(){
		//GIVEN - spring context defined by Application class
		
		//WHEN
		String actualUserDetails = userService.getUserDetails("john");
		
		//THEN
		Assert.assertEquals("User: john, 3 Dark Corner", actualUserDetails);
	}
}
