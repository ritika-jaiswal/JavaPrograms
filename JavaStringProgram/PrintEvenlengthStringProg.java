package JavaStringProgram;

// Java program to print
// even length words in a string
public class PrintEvenlengthStringProg {
    public static void printEvenWord(String str) {
        for (String word : str.split(" "))
            if (word.length() % 2 == 0)
                System.out.println(word);

    }

    public static void main(String[] args) {
        String str = "I am Ritika Jaiswal ritz";
        printEvenWord(str);
    }

}
