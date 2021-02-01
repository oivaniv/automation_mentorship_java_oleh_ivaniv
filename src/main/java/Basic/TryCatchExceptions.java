package Basic;

public class TryCatchExceptions {

    public static void TryCatchException() {
        try {
            int a[] = new int[2];
            System.out.println(a[5]);
        } catch (Exception e) {
            //Add error message
            System.out.println("An error occurred " + e.getMessage());
            //Add info about StackTrace
            System.out.println(e.getStackTrace());
        }

    }

    //throws - define the type of Exception the method can throw
    public static int dividerByZero(int a, int b) throws ArithmeticException {
        if (b == 0) {
            //throw - keyword throws(виділяє) the corresponding exception, along with the custom message
            throw new ArithmeticException("Division by Zero");
        } else {
            return a / b;
        }
    }

}

