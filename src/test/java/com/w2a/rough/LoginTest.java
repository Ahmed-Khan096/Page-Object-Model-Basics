package com.w2a.rough;

import com.w2a.pages.*;
import com.w2a.pages.Accounts.AccountsPage;
import com.w2a.pages.Accounts.CreateAccountPage;
import com.w2a.pages.crm.CRMHomepage;
import com.w2a.base.*;
public class LoginTest {
    public static void main(String[] args) {

        HomePage home = new HomePage();
        LoginPage lp= home.goToSignin();

        ZohoAppPage zp =lp.doLogin("ahmedkhanlodhi95@gmail.com", "ZohoMyAccount.096");
        
        zp.gotoCrm();
        
        AccountsPage Ap = Page.menu.Accounts();

       CreateAccountPage Create = Ap.gotoAccounts();

       Create.CreateAccount("Ahmed_khan");
       
      
        
        
    }
}
