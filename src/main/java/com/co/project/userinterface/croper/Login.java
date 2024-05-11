package com.co.project.userinterface.croper;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Login extends PageObject {



    public static final Target BTN_LOGIN =
            Target.the("BTNLogin").locatedBy("//div[@id='HeaderControl_Login_CD']");

    public static final Target EMAIL =
            Target.the("BTNLogin").locatedBy("//input[@id='HeaderControl_LogonControl_LoginFormLayout_txtEmail_I']");

    public static final Target PASSWORD =
            Target.the("BTNLogin").locatedBy("//input[@id='HeaderControl_LogonControl_LoginFormLayout_txtPassword_I_CLND']");

    public static final Target CAPTCHA =
            Target.the("BTNLogin").locatedBy("//img[@id='HeaderControl_LogonControl_LoginFormLayout_Captcha_IMG']");

    public static final Target CODE =
            Target.the("BTNLogin").locatedBy("//input[@id='HeaderControl_LogonControl_LoginFormLayout_Captcha_TB_I']");

    public static final Target BTNLOGINSUBMIT =
            Target.the("BTNLogin").locatedBy("//div[@id='HeaderControl_LogonControl_btnLoginNow_CD']");






}
