package JavaMethodProg;

public class CodePointAtMethof {
    public static void main(String[] args) {
        StringBuffer stb = new StringBuffer();
        stb.append("RitikaJaiswal");
        int unicode = stb.codePointAt(8);
        System.out.println(unicode);
    }

}
