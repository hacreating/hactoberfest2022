import java.util.Scanner;
public class TableExample{

    public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);   //scanner class is used to take the input from user
		System.out.println("Enter Any Number:");  
		int num = sc.nextInt();
		for (int i=1;i<=10 ;i++ ) { 
      System.out.println(num*i); // im using this line for printing the output
			}
	}
}
