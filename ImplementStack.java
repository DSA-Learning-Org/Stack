/**
 * ImplementStack
 */
public class ImplementStack {
    private int[] arr;
    private int top;
    private int capacity;

    // ! Creating a stack
    ImplementStack(int size) {
        // ! Initialize the array
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    public int getSize() {
        return top + 1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Your stack is full");
            System.exit(1);
        }

        arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            System.exit(1);
        }

        return arr[top--];
    }

    public void displayStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        ImplementStack st = new ImplementStack(5);

        st.push(4);
        st.push(3);
        st.push(83);
        st.push(2);

        System.out.println();
        System.out.print("Stack ");

        st.displayStack();

    }

}