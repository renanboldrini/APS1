
public class Conta_Bancaria {
	private double saldo;
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean compara_saldo_c_valor_do_saque(int valor_Saque,double saldo){//verifica se o valor a ser sacado é valido ou nao
		if(valor_Saque <= saldo){
			return true;	
		}
		else{
			return false;
			}
	}
	
	public double saque(double saldo, int valor_Saque){
		saldo = saldo - valor_Saque;
		return saldo; // retorna saldo para atualizar o mesmo após saque
	} 
}
