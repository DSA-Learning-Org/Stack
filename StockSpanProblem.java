import java.util.Stack;

public class StockSpanProblem {
    public static int[] solution(int[] arr) {
        int n = arr.length;
        int[] res = new int[n - 1];

        Stack<Integer> st = new Stack<>();

        st.push(arr[0]);
        res[0] = st.peek();
        for (int i = 0; i <= n; i++) {
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
        int[] arr = { 10, 4, 90, 120, 80 };

        int[] ans = solution(arr);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}