package com.minibike.bike;

import com.minibike.bike.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = BikeApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BikeApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	@LocalServerPort
	private int port;

	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	@Test
	public void contextLoads() {
		String result =restTemplate.getForObject("/user/hello",String.class);
		System.out.println(result);
	}

	@Test
	public void test(){
		userService.login();

	}

}
