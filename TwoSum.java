import java.util.*;
public class TwoSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[10];
        for(int i=0;i<size;i++)
        {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for (int j = 0; j < size-1; j++) {
            for (int k = j + 1; k < size; k++) {
                if (nums[j] + nums[k] == target) {
                    System.out.println("Values are : "+nums[j]+","+nums[k]);
                }
            }
        }
        sc.close();
    }
}
