import java.util.Stack;

public class DeleteAtMid {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int mid = (int) Math.floor(st.size() / 2);

        if (st.size() % 2 == 0) {
            mid = mid - 1;
        }

        while (st.size() > mid) {
            rt.push(st.pop());
        }

        rt.pop();

        while (rt.size() > 0) {
            st.push(rt.pop());
        }

        System.out.println(st);

    }
}
