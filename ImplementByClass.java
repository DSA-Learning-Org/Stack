import java.util.Stack;

public class ImplementByClass {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(4);
        st.push(3);
        st.push(39);

        System.out.println("Stack " + st);

        st.pop();

        System.out.println("After pop " + st);
    }
}
