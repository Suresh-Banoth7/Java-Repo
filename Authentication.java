public class Authentication{

    public static void main(String[]args){
      
      Authentication ath = new Authentication();

      ath.Signup();
      ath.login();
      ath.resetPassword();

    }

    public void login(){
        System.out.println("Login success");
    }
    public void Signup(){
        System.out.println("Signup success");
    }
    public void resetPassword(){
        System.out.println("ResetPassword success");
    }
}