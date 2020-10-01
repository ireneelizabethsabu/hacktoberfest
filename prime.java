import java.util.Scanner;

class Prime{

	public static void main(String args[]){
		boolean flag=false;
		Scanner scanner= new Scanner(System.in);
	
		System.out.print("Enter the number: ");
		int n = scanner.nextInt();
		if(n == 1)
			System.out.println("1 is neither prime nor composite!!!");
		else{
			for(int i=2;i<=Math.sqrt(n);i++){
				if(n%i==0){
					System.out.println(n+" is not PRIME!!");
					flag = true;
					break;
				}
			}
		}
		if(!flag)
			System.out.println(n + " is PRIME!!");

	}
}
