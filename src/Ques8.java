/**
 * <h3>leetcode</h3>
 * <p>字符串转换整数（atoi）</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-11-19 15:59
 **/
public class Ques8 {
    public int myAtoi(String s) {
        if (s.length() == 0) return 0;
        //首先去除单词前面的空格
        int i = 0;
        while (s.charAt(i) == ' ' && i < s.length() - 1) {
            i++;
        }
        if (i == s.length()) return 0;
        s = s.substring(i);
        i = 0;

        //判定负数标志
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            s = s.substring(1);
        }
        int ans = 0;
        for (i = 0; i < s.length(); i++) {
            //如果出现其他字符则退出
            if (s.charAt(i) > '9' || s.charAt(i) < '0') break;
            if (ans  > (Integer.MAX_VALUE - (s.charAt(i) - '0')) / 10) return  Integer.MAX_VALUE;
            if (ans < (Integer.MIN_VALUE + (s.charAt(i) - '0')) / 10) return Integer.MIN_VALUE;
            ans = ans * 10 + sign * (s.charAt(i) - '0');
        }
        return ans;

    }

    public static void main(String[] args) {
        Ques8 q = new Ques8();
        System.out.println(q.myAtoi(""));
    }
}
