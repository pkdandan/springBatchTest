package com.zj;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
	"classpath:jobs.xml","classpath:database.xml","classpath:context.xml","classpath:test-context.xml"
})
public class AppTest {
	
	@Autowired
	JobLauncherTestUtils jobLauncherTestUtils;
	
	@Test
	public void testHelloWorldJob() throws Exception {
		JobExecution execution = jobLauncherTestUtils.launchJob();
		
		assertEquals(BatchStatus.COMPLETED,execution.getStatus());
	}

}
