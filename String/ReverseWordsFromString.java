/**
 * Reverse all words from String
 */
public class ReverseWordsFromString {

    public static void main(String args[]) {
        String str = "This is sample String";
        String revString = "";
        String[] words = str.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            revString += words[i] + " ";
        }

        System.out.println("Original String : " + str);
        System.out.println("Reverse String : " + revString);
    }
}
