package Chapter8;

public class StringTextProcessor {
    public static void main(String[] args){
        countWords("I love Automation Test University");
        reverseString("Hello TAU");
        addSpaces("HeyWorld!It'sMeAngie");
    }
    /**
     * Splits a String int an array by tokenizing it.
     * Count words and prints them.
     * @param text Full string to be split
     */
    private static void countWords(String text){
        var words = text.split(" ");
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);

        for (int i = 0; i<numberOfWords; i++){
            System.out.println(words[i]);
        }

    }

    /**
     * Prints a String in reverse order
     * @param text String to reverse.
     */

    public static void reverseString(String text){
        for (int j=text.length()-1; j>=0; j--){
            System.out.print(text.charAt(j));
        }
    }

    /**
     * Add spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text){
        var modifiedText = new StringBuilder(text);
        for(int i = 0; i<modifiedText.length(); i++){
            if (i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }
}
