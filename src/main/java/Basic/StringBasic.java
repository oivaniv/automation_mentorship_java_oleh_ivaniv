package Basic;

import java.util.Locale;

public class StringBasic {

    public static void createTwoStings() {
        //Create 2 different strings.
        String name = "Oleh ";
        String surname = "Ivaniv";
    }

    public static void compareStrings() {
        String name = "Oleh ";
        String surname = "Ivaniv";
        //Concatenate them and print result.
        String firstNameSecondName = name + surname;
        System.out.println(firstNameSecondName);

        //Concatenate them and print result.
        String firstNameSecondNameV2 = name.concat(surname);
        System.out.println(firstNameSecondNameV2);
    }

    public static void lengthString() {
        //Create string "   egweerw  ererferw  kuy  yu i"
        String firstTestString = "   egweerw  ererferw  kuy  yu i ";

        //Print its length
        System.out.println(firstTestString.length());
        //Trim string and print result. .trim() method trim spaces before value in the String.
        System.out.println(firstTestString.trim());
        //Print length of trimmed string.
        System.out.println((firstTestString.trim().length()));
    }

    public static void splitString() {
        //Create string "   egweerw  ererferw  kuy  yu i "
        String secondTestString = "   egweerw  ererferw  kuy  yu i ";

        //Split string by spaces and print each value in separate row
        //.split("parameter") method split value by parameter value
        String[] splitedS2 = secondTestString.split(" ");
        for (String splitedValue : splitedS2) {
            System.out.println(splitedValue);
        }

        //Split string by spaces; Clean empty spaces form result; Print each result value in a separate row.
        //"\\s+" parameter will split String to words, and it doesn't metter how many spaces between the words
        //Also it would be good to use .trim() method before to remove space before.
        String[] splitedFull2 = secondTestString.trim().split("\\s+");
        for (String splitedValue : splitedFull2) {
            System.out.println(splitedValue);
        }

        //Convert all characters to uppercase. Print result
        System.out.println(secondTestString.toUpperCase(Locale.ROOT));
    }

    public static void convertToUpperCaseByLetter() {
        //Create string "   egweerw  ererferw  kuy  yu i "
        String secondTestString = "   egweerw  ererferw  kuy  yu i ";


        //Convert all 'w' to uppercase.Print result
        //Split string by each 1 letter
        String emptyString = "";
        char[] secondTestArray = secondTestString.toCharArray();
        //Created for-each loop to check all values
        for (char s : secondTestArray) {
            //Add condition to verify if s=='w', if yes - change it to 'W', if no - skip
            if (s == 'w') {
                s = 'W';
            }
            //for each iteration we add s value to the newS2 string
            emptyString += s;
        }
        //Show the result of changed string
        System.out.println(emptyString);

    }

    public static void convertToUpperCaseFirstLetter(String enteredString, char letterToFind, char letterToUpperCase) {
        // Convert first 'w' to uppercase. Print result
        String testString = enteredString;
        //Split string by each 1 letter
        String finalString = "";
        char[] oneByOneLetterArray = testString.toCharArray();
        //Created for-each loop to check all values
        for (int x = 0; x < oneByOneLetterArray.length - 1; x++) {
            //Add condition to verify if s=='w', if yes - change it to 'W', if no - skip
            if (oneByOneLetterArray[x] == letterToFind) {
                oneByOneLetterArray[x] = letterToUpperCase;
                //Add break to stop if statement if we found value that we are looking for
                break;
            }
            //for each iteration we add s3arr value to the newS3 string
            finalString += oneByOneLetterArray[x];

        }
        System.out.println();
        System.out.println(finalString);
    }

    public static void splitStringByComa() {
        //Create string "this item previous price $5.99, Sale price $1.99. "
        String testStringWithComa = "this item previous price $5.99, Sale price $1.99. ";
        //Parse original and sale price from string and print them.
        System.out.println();
        String[] S4splited = testStringWithComa.trim().split(",");
        for (String splitedValue : S4splited) {
            System.out.println(splitedValue);
        }
    }
}
