import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>括号生成</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-12-12 20:03
 **/
public class Ques22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) return res;
        dfs(res, "", 0, 0, n);
        return res;
    }

    private void dfs(List<String> strList, String str, int left, int right, int nums) {
        if (left == nums && right == nums) {
            strList.add(str);
            return;
        }
        if (left < right) return;
        if (left < nums) {
            dfs(strList, str + "(", left + 1, right, nums);
        }
        if (right < nums) {
            dfs(strList, str + ")", left, right + 1, nums);
        }
    }
}
