import java.util.Arrays;

public class Rosy {

    public static int vowelsCounter(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'a' ||
                    str.charAt(i) == 'E' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'I' || str.charAt(i) == 'i' ||
                    str.charAt(i) == 'O' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'U' || str.charAt(i) == 'u') {

                count++;
            }

        }
        return count;
    }


    public static String[] swap(String[] stringArray) {

        String tmp = stringArray[0];
        stringArray[0] = stringArray[stringArray.length-1];
        stringArray[stringArray.length-1] = tmp;


        return stringArray;
    }




    public static String replaceCharacters(String str){
        String newString = "";
        newString = str.replace(("a"), "@").replace
                        ("s", "$").replace("S","$").replace
                        ("1", "!").
                replace("f", "7");




        return newString;
    }

    public static String createStringOfFibonnaciUpToMax (int maxNumber){
        int num1 = 0,  num2 = 1;




        System.out.println("Fib series up to " + maxNumber);

        while(num1 < maxNumber){
            System.out.print(num1 + ", ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }




        return "Max number given is " + maxNumber;
    }


    public static void main(String[] args) {
        System.out.println(vowelsCounter("aisha"));

        String[] stringArray = {"aisha", "bob", "larry",};

        String str = "The Farmer went to the store to get 1 dollar's worth of fertilizer";
        System.out.println(replaceCharacters(str.toLowerCase()));

        System.out.println(createStringOfFibonnaciUpToMax(100));

        System.out.println(Arrays.toString(swap(stringArray)));
    }

}