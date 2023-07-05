package ArrayListPractice;

public class ExceptionPractice {
    public static void main(String[] args) {
        try {
            System.out.println("try");
            int[] num = { 1, 2, 3, 4 };
            System.out.println(num[7]);

        } catch (Exception e) {
            System.out.println("Somthing went wrong" + e);
        } finally {
            System.out.println("try catch block is finished");
        }
    }

}
