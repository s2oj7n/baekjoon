import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int avg;
		int avg1;
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int o = sc.nextInt();
		
		h=h*60;
		
		avg=h+m+o;
		avg1=avg%60;
		avg=avg/60;

		if(avg>=24) {
			if(avg==24) { 
				avg=0;
				System.out.println(avg+" "+avg1);
			}else {
				avg=avg-24;
				System.out.println(avg+" "+avg1);
			}
		
		}else
			System.out.println(avg+" "+avg1);
		
	}

}
