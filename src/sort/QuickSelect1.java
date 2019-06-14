package sort;


import util.PracticeUtil;

/**
 * 快速排序
 * 时间复杂度为：O(NlogN)  因为2^k=N  k=logN  每一次最多移动N次，就是NlogN
 */
public class QuickSelect1 {

    public static void main(String[] args) {

        int arr1[] = {6, 8, 7, 5, 3, 1, 2, 4};
        int arr[] = {10,9,8,6,5,3,2,1,5,6,7,8,0,1,2,3,7,2,9,0};
        sort(0, arr.length - 1, arr);
        PracticeUtil.arrPrint(arr);
    }

    public static void sort(int low, int high, int[] arr) {
        int i, j, temp, t;
        i = low;
        j = high;
        //终止递归，防止栈溢出
        if (low > high) {
            return;
        }
        temp = arr[low];
        while (i < j) {
            //从j开始向左，找比temp小的
            while (arr[j] >= temp && i < j) {
                j--;
            }
            //从i开始向右，找比temp大的
            while (arr[i] <= temp && i < j) {
                i++;
            }
            //交换
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        //i和j相遇了,把temp放到合适的位置
        t = arr[i];
        arr[low] = arr[i];
        arr[i] = temp;
        //排temp左边的
        sort(low, j - 1, arr);
        //排temp右边的
        sort(j + 1, high, arr);

    }


}
