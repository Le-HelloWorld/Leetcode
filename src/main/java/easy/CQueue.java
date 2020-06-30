package easy;

import java.util.LinkedList;

public class CQueue {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;
    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack2.addLast(value);
    }

    public int deleteHead() {
        if (stack1.isEmpty()) {
            if (stack2.isEmpty()) {
                return -1;
            }
            while (!stack2.isEmpty()) {
                stack1.add(stack2.pop());
            }
            return stack1.pop();
        }
        else {
            return stack1.pop();
        }
    }
}
