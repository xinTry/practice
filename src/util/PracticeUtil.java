package util;

/**
 * 公共方法类
 */
public class PracticeUtil {

    public static void arrPrint(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            if(i<arr.length-1){
                System.out.print(arr[i]+",");
            }else{
                System.out.print(arr[i]);
            }
        }
    }

}
