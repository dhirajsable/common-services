package com.contact.login.jobservice.cloud.jobs;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.scheduling.annotation.Scheduled;

public class FetchAccountJob {

  private static final Log log = LogFactory.getLog(FetchAccountJob.class);

  @Scheduled(fixedDelay = 100L)
  void fetchAccounts() {}
}
