public class StringFunction2 {
    public static void main(String[] args) {
        // String s = "This is my first program";
        // String[] s2 = s.split(" ");
        // String temp = "";

        // for (int i = s2.length - 1; i >= 0; i--) {

        // temp = temp + " " + s2[i];

        // }
        // System.out.println(temp);

        String s1 = "earth";
        String s2 = "heart";
        boolean flag = false;

        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) != s2.charAt(j)) {
                        flag = false;
                    } else {
                        flag = true;
                        break;
                    }

                }
            }
        }
        System.out.println(flag);
    }
}
