import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int ip = sc.nextInt();
		
		for(int i=1;i<=ip;i++) {
			for(int j=0;j<=i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}