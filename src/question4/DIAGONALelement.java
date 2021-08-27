package question4;
import java.util.Scanner;
public class DIAGONALelement {
	public static void main(String [] args)
	{
		int n,i,j,m,k=0;
	       Scanner sc=new Scanner(System.in);
	       n=sc.nextInt();
	       m=sc.nextInt();
	       int arr[][] = new int [n][m];
	       if(n==m)
	       {
	       for(i=0;i<n;i++)
	       {
	    	   for(j=0;j<m;j++)
	    	   {
	    	   arr[i][j]=sc.nextInt();
	    	   }
	       }
	       for(i=0;i<n;i++)
	       {
	    	   for(j=0;j<m;j++)
	    	   {
	    	    if(i!=j)
	    	    {
	    	    	if(arr[i][j]!=0)
	    	    	{
	    	    	   k=1;
	    	    	   break;
	    	    	}
	    	    }
	    	    else
	    	    {
	    	    	if(arr[i][j]==0)
	    	    	{
	    	    		k=1;
	    	    		break;
	    	    	}
	    	    }
	    	   }
	       }
	       if(k==1)
	       {
	          System.out.println("not a diagonal matrix");
	       }
	       else
	       {
	    	   System.out.println("a diagonal matrix");
	       }
	       }
	       else
	       {
	    	   System.out.println("not a diagonal matrix");  
	       }
	}

}
