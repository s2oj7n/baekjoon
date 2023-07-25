import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int ip = sc.nextInt();
		int ip1= sc.nextInt();
		
		if(ip>0) {
			if(ip1>0) {
				System.out.println("1");
			}else {
				System.out.println("4");
			}
		}else {
			if(ip1>0) {
				System.out.println("2");
			}else {
				System.out.println("3");
			}
		
			
		}
	}

}