import java.util.HashSet;
import java.util.Scanner;

public class contain_duplicates {
    public static boolean dup(int nums[])
    {
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums)
        {
            if(seen.contains(num))
            {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num[]=new int[n];
        for(int i=0;i<n;i++)
        {
            num[i]=sc.nextInt();
        }
        System.out.println("Contains duplicate? "+dup(num));
        sc.close();
    }
}
