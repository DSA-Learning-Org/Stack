import java.util.Stack;

public class DeleteFromBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println();
        System.out.println(st.peek());

        Stack<Integer> rt = new Stack<>();

        while (st.size() > 0) {
            rt.push(st.pop());
        }

        rt.pop();

        while (rt.size() > 0) {
            st.push(rt.pop());
        }

        System.out.println(st);
    }
}
