package com.xiang;

import com.xiang.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisSpringbootApplicationTests {

	@Autowired
	private RedisTemplate redisTemplate;

	@Autowired
	private RedisUtil redisUtil;
	@Test
	void contextLoads() {
		redisTemplate.opsForValue().set("test", "test");
		String s = redisTemplate.opsForValue().get("test").toString();
		System.out.println(s);
		redisTemplate.delete("test");
	}

	@Test
	void testRedisUtil() {
		redisUtil.set("test", "test");
		System.out.println(redisUtil.get("test"));
		redisUtil.del("test");
	}

}
