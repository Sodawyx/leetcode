import com.sun.xml.internal.fastinfoset.util.QualifiedNameArray;

/**
 * <h3>leetcode</h3>
 * <p>旋转图像-每日一题</p>
 *
 * @author : Yuxuan Wu
 * @date : 2020-12-19 16:38
 **/
public class Ques48 {
    public void rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return;
        int n = matrix.length; //表示n*n矩阵
        /*第一步沿右下方向对称变换*/
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (i+1); j++) {
                if (i == j) continue;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        /*第二步左右镜像对称变换*/
        //若n为偶数
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n-j-1];
                    matrix[i][n-j-1] = temp;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < ((n-1) / 2); j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][n-j-1];
                    matrix[i][n-j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Ques48 q = new Ques48();
        q.rotate(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}});
    }
}
