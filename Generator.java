
public class Generator {

    public static void main(String[] args) {

     double otp = Math.random();
     System.out.println(otp);
     int sendOtp =  (int)  (otp*1000000) ;
     System.out.println(sendOtp);
     

    }
}
