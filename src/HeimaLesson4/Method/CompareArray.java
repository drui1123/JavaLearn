package HeimaLesson4.Method;

import static java.lang.Math.abs;

public class CompareArray {
    /*比较两个Int型数组是否完全一样，是的话返回True，不是的话返回False
    * */
    public static void main(String[] args) {
        int[] arr1 = {10,22};
        int[] arr2 = {10,22};
        System.out.println(CampareArray(arr1, arr2));
    }

    public static boolean CampareArray(int[] a, int[] b){
        if (a == null && b == null){
            return true;
        }

        if (a == null || b == null){
            return false;
        }

        if (a.length != b.length){
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                return false;
            }
        }

        return true;
    }
}
