package con.lms.util;

import java.util.Scanner;

public class Helper
{
	public static int getI(){
		Scanner sc = new Scanner(System.in);
		int value = 0;
		boolean isOk = true;
		
		do{
			try{
				value = sc.nextInt();	
				isOk = false;
			}
			catch(Exception e){
				System.out.println("Invalid Integer, Please Enter a Valid Integer ");
				sc.nextLine();
			}
		}while(isOk);

		return value;
	}
	public static String getS(){
		Scanner sc = new Scanner(System.in);
		String value = sc.nextLine() ;
		return value;
	}
	
	public static int getI(int start,int end){
		Scanner sc = new Scanner(System.in);
		int value = 0;
		boolean isOk = true;

		do
		{
			try{

				value = sc.nextInt();
				if(value >= start && value <= end){
					isOk = false;
				}
				else{
					System.out.println("Invalid Data, Please Enter a Number between " + start + " and" + end );

				}
				
			}
			catch(Exception e){
				System.out.println("Invalid Data, Please Enter a Number between " + start + " and" + end );
				sc.nextLine();
			}
		}while(isOk);

		return value;
	}


	public static void main(String args[])
	{
		int s = Helper.getI();
		int e = Helper.getI();
		int val = Helper.getI(s,e);
		System.out.println(val);
	}

}