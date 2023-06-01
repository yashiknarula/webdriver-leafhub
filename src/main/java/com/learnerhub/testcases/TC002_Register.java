package com.learnerhub.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.learnerhub.pages.LoginPage;

public class TC002_Register extends ProjectHooks{
	@BeforeTest
	public void setValues() {
		testcaseName = "Register";
		testDescription ="Register a new user";
		authors="Babu";
		category ="Smoke";
	}
	
	@Test
	public void runRegister() {
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLogin()
		.clickRegister()
		.enterUsername("")
		.selectRole("")
		.enterName("")
		.enterEmail("")
		.enterPassword("")
		.enterConfirmPassword("")
		.selectSecretQuestion("")
		.enterAnswer("")
		.clickRegister()
		.clickLogout();
		
		new LoginPage()
		.enterUsername("")
		.enterPassword("")
		.clickLogin()
		.clickLogout();
	}

}
