public class Permutations {

    /*
        abc
        bca
        cab
        acb
        cba
        bac
     */
    public static void getPermutations(String s) {
        String ans = "";
        printPermutation(s, ans);
    }

    private static void printPermutation(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            
            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) + str.substring(i + 1);

            // Recursive call
            printPermutation(ros, ans + ch);
        }
    }

    public static void main(String[] args) {
        getPermutations("abc");
    }
}
