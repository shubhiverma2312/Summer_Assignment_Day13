import java.util.*;
class q52
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array:");
        int i,odd=0,even=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0) even++;
            else odd++;
        }
        System.out.println("EVEN NUMBERS="+even);
        System.out.println("ODD NUMBERS="+odd);
    }
}