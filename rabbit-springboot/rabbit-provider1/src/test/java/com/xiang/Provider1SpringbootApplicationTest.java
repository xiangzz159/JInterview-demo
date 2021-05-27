package com.xiang;

import com.xiang.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Provider1SpringbootApplicationTest {

	@Autowired
	private OrderService orderService;

	@Test
	void fanoutLoads() {
		orderService.makeOrder("1", "1", 12);
	}

	@Test
	void directLoads() {
		orderService.makeOrderDirect("1", "1", 12);
	}

	@Test
	void topicLoads() {
		orderService.makeOrderTopic("1", "1", 12);
	}

	@Test
	void ttlLoads() {
		orderService.makeOrderTtl("1", "1", 12);
	}

	@Test
	void ttlMessageLoads() {
		orderService.makeOrderTtlMessage("1", "1", 12);
	}

}
