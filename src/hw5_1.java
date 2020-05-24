import java.util.Scanner;

public class hw5_1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // get number of entries
        int num = in.nextInt();

        // create array to hold them
        int[] nums = new int[num];

        // read numbers into array
        for (int i = 0; i < num; i++) {
            int temp = in.nextInt();
            nums[i] = temp;
        }

        in.close();

        System.out.println(div(nums, 0, nums.length));
    }

    public static int div(int[] input, int start, int end) {
        // if the input is 2 numbers, return the larger
        if (end - start == 2) {
            return Math.max(input[start], input[end]);
        }

        // if the input is only 1, return that number
        else if (end - start == 1) {
            return input[start];
        }

        // create new values for recursive call
        else {
            // create sub arrays of 1/2 the size each
            int sub1 = div(input,  start, (start + end) / 2);
            int sub2 = div(input, (start + end) / 2 + 1, end);

            // recursive call
            return Math.max(sub1, sub2);
        }
    }
}
