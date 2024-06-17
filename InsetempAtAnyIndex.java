import java.util.Stack;

public class InsetempAtAnyIndex {
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
        Stack<Integer> temp = new Stack<>();

        while (st.size() > 1) {
            temp.push(st.pop());
        }

        st.push(6);

        while (temp.size() > 0) {
            st.push(temp.pop());
        }

        System.out.println(st);

    }
}
