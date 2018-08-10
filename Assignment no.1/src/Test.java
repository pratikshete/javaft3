import java.util.Scanner;

public class Test {
public Test() {
	// TODO Auto-generated constructor stub
}
	public static void main(String[] args) {
		 String[] arr = new String[5];
		 int[] arr1 = new int[5];
		 Scanner kb = new Scanner(System.in);
		 for(int i=0;i<5;i++)
		 {
		 System.out.println("Enter example");
		 arr[i] = kb.nextLine();
		 System.out.println("Enter Another Example:");
		 //arr[i] = kb.nextInt();
		 arr[i] = kb.nextLine();
		 kb.nextLine();
		 }

	}

}
