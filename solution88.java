
    import java.util.*;

    public class solution88 {
        static boolean canBeEqual(String a, String b, int n) {
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    char[] aChars = a.toCharArray();
                    char[] bChars = b.toCharArray();
                    char temp = aChars[i];
                    aChars[i] = bChars[j];
                    bChars[j] = temp;
                    a = new String(aChars);
                    b = new String(bChars);
                    if (a.equals(b)) {
                        flag = true;
                        break;
                    }
                    temp = aChars[i];
                    aChars[i] = bChars[j];
                    bChars[j] = temp;
                    a = new String(aChars);
                    b = new String(bChars);
                }
                if (flag) break;
            }
            return flag;
        }

        // Driver code
        public static void main(String[] args) {
            String A = "ab";
            String B = "ba";

            if (canBeEqual(A, B, A.length())) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }

    }

}
