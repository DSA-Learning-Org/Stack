import java.util.Stack;

public class ReverseString {

    public static String solution(String str) {
        Stack<Character> st = new Stack<>();
        int i = 0;

        while (str.length() - 1 >= i) {
            st.push(str.charAt(i));
            i++;
        }

        String word = new String();

        while (st.size() - 1 >= 0) {
            word += st.pop();
        }

        return word;
    }

    public static String betterSolution(String str) {
        Stack<Character> st = new Stack<>();

        String word = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            st.push(str.charAt(i));
            word += st.pop();
        }

        return word;
    }

    public static void reverseString(char[] s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i <= s.length - 1; i++) {
            st.push(s[i]);
        }

        System.out.println(st);

        int j = 0;
        while (st.size() - 1 >= 0) {
            s[j] = st.pop();
            j++;
        }

        System.out.println(s);
    }

    public static void main(String[] args) {
        String str = "GeeksforGeeks";

        char[] s = { 'h', 'e', 'l', 'l', 'o' };

        System.out.println("Brute force Approach : " + solution(str));

        System.out.println("Better Approach : " + betterSolution(str));

        System.out.print("Reverse char Array : ");
        reverseString(s);
    }
}
