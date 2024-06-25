import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {
    public static boolean solution(String str) {
        Stack<Character> st = new Stack<>();

        for (char i : str.toCharArray()) {
            if (i == '(' || i == '{' || i == '[') {
                st.push(i);
            } else if (i == '}') {
                if (st.peek() == '{')
                    st.pop();
                else
                    return false;
            } else if (i == ')') {
                if (st.peek() == '(') {
                    st.pop();
                } else
                    return false;
            } else if (i == ']') {
                if (st.peek() == '[') {
                    st.pop();
                } else
                    return false;
            }
        }

        return st.empty();
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            System.out.print(solution(str));
        }
    }

}