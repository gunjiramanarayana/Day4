package question3;
import java.util.Scanner;
public class maxelementinanarry2DARRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,j,m;
	       Scanner sc=new Scanner(System.in);
	       n=sc.nextInt();
	       m=sc.nextInt();
	       int arr[][] = new int [n][m];
	       for(i=0;i<n;i++)
	       {
	    	   for(j=0;j<m;j++)
	    	   {
	    	   arr[i][j]=sc.nextInt();
	    	   }
	       }
	       int max =arr[0][0];
	       for(i=0;i<n;i++)
	       {
	    	   for(j=0;j<m;j++)
	    	   {
	    	       if(max<arr[i][j])
	    	        {
	    		        max=arr[i][j];
	    	        }
	           }
	       }
	       System.out.println(max);
	}

}
