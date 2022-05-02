public class max_3{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=input.nextInt();
		System.out.println("Enter Second Number:");
		int b=input.nextInt();
		System.out.println("Enter Third Number:");
		int c=input.nextInt();
		if(a>b){
			if(a>c){
				System.out.print(a+" is greatest among all");
			}
			else{
				System.out.print(c+" is greatest among all");
			}
		}
		else{
			if(b>c){
				System.out.print(b+" is greatest among all");
			}
			else{
				System.out.print(c+" is greatest among all");
			}
		}
	}
}