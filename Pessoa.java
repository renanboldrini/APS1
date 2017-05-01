import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	LocalDate data_Nascimento;

public void calcula_Idade(LocalDate data_Nascimento){
	LocalDate hoje = LocalDate.now();
	Period periodo = Period.between(data_Nascimento, hoje);
	 
	System.out.printf("%s anos, %s m�s e %s dias", 
	  periodo.getYears() , periodo.getMonths(), periodo.getDays());
	  //x anos, x m�s e xx dias
}

public void retorna_signo(int m,int d){ //vai ser passado por parametro o mes e o dia de nascimento da pessoa(pode ser pego atraves de fun��es da classe localdate isolando apenas o mes e depois o ano).
	if ((m==3 && d>=21) || (m==4 && d<=19 )){
		System.out.println("seu signo � Aries");
	}
	
	else if ((m==4 && d>=20) || (m==5 && d<=20 )){
		System.out.println("seu signo � Touro");
	}
	
	else if ((m==5 && d>=21) || (m==6 && d<=20 )){
		System.out.println("seu signo � Gemeos");
	}
	
	else if ((m==6 && d>=21) || (m==7 && d<=22 )){
		System.out.println("seu signo � Cancer");
	}
	
	else if ((m==7 && d>=23) || (m==8 && d<=22 )){
		System.out.println("seu signo � Le�o");
	}
	
	else if ((m==8 && d>=23) || (m==9 && d<=22 )){
		System.out.println("seu signo � Virgem");
	}
	
	else if ((m==9 && d>=23) || (m==10 && d<=22 )){
		System.out.println("seu signo � Libra");
	}
	
	else if ((m==10 && d>=23) || (m==11 && d<=21 )){
		System.out.println("seu signo � Escorpiao");
	}
	
	else if ((m==11 && d>=22) || (m==12 && d<=21 )){
		System.out.println("seu signo � Sagitario");
	}
	
	else if ((m==12 && d>=22) || (m==1 && d<=19 )){
		System.out.println("seu signo � Capricornio");
	}
	
	else if ((m==1 && d>=20) || (m==2 && d<=18 )){
		System.out.println("seu signo � Aquario");
	}
	
	else if ((m==2 && d>=19) || (m==3 && d<=20 )){
		System.out.println("seu signo � Sagitario");
	}
	
}

}
