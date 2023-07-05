package JavaStringProgram;

import java.util.ArrayList;

public class SplitAllPosibleSubString {
    public static ArrayList<String> spiltSubString(String subStr) {
        int i, j;
        int strLength = subStr.length();
        ArrayList<String> subStringList = new ArrayList<>();

        for (i = 0; i < strLength; i++) {
            for (j = i + 1; j <= strLength; j++) {
                subStringList.add(subStr.substring(i, j));
            }
        }
        return subStringList;

    }

    public static void main(String[] args) {
        String strInput = "Ritika";
        ArrayList<String> subStringList = SplitAllPosibleSubString.spiltSubString(strInput);
        System.out.println(
                "\nSubstring list printed as an ArrayList : ");
        System.out.println(subStringList);
        System.out.println(
                "\n\nAll substrings printed 1 per line : ");
        int count = 1;

        // each substring would be printed
        // within double quotes
        for (String it : subStringList) {
            System.out.println("(" + count + ") \"" + it
                    + "\"");
            count++;
        }

    }

}
