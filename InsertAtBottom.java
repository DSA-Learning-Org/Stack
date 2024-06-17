import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        // ! Stack 1
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        System.out.println();
        System.out.println(st);

        // ! Stack 2
        Stack<Integer> rt = new Stack<>();

        while (st.size() > 0) {
            rt.push(st.pop());
        }

        st.push(5);

        while (rt.size() > 0) {
            st.push(rt.pop());
        }

        System.out.println(st);
    }
}
