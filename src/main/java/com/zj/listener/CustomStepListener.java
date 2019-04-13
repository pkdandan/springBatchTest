package com.zj.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class CustomStepListener implements StepExecutionListener{

	@Override
	public ExitStatus afterStep(StepExecution execution) {
		System.out.println("========"+execution.getStatus());
		System.out.println("============afterStep method===============");
		System.out.println("========"+execution.getExitStatus().getExitCode());
		return execution.getExitStatus();
	}

	@Override
	public void beforeStep(StepExecution execution) {
		
		System.out.println("============beforeStep method===============");
		System.out.println("========"+execution.getStatus());
	}

}
