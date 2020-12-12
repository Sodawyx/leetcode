/**
 * <h3>leetcode</h3>
 * <p>整数反转</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-11-19 15:18
 **/
public class Ques7 {
    public int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x /= 10;
        }
        if ((int)n != n) {
            return 0;
        }else {
            return (int)n;
        }


    }

    public static void main(String[] args) {
        Ques7 q = new Ques7();
        System.out.println(q.reverse(2147483647));
    }
}
