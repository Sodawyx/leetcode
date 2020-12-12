import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>四数之和</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-12-11 16:50
 **/
public class Ques18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null || nums.length < 4) return result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) { //注意这里的边界条件
            if (i > 0 && nums[i] == nums[i-1]) continue;
            if (nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) break;
            if (nums[i] + nums[nums.length-1] + nums[nums.length-2] + nums[nums.length-3] < target) continue;
            for (int j = i + 1; j < nums.length - 2; j++) { //注意这里的边界条件
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                if (nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) break;
                if (nums[i] + nums[j] + nums[nums.length-1] + nums[nums.length-2] < target) continue;
                int left = j + 1, right = nums.length - 1;
                while (left < right) {
                    int temp = nums[i] + nums[j] + nums[left] + nums[right];
                    if (temp == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[++left]);
                        while (left < right && nums[right] == nums[--right]);
                    } else if (temp < target) {
                        while (left < right && nums[left] == nums[++left]);
                    } else if (temp > target) {
                        while (left < right && nums[right] == nums[--right]);
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Ques18 q = new Ques18();
        System.out.println(q.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
    }
}
