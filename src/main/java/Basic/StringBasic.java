package Basic;

import java.util.Locale;

public class StringBasic {
    public static void main(String[] args) {

        //Create 2 different strings.
        String name = "Oleh ";
        String surname = "Ivaniv";

        //Concatenate them and print result.
        String firstNameSecondName = name + surname;
        System.out.println(firstNameSecondName);

        //Concatenate them and print result.
        String firstNameSecondNameV2 = name.concat(surname);
        System.out.println(firstNameSecondNameV2);

        //Create string "   egweerw  ererferw  kuy  yu i"
        String s1 = "   egweerw  ererferw  kuy  yu i ";


        //Print its length
        System.out.println(s1.length());
        //Trim string and print result. .trim() method trim spaces before value in the String.
        System.out.println(s1.trim());
        //Print length of trimmed string.
        System.out.println((s1.trim().length()));

        //Create string "   egweerw  ererferw  kuy  yu i "
        String s2 = "   egweerw  ererferw  kuy  yu i ";

        //Split string by spaces and print each value in separate row
        //.split("parameter") method split value by parameter value
        String[] splitedS2 = s2.split(" ");
        for (String splitedValue : splitedS2) {
            System.out.println(splitedValue);
        }

        //Split string by spaces; Clean empty spaces form result; Print each result value in a separate row.
        //"\\s+" parameter will split String to words, and it doesn't metter how many spaces between the words
        //Also it would be good to use .trim() method before to remove space before.
        String[] splitedFull2 = s2.trim().split("\\s+");
        for (String splitedValue : splitedFull2) {
            System.out.println(splitedValue);
        }

        //Convert all characters to uppercase. Print result
        System.out.println(s2.toUpperCase(Locale.ROOT));

        //Convert all 'w' to uppercase.Print result
        //Split string by each 1 letter
        String newS2 = "";
        char[] s2arr = s2.toCharArray();
        //Created for-each loop to check all values
        for (char s : s2arr) {
            //Add condition to verify if s=='w', if yes - change it to 'W', if no - skip
            if (s == 'w') {
                s = 'W';
            }
            //for each iteration we add s value to the newS2 string
            newS2 += s;
        }
        //Show the result of changed string
        System.out.println(newS2);

        // Convert first 'w' to uppercase. Print result
        String s3 = "   egweerw  ererferw  kuy  yu i ";
        //Split string by each 1 letter
        String newS3 = "";
        char[] s3arr = s2.toCharArray();
        //Created for-each loop to check all values
        for (int x = 0; x < s3arr.length - 1; x++) {
            //Add condition to verify if s=='w', if yes - change it to 'W', if no - skip
            if (s3arr[x] == 'w') {
                s3arr[x] = 'W';
                //Add break to stop if statement if we found value that we are looking for
                break;
            }
            //for each iteration we add s3arr value to the newS3 string
            newS3 += s3arr[x];

        }
        System.out.println();
        System.out.println(s3arr);

        //Create string "this item previous price $5.99, Sale price $1.99. "
        String S4 = "this item previous price $5.99, Sale price $1.99. ";
        //Parse original and sale price from string and print them.
        System.out.println();
        String[] S4splited = S4.trim().split(",");
        for (String splitedValue:S4splited){
            System.out.println(splitedValue);
        }

    }
}
