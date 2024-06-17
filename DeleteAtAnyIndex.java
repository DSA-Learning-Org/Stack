import java.util.Stack;

public class DeleteAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println();
        System.out.println(st);

        Stack<Integer> rt = new Stack<>();

        while (st.size() > 1) {
            rt.push(st.pop());
        }

        rt.pop();

        while (rt.size() > 0) {
            st.push(rt.pop());
        }

        System.out.println(st);
    }
}
