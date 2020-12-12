/**
 * <h3>leetcode</h3>
 * <p>寻找两个正序数组中的中位数</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-10-01 10:37
 **/
public class Ques4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int[] res = new int[length];
        double d = 0.0;
        int i, j, z;
        for(i = 0, j = 0, z = 0;  z < length;) {
            if(i == nums1.length){
                res[z] = nums2[j];
                j++;
            }
            else if(j == nums2.length){
                res[z] = nums1[i];
                i++;
            } else {
                if (nums1[i] <= nums2[j]) {
                    res[z] = nums1[i];
                    i++;
                } else {
                    res[z] = nums2[j];
                    j++;
                }
            }
            z++;
        }
            if(length % 2 == 0){
                d = (res[length/2] + res[length/2-1])/2.0;
            } else {
                d = res[(length-1)/2];
            }


        return d;
    }

    public static void main(String[] args) {
        Ques4 q = new Ques4();
        int[] a1 = new int[2];
        int[] a2 = new int[1];

        System.out.println(q.findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4}));
    }
}
