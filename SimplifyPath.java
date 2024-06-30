/* //! Given an absolute path for a Unix-style file system, which begins with a slash '/', transform this path into its simplified canonical path.

//* In Unix-style file system context, a single period '.' signifies the current directory, a double period ".." denotes moving up one directory level, and multiple slashes such as "//" are interpreted as a single slash. In this problem, treat sequences of periods not covered by the previous rules (like "...") as valid names for files or directories.

? The simplified canonical path should adhere to the following rules:

! - It must start with a single slash '/'.
! - Directories within the path should be separated by only one slash '/'.
! - It should not end with a slash '/', unless it's the root directory.
! - It should exclude any single or double periods used to denote current or parent directories.
! - Return the new path.
*/

import java.util.Stack;

public class SimplifyPath {
    public static String solution(String str) {
        Stack<String> st = new Stack<>();

        String[] dir = str.split("/");

        for (String i : dir) {
            if (i.equals(".") || i.isEmpty()) {
                continue;
            } else if (i.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(i);
            }
        }

        return "/" + String.join("/", st);
    }

    public static void main(String[] args) {
        String str = "/home/a/./../.../b/../c/./d/";

        System.out.println(solution(str));
    }
}
