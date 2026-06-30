import java.util.*;
class q50
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of the array:");
        int i,sum=0;
        double avg;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        avg=sum/n;
        System.out.println("SUM="+sum);
        System.out.println("AVERAGE="+avg);
    }
}