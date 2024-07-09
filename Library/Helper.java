import java.util.Scanner;
public class Helper
{

	public static int getI(){
		Scanner sc = new Scanner(System.in);
		int value=0;
		boolean isOk = true;
		do {
			try{
     			int value = sc.nextInt();
     			isOK = false;
     		} catch(Exception e){
     			System.out.println("Wrong Input try again");
     	}
     } while (isOk);
     		

		return value;
	}
	public static String getS(){
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine() ;
		return value;
	}
	public static void main(String args[])
	{
		int val = Helper.getI();
		System.out.println(val);
	}
}