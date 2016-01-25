package com.example.mvplogin;

/**
 * Created by محمد on 25/01/2016.
 */
public class LoginPresenterimplement implements LoginPresenter {
    LoginModel m=new LoginModel();
    public LoginPresenterimplement(){
        init_user();
    }
    public String checklogin(String name, String passwd) {
        /*Boolean isLoginSuccess = true;
        final int code = loginModel.checkUserValidity(name,passwd);
        if (code!=0) isLoginSuccess = false;oln
        f  inal Boolean result = isLoginSuccess;
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                iLoginView.onLoginResult(result, code);
            }
        }, 5000);
*/
        if(name.equals(m.getUsername())&&passwd.equals(m.getPassword())){
            return "Success";
        }
        return "fail";
    }
private void init_user(){
    m.setUsername("Mohamed");
    m.setPassword("123");
}
}
