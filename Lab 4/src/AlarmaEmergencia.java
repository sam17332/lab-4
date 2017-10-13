public class AlarmaEmergencia extends Timbre{

	public void m1()
	{
		System.out.println("emergencia 1");
	}
	
	public void m2()
	{
		super.m1();
		super.m2();
	}
	
	public String m3()
	{
		m1();
		return "emergencia" + super.toString();
	}
}
