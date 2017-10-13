
public class soldadoMain 
{
	public static void main(String[] args) 
	{
		Soldado soldado = new Soldado();
		System.out.println(soldado.getHoras());
		System.out.println(soldado.getSalario());
		System.out.println(soldado.getDiaVacaciones());
		System.out.println(soldado.recibeOrden());
	}
}