import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

/**
 * <h3>leetcode</h3>
 * <p>装水最多的容器</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-11-23 13:12
 **/
public class Ques11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int area = 0;
        while (left != right) {
            area = Math.max(area, Math.min(height[left], height[right]) * (right-left));
            if (height[left] >= height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Ques11 q = new Ques11();
        int[] arr1 = {8,3,2,7,5,4};
        System.out.println(q.maxArea(arr1));
    }
}
