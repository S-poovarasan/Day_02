import java.util.*;
public class MaxSubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int cur=arr[0];
        int maxm=arr[0];
        for(int i=1;i<arr.length;i++) {
            cur=Math.max(arr[i],cur+arr[i]);
            maxm=Math.max(maxm,cur);
        }
        System.out.print(maxm);
    }
}
