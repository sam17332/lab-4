
public class Soldado extends Militar{
	
	public int getHoras()
	{
		return 80;					// trabaja 80 horas / semana
	}

	public double getSalario() 
	{
		return 30000.0;				// Q30,000.00 / anio
	}
	
	public int getDiaVacaciones()
	{
		return 5;				 	// 1 semanas de vacaciones pagadas
	}
	
	public String recibeOrden()
	{
		return "Ordene mi General";	
	}
}
