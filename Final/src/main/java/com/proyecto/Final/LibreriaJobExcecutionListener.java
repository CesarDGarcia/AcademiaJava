package com.proyecto.Final;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;


public class LibreriaJobExcecutionListener implements JobExecutionListener {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LibreriaJobExcecutionListener.class);

    @Override
    public void afterJob(JobExecution jobExecution) {
        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            LOGGER.info("!!! JOB FINISHED! Time to verify the results");
        }
    }

}
