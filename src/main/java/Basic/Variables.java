package Basic;

public class Variables {
    public static void main(String[] args) {

        //Create 5 variables with type int,long,float,double
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;
        int a5;
        int a6;

        //float variable should end with f
        float f1 = 1.15f;
        float f2 = 2.11f;
        float f3 = 2.11f, f4 = 4.77f, f5=5.98f;

        double d1 = 1.2, d2=2.3, d3=3.5, d4=4.8, d5 = 5.9;

        String s1 = "S1";
        String s2 = "S2", s3 = "S3", s4 = "S4", s5 = "S5";


        // Assign different values to these variables and compare them
        System.out.println(a2==a3);
        System.out.println(f1==d1);
        System.out.println(s2==s1);
        //Always verify difference by equals!
        System.out.println(s2.equals(s1));

        //Don't assign any values and compare variables. (Can compare not initialized variables)
        //System.out.println(a6 == a5);

        //Assign the same values and compare variables.
        System.out.println(f2==f3);

        //Divide numeric values by zero. (Exception is shown)
        //int divide = a1/0;
        //System.out.println(divide);

        //Divide values by 3 and assign result to variable
        a4 = a4/3;
        a3/=3;
        System.out.println(a4);
        System.out.println(a3);

    }
}
