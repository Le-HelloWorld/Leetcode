package easy;

import java.util.HashMap;
import java.util.Stack;

public class BracketsIsValid {
    public boolean isValid(String s) {
        HashMap<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put(']', '[');
        mapping.put('}', '{');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (mapping.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mapping.get(c)) {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
