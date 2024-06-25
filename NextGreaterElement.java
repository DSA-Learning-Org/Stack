import java.util.Stack;

public class NextGreaterElement {

    public static int[] solution(int[] arr) {
        int n = arr.length;
        int[] res = new int[n - 1];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 2; i >= 0; i--) {
            while (st.size() > 0 && arr[i] > st.peek()) {
                st.pop();
            }
            if (st.size() == 0) {
                res[i] = -1;
            } else {
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 2, 1, 6, 3, 4 };

        int[] ans = solution(arr);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}