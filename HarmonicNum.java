import java.util.Scanner;
public class HarmonicNum{
	public static void main(String[] args){
		double sum=0;
		Scanner num=new Scanner(System.in);
		double n= num.nextDouble();
		for(int i=1;i<=n;i++)
		{
			sum=sum+(1/i);
			if(i==1)
				System.out.println("1 + ");
			else
				System.out.println("1/"+ i);
		}
	System.out.println();
	System.out.println("sum of the num is:"+sum);
}
}
			
