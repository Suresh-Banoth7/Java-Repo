
public class Arthematic {

    public static void main(String[] args) {

        int quantity = 2;
        float price = 199.5f;
        float totalPrice = price * quantity;
        int a = 20;
        int b = 10;
        System.out.println(totalPrice);
        System.out.println(a % b);
        System.out.println(a / b);
        String q = "2";
        String P = "199.5";

        // parsing string to float using parseFloat method
        System.out.println(Float.parseFloat(P) * Float.parseFloat(q));

        int q1 = 3;
        String p1 = " 45.50";

        totalPrice = q1 * Float.parseFloat(p1);

        System.out.println(totalPrice);

    }

}
