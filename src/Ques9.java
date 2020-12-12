/**
 * <h3>leetcode</h3>
 * <p>回文数</p>
 * 当时做错
 * @author : Yuxuan Wu
 * @date : 2020-11-19 19:09
 **/
public class Ques9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rem=0,y=0;
        int quo=x;
        while(quo!=0){
            rem=quo%10;
            y=y*10+rem;
            quo=quo/10;
        }
        return y==x;
    }

    public static void main(String[] args) {
        Ques9 q = new Ques9();
        System.out.println(q.isPalindrome(1000021));
    }
}
