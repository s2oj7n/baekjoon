import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int avg =0;
		Scanner sc = new Scanner(System.in);
		
		int tot = sc.nextInt();
		
		int ip = sc.nextInt();
		int[] arr = new int[ip];
		for(int i=0;i<ip;i++) {
			int ip1 = sc.nextInt();
			int ip2 = sc.nextInt();
			
			arr[i]=ip1*ip2;
			
			
		}
		for(int i=0;i<ip;i++) {
			
			avg = avg+arr[i];
			
		}
		if(tot==avg)
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
