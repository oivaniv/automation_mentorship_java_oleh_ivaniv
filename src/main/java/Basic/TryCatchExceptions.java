package Basic;

public class TryCatchExceptions {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("An error occurred");
        }


        System.out.println(div(2, 3));
    }

    //throws - define the type of Exception the method can throw
    static int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            //throw - keyword throws(виділяє) the corresponding exception, along with the custom message
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }
}

