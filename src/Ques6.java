import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>Z字形变换</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-11-19 14:19
 **/
public class Ques6 {
    public String convert(String s, int numRows) {
        if (s.length() < numRows || numRows == 1) return s;
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int cur = 0;
        boolean flag = true;
        for (char c : s.toCharArray()) {
            rows.get(cur).append(c);
            if (cur == 0) {
                flag = true;
            } else if (cur == numRows -1) {
                flag = false;
            }
            if (flag) cur ++;
            else cur --;

        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();

    }

    public static void main(String[] args) {
        Ques6 q6 = new Ques6();
        System.out.println(q6.convert("LE", 1));
    }
}
