import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>有效的括号</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-12-12 14:16
 **/
public class Ques20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.empty() || c != stack.pop()) return false;
        }
        return stack.empty();
    }
}
