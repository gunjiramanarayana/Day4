package question1;
import java.util.Scanner;
public class addingELEMENTinANarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n,i,p,v;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int ele[]=new int[n+1];
    for(i=0;i<n;i++)
    {
    	ele[i]=sc.nextInt();
    }
    p=sc.nextInt();
    v=sc.nextInt();
    for(i=(n-1);i>=(p-1);i--)
    {
        ele[i+1]=ele[i];
    }
    ele[p-1]=v;
    for(i=0;i<=n;i++)
    {
    	System.out.println(ele[i]);
    }
	}

}
