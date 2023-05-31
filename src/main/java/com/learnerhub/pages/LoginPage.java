package com.learnerhub.pages;

import com.framework.config.ConfigurationManager;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectHooks;

public class LoginPage extends ProjectHooks{

	public LoginPage enterUsername() {
		clearAndType(locateElement(Locators.ID, "userNameTxt"), ConfigurationManager.configuration().appUserName());
		reportStep("Username entered successfully","pass");
		return this;
	}
	
	public LoginPage enterPassword() {
		clearAndType(locateElement(Locators.ID, "password"),  ConfigurationManager.configuration().appPassword());
		reportStep("Password entered successfully","pass");
		return this;
	}
	 
	public DashboardPage clickLogin() {
		click(locateElement(Locators.ID, "loginSubmit"));
		reportStep("Login button clicked successfully", "pass");
		return new DashboardPage();
	}

}
