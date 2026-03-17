import java.util.*;
public class SecondLargest 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int larg=Integer.MIN_VALUE;
        int seclrgst=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) 
        {
            if(nums[i]>larg) 
            {
                seclrgst=larg;
                larg=nums[i];
            }
        }

        System.out.println(seclrgst);
    }
}