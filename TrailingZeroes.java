import java.util.Scanner;
public class TrailingZeroes{
	static int numberOfTz(int n){
		return (int)(Math.log10((n&n-1)^n)/Math.log10(2));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(numberOfTz(n));
		}
}
