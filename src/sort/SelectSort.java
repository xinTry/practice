package sort;

/**
 * 选择排序
 */
public class SelectSort {

    public static void main(String[] args) {
        int arr[] = {9, 4, 3, 6, 8, 7, 1, 5, 2};
        for (int i = 0; i < arr.length; i++) {
            int lowIndex = getLowIndex(arr, i);
           // exchangeEle(arr,i,lowIndex);
        }
        printEle(arr);
    }

    /**
     * 获取最小数值的索引
     * @param arr
     * @param startIndex
     * @return
     */
    public static int getLowIndex(int[] arr, int startIndex) {
        int lowIndex=startIndex;
        for (int j = startIndex; j < arr.length; j++) {
            if(arr[lowIndex]>arr[j]){
                lowIndex=j;
            }
        }
        exchangeEle(arr,startIndex,lowIndex);
        return lowIndex;
    }

    /**
     * 交换数值
     * @param arr
     * @param startIndex
     * @param lowIndex
     */
    public static void exchangeEle(int[] arr,int startIndex,int lowIndex){
        int temp;
        temp=arr[startIndex];
        arr[startIndex]=arr[lowIndex];
        arr[lowIndex]=temp;
    }

    public static void printEle(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+",22,,,,");
        }
    }

}
