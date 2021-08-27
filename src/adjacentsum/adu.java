package adjacentsum;
import java.util.*;

public class adu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n,i,sum=0,diff;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     int arr[]=new int[n+1];
     for(i=0;i<n;i++)
     {
    	 arr[i]=sc.nextInt();
     }
     for(i=0;i<n-1;i++)
     {
    	 diff=(arr[i]-arr[i+1]);
    	if(diff>=0)
    	{
    		sum=sum+diff;
    	}
    	else
    	{
    		sum=sum-diff;
    	}
    		    
   			 
     }
     System.out.println(sum);
	}

}
