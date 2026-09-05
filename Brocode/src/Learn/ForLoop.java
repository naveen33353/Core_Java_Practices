package Learn;
public class ForLoop {
public static void main(String[] args) throws InterruptedException {
	
//	Scanner scanner = new Scanner(System.in);
//	System.out.print("Enter the countdown :");
//	int count = scanner.nextInt();
//	
//	for(int i=0 ; i<count; i++) {
//		System.out.println(i);
//		Thread.sleep(1000);
//	}
//	System.out.println("Poda kunney");
//	scanner.close();
	
	for(int i=1 ; i<=10; i++) {
		if(i==5) {
			System.err.println("Poda oombaaa!!");
			continue;
		}
		System.err.println(i);
		Thread.sleep(2000);
	}
	
}
}
