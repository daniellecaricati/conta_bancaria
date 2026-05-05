package conta_bancaria.model;

public class ContaPoupanca extends Conta{
	
	private float aniversario;
	
	public ContaPoupanca(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);	
		this.aniversario = limite;
	}

	public float getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Aniversário da conta: " + this.aniversario);
	}

}
