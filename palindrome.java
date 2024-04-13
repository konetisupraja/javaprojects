 class test5{
	public static void main(String[] args)
	
	{ 
		int num;
                Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		 num=sc.nextInt();
		 int org_num=num;
		 int rev=0;
		 while(num!=0)
		 {
			 rev=rev*10+num%10;
			 num=num/10;
			 
		 }
		 System.out.println("the reversed number is:"+rev);
		 if(org_num==rev)
		 {
			 System.out.println("the number is palindrome"+org_num);
		 }
		 else
		 {
			 System.out.println("the number is not a palindrome"+org_num);	 
		 }
	}

}