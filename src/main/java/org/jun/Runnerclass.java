package org.jun;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Runnerclass {
	
	@Test
	public void runtest() {
		Result run = JUnitCore.runClasses(SiteGmail.class,JunitSites.class,Junitco.class);
		System.out.println("Get run time: "+run.getRunTime());
		System.out.println("Get run Count: "+run.getRunCount());
		System.out.println("Get Failure Count: "+run.getFailureCount());
		System.out.println("Get Ignore Count: "+run.getIgnoreCount());
		
		
		List<Failure> fail = run.getFailures();
		
		for (Failure f : fail) {
			System.out.println(f);
		}

	}

}
