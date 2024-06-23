import java.util.Stack;

public class RemoveConsecutiveSubsequences {

    public static int[] solution(int[] arr) {

        Stack<Integer> st = new Stack<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (st.size() == 0 || st.peek() != arr[i])
                st.push(arr[i]);
            else if (arr[i] == st.peek()) {
                if (i == n - 1 || arr[i] != arr[i + 1])
                    st.pop();
            }
        }

        int[] res = new int[st.size()];

        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = st.pop();
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7 };

        int[] ans = solution(arr);

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}