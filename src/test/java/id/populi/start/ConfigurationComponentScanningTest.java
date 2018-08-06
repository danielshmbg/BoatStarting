package id.populi.start;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import id.populi.start.config.SystemConfiguration;
import id.populi.start.model.Shipwreck;
import id.populi.start.service.SimpleService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SystemConfiguration.class)
public class ConfigurationComponentScanningTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Autowired
	private SimpleService simpleService;
	
	@Test
	public void dependencyInjectionShouldWork() {
		assertNotNull(simpleService);
	
	}
//	
//	@Test
//	public void serviceShouldReturnShipWreck() {
//		assertThat(simpleService.service(), equals(new Shipwreck()));	
//	}
	

}
