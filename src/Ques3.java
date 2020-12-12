import java.util.HashMap;
import java.util.Map;

/**
 * <h3>leetcode</h3>
 * <p>无重复字符的最长字串</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-09-24 23:58
 **/
public class Ques3 {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int maxlen = 0;
        int i, j = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (i = 0, j = 0; j < length; j++) {
            if(map.containsKey(s.charAt(j))) {
                /*这里+1的目的是防止空串的情况和只有一个字符*/
                i = Math.max(i, map.get(s.charAt(j)) + 1);
            }
            map.put(s.charAt(j), j);
            maxlen = Math.max(maxlen, j - i + 1);
        }
        return maxlen;
    }
}
