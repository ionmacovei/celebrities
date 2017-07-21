package com.packtpub.celebrities.pages;

import com.packtpub.celebrities.model.User;
import com.packtpub.celebrities.util.Security;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.corelib.components.PasswordField;

/**
 * Created by ion.macovei on 7/21/2017.
 */
public class Login {
   /* @Component(parameters = { "value=password" })
    private PasswordField passwordFiled;
    @Component(parameters = { "value=userName" })
    private PasswordField userNameFiled;*/

    private String userName;
    private String password;

    @SessionState
    private User user;
    Object onSubmitFromLoginForm()
    {
        Class nextPage = null;
        User authenticatedUser = null;
        authenticatedUser =
                Security.authenticate(userName, password);
        if (authenticatedUser != null)
        {
            user = authenticatedUser;
            nextPage = Index.class;
        }
        else
        {
          //  nextPage = Registration.class;
        }
        return nextPage;
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
