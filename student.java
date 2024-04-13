class student {
		int rollNo;
		String name;
		String addr;

			public String toString()
			{ 		
				 return "Welcome";
			}
			}


class student2 extends student
{
	String phone;
	String email;
	public String toString()
	{
return "self2[rollNo="+rollNo+",name="+name+",addr="+addr+",phone="+phone+",email="+email+"]";		

	}

}
 class Main {
	
	public static void main(String[] args) {
		student2 obj = new student2();
		obj.rollNo=456;
		obj.name="suppu";
		obj.addr="munnurukapu street warangal";
		obj.phone= "9392783873";
		obj.email="suprajakoneti02@gmail.com";
		System.out.println(obj);
		
		
		
		// TODO Auto-generated method stub

	}

}