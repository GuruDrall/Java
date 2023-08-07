public class StringFunction {
    class CheckPal {

        boolean checkPalindrom(String s) {
            int a = s.length();
            char c;
            for (int i = 0; i < a / 2; i++) {
                if (true) {
                    c = s.charAt(i);
                    return true;
                }
            }

            return false;
        }

    }

    public static void main(String[] args) {

        String s = "nitin";
        boolean b = checkPalindrom(s);

        // String str[] = { "test.java", "test1.css", "test2.java", "test3.js",
        // "test4.java" };
        // String str1[] = null;
        // boolean b = str[0].endsWith(".java");
        // System.out.println(b);

        // for (String s : str) {
        // boolean b = s.endsWith(".java");
        // if (b == true) {
        // System.out.println(s);
        // }
        // }
        // System.out.println(str1);

        // String str[] = { "test.java", "test1.css", "test2.java", "test3.js",
        // "test4.java" };
        // String str1 = null;

        // for (String s : str) {
        // boolean b = s.endsWith(".java");
        // if (b == true) {
        // str1 = str1 + " " + s;
        // // System.out.println(s);
        // }
        // }
        // System.out.println(str1);

        // String strarr[] = { "text.py", "abc.java", "index.html", "test.java",
        // "script.js" };

        // String ans[] = new String[strarr.length];
        // int j = 0;
        // for (int i = 0; i < strarr.length; i++) {
        // if (strarr[i].endsWith(".java")) {
        // ans[j] = strarr[i];
        // // System.out.println(ans[j]);
        // j++;

        // }

        // }
        // for (int i = 0; i < j; i++) {
        // System.out.println(ans[i]);
        // }
    }
}
