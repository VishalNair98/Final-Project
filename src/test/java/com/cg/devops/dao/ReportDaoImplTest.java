package com.cg.devops.dao;

import org.json.simple.parser.JSONParser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.cg.devops.exception.ProgramException;

/**
 * 
 * @author Team1
 * @viewedBy Amit Kumar
 * Default Test Class
 *
 */
@Configuration
@ComponentScan(basePackages = { "com.cg.devops.dao" })
class SpringTestContext {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	public JSONParser getJsonParser() {
		return new JSONParser();
	}
	
}

/**
 * 
 * @author Team1
 * @viewedBy 
 * Test Class For Dao Testing
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringTestContext.class)
public class ReportDaoImplTest {

	@Autowired
	private ReportDao reportDao;

	/**
	 * Method testGetBugs
	 */
	@Test(expected = ProgramException.class)
	public void testGetBugs() {
		reportDao.getBugs("java");
	}
	
	/**
	 * Method testGetVulnerability
	 */
	@Test(expected = ProgramException.class)
	public void testGetVulnerability() {
		reportDao.getVulnerability("java");
	}
	
	/**
	 * Method testGetCodeSmell	
	 */
	@Test(expected = ProgramException.class)
	public void testGetCodeSmell() {
		reportDao.getCodeSmell("java");
	}
	
	/**
	 * Method testGetHotspot
	 */
	@Test(expected = ProgramException.class)
	public void testGetHotspot() {
		reportDao.getHotspot("java");
	}
	
	/**
	 * Method testGetMinor
	 */
	@Test(expected = ProgramException.class)
	public void testGetMinor() {
		reportDao.getMinor("java");
	}
	
	
	/**
	 * Method testGetCritical
	 */
	@Test(expected = ProgramException.class)
	public void testGetCritical() {
		reportDao.getCritical("java");
	}
	
	/**
	 * Method testGetInfo
	 */
	@Test(expected = ProgramException.class)
	public void testGetInfo() {
		reportDao.getInfo("java");
	}
	
	/**
	 * Method testGetMajor
	 */
	@Test(expected = ProgramException.class)
	public void testGetMajor() {
		reportDao.getMajor("java");
	}
	
	/**
	 * Method testGetBlocker
	 */
	@Test(expected = ProgramException.class)
	public void testGetBlocker() {
		reportDao.getBlocker("java");
	}
	
	
	
	

}
