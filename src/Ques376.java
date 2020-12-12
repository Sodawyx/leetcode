/**
 * <h3>leetcode</h3>
 * <p>每日一题：摆动序列</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-12-12 20:41
 **/
public class Ques376 {
    public int wiggleMaxLength(int[] nums) {
        int[] answerList;
        int peakNode = 1;
        if(nums.length < 2) {
            return nums.length;
        }
        boolean isUp = true; //标记着一段是上升还是下降
        if (nums[1] - nums[0] > 0) {
            isUp = true;
            peakNode ++;
        } else if (nums[1] - nums[0] < 0) {
            isUp = false;
            peakNode ++;
        }
        boolean nowUp = true;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) nowUp = true;
            else if (nums[i] < nums[i - 1]) nowUp = false;
            if (nowUp != isUp) peakNode++;
            isUp = nowUp;
        }
        return peakNode;

    }
}
