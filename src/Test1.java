
public class Test1 {

	int sno;
	String sname;
	int sub1;
	int sub2;
	int sub3;
	
	public void getdetails(int a,String n,int s1,int s2,int s3)
	{
	sno = a;
	sname = n;
	sub1=s1;
	sub2 = s2;
	sub3 = s3;
	}
	
	public void display()
	{
		System.out.println("employee Id :"  +sno);
		System.out.println("employee name :"  +sname);
		System.out.println("employee subjecgt1 :" +sub1);
		System.out.println("employee subject2 :"  +sub2);
		
	}
}
