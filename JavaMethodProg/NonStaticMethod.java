
// Java program to Illustrate Calling of a Nov-Static Method

package JavaMethodProg;

class Helper {
    public int sum(int a, int b) {
        return a + b;
    }
}

public class NonStaticMethod {

    public static void main(String[] args) {
        Helper helper = new Helper();
        int ans = helper.sum(3, 8);
        System.out.println("sum: " + ans);
    }

}
