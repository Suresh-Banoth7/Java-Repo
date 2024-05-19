
public class IncDec {
    public static void main(String[] args) {

        int count = 0;

        // post increment => value increase after the present line is excuted
        System.out.println(count++); // = 0
        System.out.println(count);// = 1

        // pre increment => value increase in the same line

        System.out.println(++count);

        // post decrement => value decrease after the present line is excuted
        System.out.println(count--); // = 0
        System.out.println(count);// = 1

        // pre decrement => value decrease in the same line

        System.out.println(--count);

    }
}
