import java.util.HashMap;
import java.util.Map;

/**
 * <h3>leetcode</h3>
 * <p>Leetcode-01</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-07-02 21:22
 **/
public class Ques1 {
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                return new int[] {map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException();
    }
    public static void main(String[] args) {
        int[] hello = new int[]{0, 1, 2, 3, 4};
        System.out.println(twoSum(hello, 4));
    }
}
