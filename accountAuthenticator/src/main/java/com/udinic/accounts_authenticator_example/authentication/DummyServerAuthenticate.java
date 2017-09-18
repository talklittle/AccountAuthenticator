package com.udinic.accounts_authenticator_example.authentication;

/**
 * Dummy login, no actual verification or server involved
 */
public class DummyServerAuthenticate implements ServerAuthenticate{
    @Override
    public String userSignUp(String name, String email, String pass, String authType) throws Exception {
        return "dummy";
    }

    @Override
    public String userSignIn(String user, String pass, String authType) throws Exception {
        return "dummy";
    }
}
