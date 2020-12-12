import sun.font.CreatedFontTracker;

/**
 * <h3>leetcode</h3>
 * <p>整数转罗马数字</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-11-23 13:36
 **/
public class Ques12 {
    public String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        StringBuilder res = new StringBuilder("");
        while (i < nums.length) {
            while (nums[i] <= num) {
                res.append(romans[i]);
                num -= nums[i];
            }
            i++;
            if (num == 0) break;
        }
        return res.toString();

    }

    public static void main(String[] args) {
        Ques12 q = new Ques12();
        System.out.println(q.intToRoman(3900));
    }
}
