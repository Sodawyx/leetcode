/**
 * <h3>leetcode</h3>
 * <p>罗马数字转整数</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-11-23 14:01
 **/
public class Ques13 {
    public int romanToInt(String s) {
        s = s.replace("IV", "a");
        s = s.replace("IX", "b");
        s = s.replace("XL", "c");
        s = s.replace("XC", "d");
        s = s.replace("CD", "e");
        s = s.replace("CM", "f");
        int res = 0;

        for (char c : s.toCharArray()) {
            res += convert(c);
        }

        return res;
    }

    public int convert(char x) {
        switch (x) {
            case 'I' : return 1;
            case 'V' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
            case 'a' : return 4;
            case 'b' : return 9;
            case 'c' : return 40;
            case 'd' : return 90;
            case 'e' : return 400;
            case 'f' : return 900;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        Ques13 q = new Ques13();
        System.out.println(q.romanToInt("IV"));
    }
}
