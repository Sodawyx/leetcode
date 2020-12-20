import java.util.Stack;

/**
 * <h3>leetcode</h3>
 * <p>去除重复字母</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-12-20 11:04
 **/
public class Ques316 {
    /*使用栈的思想
    * 判定条件：最新的字母若比上一个字母小，栈顶的字母后面还有，则弹出*/
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (stack.contains(c)) continue;
            while(!stack.isEmpty() && stack.peek() > c && s.indexOf(stack.peek(), i)!=-1)
                stack.pop();
            stack.push(c);
        }
        char res[] = new char[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.get(i);
        }
        return new String(res);

    }

}
