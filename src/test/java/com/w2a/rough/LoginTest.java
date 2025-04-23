package com.w2a.rough;

import com.w2a.pages.*;
import com.w2a.pages.Accounts.AccountsPage;
import com.w2a.pages.Accounts.CreateAccountPage;
import com.w2a.pages.crm.CRMHomepage;
import com.w2a.base.*;
public class LoginTest {
    public static void main(String[] args) {
    ConsoleHandler log = new ConsoleHandler();
		log.setLevel(Level.ALL);
		
		logger.addHandler(log);
        HomePage home = new HomePage();
        LoginPage lp= home.goToSignin();
        logger.info("login successfull ");
        ZohoAppPage zp =lp.doLogin("ahmedkhanlodhi95@gmail.com", "ZohoMyAccount.096");
        
        zp.gotoCrm();
        
        AccountsPage Ap = Page.menu.Accounts();

       CreateAccountPage Create = Ap.gotoAccounts();

       Create.CreateAccount("Ahmed_khan");
       logger.info("Account created");
      
        
        
    }
}
