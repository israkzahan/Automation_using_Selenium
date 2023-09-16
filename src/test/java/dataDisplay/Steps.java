package dataDisplay;

import webElementsLogin.LoginSteps;

public class Steps extends LoginSteps {
    public static void main(String[] args) {
        LoginSteps loginSteps= new LoginSteps();
        loginSteps.initializeDriver();
        loginSteps.login();
        //
    }


}
