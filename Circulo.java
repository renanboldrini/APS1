
public class Circulo {
	private double raio;
	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calcula_Circunferencia(double raio){
		double circunferencia = 0;
		circunferencia = 2*3.14*raio;
		return circunferencia;
	}
	
	public double calcula_Area(double raio){
		double area = 0;
		area = 3.14*(raio*raio);
		return area;
	}
	
	public void verifica_Contato(double distancia_de_um_centro_ao_outro,//EX: um  centro de circulo esta a 18 cm do outro, logo o valor a ser informado sera 18(sempre em cm)
			double raioC1, double raioC2 ){
		
		if((raioC1 + raioC2) <= distancia_de_um_centro_ao_outro){
			System.out.println("Os circulos estao de tocando");
				}
		else{
			System.out.println("Os circulos nao estao de tocando");
		}
		
	}
	

	
	

}
