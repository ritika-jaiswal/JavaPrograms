package JavaStringProgram;

// Java Program to Reverse a String using Stack
import java.util.Stack;

class RevrsStr {
    public static String revrseString(String str) {
        char[] charArr = new char[str.length()];

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        int i = 0;
        while (!stack.isEmpty()) {
            charArr[i++] = stack.pop();
        }
        return new String(charArr);
    }
}

public class UsingStackReavrseAStr {
    public static void main(String[] args) {
        String name = "RitikaJaiswal";
        System.out.println("Original String: " + name);
        System.out.println("Reavresed String: " + RevrsStr.revrseString(name));
    }

}
