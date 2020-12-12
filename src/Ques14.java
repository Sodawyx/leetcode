/**
 * <h3>leetcode</h3>
 * <p>最长公共前缀</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-11-23 14:38
 **/
public class Ques14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];
        StringBuilder cs = new StringBuilder("");
        for (int j = 0; ; j++) {
            int i = 1;
            for (; i < strs.length; i++) {
                if (j > strs[i-1].length() - 1 || j > strs[i].length() - 1) {
                    return cs.toString();
                }
                if (strs[i-1].charAt(j) != strs[i].charAt(j)) {
                    return cs.toString();
                }

            }
            i--;
            cs.append(strs[i].charAt(j));
        }
    }

    public static void main(String[] args) {
        Ques14 q = new Ques14();
        String[] strs = {"", ""};
        System.out.println(q.longestCommonPrefix(strs));
    }
}
