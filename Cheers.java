//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String str = args[0];
        int amount = Integer.parseInt(args[1]);
                String an = "AEFHILMNORSXaefhilmnorsx";
                str= str.toUpperCase();
            for (int i = 0 ; i<str.length() ; i++){
                char c = str.charAt(i);
                if (an.indexOf(c)==-1) { System.out.println("Give me a  " + (str.charAt(i)) + ": " + str.charAt(i) + "!");}
                  else { System.out.println("Give me an " + str.charAt(i) + ": " + str.charAt(i) + "!");       
        
            }
        }
                System.out.println("What does that spell?");

        for (int i = 0; i<amount; i++){
                System.out.println(str + "!!!");
        }

        }
}
