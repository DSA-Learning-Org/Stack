import java.util.Stack;

public class MoveStackInSameOrder {
    public static void main(String[] args) {
        // ! Stack 1
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println();
        System.out.println(st);

        // ! Stack 2 to reverse 1st stack
        Stack<Integer> rt = new Stack<>();

        while (st.size() > 0) {
            rt.push(st.pop());
        }

        // ! Stack 3 to reverse 2nd stack
        Stack<Integer> gt = new Stack<>();

        while (rt.size() > 0) {
            gt.push(rt.pop());
        }

        System.out.println(gt);

        // ! Time complexity : O(n) | Space complexity : O(n)
    }
}
