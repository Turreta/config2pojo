package com.turreta.config2pojo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ComTurretaConfig2pojoApplicationTests {
	@Autowired
	FirstConfig fc;

	@Test
	public void contextLoads() {
		Assert.assertTrue(fc.getAppName().equalsIgnoreCase("Config2Pojo"));
		Assert.assertTrue(fc.getAppVersion().equalsIgnoreCase("1.0.2"));
	}
}
