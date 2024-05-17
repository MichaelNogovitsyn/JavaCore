package src.Lesson2;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,2,1,1};
        System.out.println(findEqual(arr));
    }
    static boolean findEqual(int[] arr)
    {
        int sumL=0;
        int sumR=0;
        int sumTotal = 0;
        for (int i = 0; i < arr.length; i++) {
            sumTotal += arr[i];
        }
        System.out.println("Total = " + sumTotal);
        for (int i = 0; i < arr.length; i++) {
            sumL +=arr[i];
            sumR = sumTotal-sumL;
            if (sumL==sumR) return true;
        }
        return false;}
}
