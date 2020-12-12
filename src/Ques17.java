import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>电话号码的字母组合</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-12-01 11:40
 **/
/*本题主要使用回溯法，回溯法需要在未来的题目中好好总结下，特别是和递归结合*/
public class Ques17 {

        // 数字到号码的映射
        private String[] map = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        // 路径
        private StringBuilder sb = new StringBuilder();

        // 结果集
        private List<String> res = new ArrayList<>();

        public List<String> letterCombinations(String digits) {
            if(digits == null || digits.length() == 0) return res;
            backtrack(digits,0);
            return res;
        }

        // 回溯函数
        private void backtrack(String digits,int index) {
            if(sb.length() == digits.length()) {
                res.add(sb.toString());
                return;
            }
            String val = map[digits.charAt(index)-'2'];
            for(char ch:val.toCharArray()) {
                sb.append(ch);
                backtrack(digits,index+1);
                sb.deleteCharAt(sb.length()-1);
            }
        }

    public static void main(String[] args) {
        Ques17 q = new Ques17();
        System.out.println(q.letterCombinations("25"));
    }

}
