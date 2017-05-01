
public class Temperatura {
	String graus;
	
		
	public String getGraus() {
		return graus;
	}


	public void setGraus(String graus) {
		this.graus = graus;
	}


	public String recebe_string_graus_converte_temperatura(String graus){
		double temp = 0;
		String temperatura_Convertida;
		
			if (graus.charAt(2) == 'c'|| graus.charAt(2) == 'C'){
				temp = (Integer.parseInt(graus.substring(0,2))*1.8)+32;
				temperatura_Convertida = temp+"F";
				return temperatura_Convertida; 
			}
			
			else{
				temp = (Integer.parseInt(graus.substring(0,2))-32)/1.8;
				temperatura_Convertida = String.format("%.1f",temp)+"C"; 		 
				return temperatura_Convertida;
			}
			
	// a string que retornar sera utilizada para atualizar o estado do objeto com a temperatura convertida
	}
	
	
}
