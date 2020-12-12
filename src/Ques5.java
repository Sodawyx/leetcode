/**
 * <h3>leetcode</h3>
 * <p>最长回文子串</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-10-01 13:43
 **/
public class Ques5 {
    /**
     * 这里使用的是中心扩散法
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        int maxLenE = 0;
        int maxLenO = 0;
        int lenE, lenO;
        String resE = "";
        String resO = "";
        for (int i = 0; i < s.length()-1; i++){
            lenE = judgeEven(s, i, i+1);
            lenO = judgeOdd(s, i);
            if (s.charAt(i) == s.charAt(i+1)){
                if (lenE > maxLenE)
                    resE = s.substring(i - lenE + 1, i + lenE + 1);
                maxLenE = Math.max(maxLenE, lenE);
                if (lenO  > maxLenO)
                    resO = s.substring(i - lenO +1, i + lenO);
                maxLenO = Math.max(maxLenO, lenO );
            } else {
                if (lenO  > maxLenO)
                    resO = s.substring(i - lenO +1, i + lenO );
                maxLenO = Math.max(maxLenO, lenO);
            }
        }
        if (s.length() == 1) {
            return s;
        }
        if (resE.length() > resO.length()){
            return resE;
        } else return resO;

    }

    public int judgeOdd(String s, int center){
        int offset = 0;
        for(int i = 0; i <= Math.min(s.length()-center-1, center); i++){
            if (s.charAt(center - i) == s.charAt(center + i)){
                if (i == center || i == s.length()-center-1){
                    offset = i + 1;
                    break;
                }
                offset ++;
            } else {
                break;
            }
        }
        return offset;
    }

    public int judgeEven(String s, int centerL, int centerR){
        int offset = 0;
        for(int i = 0; i <= Math.min(centerL, s.length()-centerR-1); i++){
            if (s.charAt(centerL - i) == s.charAt(centerR + i)){
                if (i == centerL || i == s.length()-centerR-1){
                    offset = i + 1;
                    break;
                }
                offset ++;
            } else break;
        }

        return offset;

    }

    public static void main(String[] args) {
        Ques5 q = new Ques5();
        System.out.println(q.longestPalindrome("ccc"));
    }
}
