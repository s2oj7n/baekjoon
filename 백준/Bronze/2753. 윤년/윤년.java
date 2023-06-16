import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		
		if(ip%4==0) {
			if(ip%100==0) {
				if(ip%400==0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else {
				System.out.println("1");
			}
			
			
			
			
		}else {
			System.out.println("0");
		}
	}
}