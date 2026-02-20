import java.util.Scanner;

public class MinAndMax {
     public static int[] MaxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int j = 0; j < arr.length; j++) {
             if (arr[j] < min) {
                min = arr[j];
            }
            if (arr[j] > max) {
                max = arr[j];
            }
           
        }
           return new int[]{min, max};
     }

    public static void main(String[] args) {
     int [] nums;
     if (args.length != 0) {
        nums = new int[args.length];
    for (int i = 0; i < args.length; i++) {
        nums[i] = Integer.parseInt(args[i]);
        }
     }

     //using scannner 

     else {
        Scanner num = new Scanner(System.in);
        int numofElements = num.nextInt();
        nums = new int[numofElements];
        for (int i = 0; i < numofElements; i++) {
                nums[i] = num.nextInt();
            }
     }

        int[] result = MaxMin(nums);

        System.out.println("Minimum: " + result[0]);
        System.out.println("Maximum: " + result[1]);
    }
}
