import java.util.*;

public class BalancedBracket {
    public static boolean balancedBracketFunc(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0)
                    return false;
                if (st.peek() == '(')
                    st.pop();
            }
        }
        if (st.size() > 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();

            System.out.println(balancedBracketFunc(str));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
