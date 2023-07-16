import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cex =0;
		
		Scanner sc = new Scanner(System.in);
		
		int ip = sc.nextInt();
		
		for(int i=1;i<=ip;i++) {
			cex = cex + i;
		}
		System.out.println(cex);
	}
}