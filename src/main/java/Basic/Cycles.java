package Basic;

public class Cycles {
    public static void main(String[] arg) {

        //for usage
        for (int x = 1; x <= 10; x++) {
            System.out.println("The x value is " + x);
        }

        //while usage
        int y=0;
        while (y<10){
            y++;
            System.out.println("The y value is " + y);
        }

        //foreach usage
        int[] numbers = { 1,2,3,4,5,6,7,8,9,10 };
        for(int num:numbers){
            System.out.println(num);
        }

        //Infinite loop
        while (true){
            //This loop never end, cause condition is always true
        }
    }
}
