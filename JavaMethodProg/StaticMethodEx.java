
// Java program to Illustrate Calling of a Static Method

package JavaMethodProg;

class Helper {
    public static int sum(int a, int b) {
        return a + b;
    }
}

public class StaticMethodEx {

    public static void main(String[] args) {
        int ans = Helper.sum(3, 8);
        System.out.println("sum: " + ans);
    }

}
