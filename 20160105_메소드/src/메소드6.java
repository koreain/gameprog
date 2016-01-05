
public class ¸Þ¼Òµå6 {

	static void a()
	{
		System.out.println("a() start..."); //1
		b();
		System.out.println("a() end...");   //8
	}
	static void b()
	{
		System.out.println("b() start..."); //2 //9
		c();
		System.out.println("b() end..."); //7 //14

	}
	static void c()
	{
		System.out.println("c() start..."); //3 //10 //15
		d();
		System.out.println("c() end..."); //6 //13 //18

	}
	static void d()
	{
		System.out.println("d() start..."); //4 //11 //16 //19
		System.out.println("d() end..."); //5	//12 //17 //20

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("prog start...");
		a();
		b();
		c();
		d();
		System.out.println("prog end...");
	}

}
