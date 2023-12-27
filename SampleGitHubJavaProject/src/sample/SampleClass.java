package sample;

public class SampleClass {
	public static void main(String[] args) {
		System.out.println("Hello This is a Sample Class");
		System.out.println("Hello This is new changes");
		System.out.println("This is the changes for the first branch");
		System.out.println("This is the changes in the Master Branch");
		System.out.println("This is the changes for the third branch");
		System.out.println("This is the second change in the Master branch");
		System.out.println("This is the changes for the fourth branch");
		
		int a=10;
		int sum=a+10;
		try {
			double div=a/0;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(sum);
		System.out.println("Hello Prashant");
		int sub=a-4;
		System.out.println(sub);
		
		System.out.println("Hello Jenkins");
		

	}

}
