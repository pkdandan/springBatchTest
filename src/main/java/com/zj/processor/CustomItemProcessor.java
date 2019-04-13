package com.zj.processor;

import org.springframework.batch.item.ItemProcessor;

import com.zj.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report,Report>{

	@Override
	public Report process(Report item) throws Exception {
		System.out.println("=====processItem=====");
		return item;
	}
}
