package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;

import org.testng.annotations.Test;

import com.hrms.library.General;

public class TC001 {
	// public static void main(String args[]) {
	@Test
	public void tc001() {
		// Test steps of part: TestCase
		DOMConfigurator.configure("log4j.xml");
		General obj = new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();
	}
}
