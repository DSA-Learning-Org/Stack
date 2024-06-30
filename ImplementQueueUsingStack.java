import java.util.Stack;

class Queue {
    public Stack<Integer> ip = new Stack<>();
    public Stack<Integer> op = new Stack<>();

    public int dequeue() {
        if (op.isEmpty() && ip.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (op.isEmpty()) {
            while (!ip.isEmpty()) {
                op.push(ip.pop());
            }
            System.out.println(op.pop());
        }
        return -1;
    }

    public void enqueue(int x) {
        ip.push(x);
    }
}

public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(2);
        q.enqueue(3);
        q.dequeue();
        q.enqueue(4);
        q.dequeue();
    }

}
