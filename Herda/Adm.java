package Herda;

public class Adm extends Funcionario{
	private int cra;

	public Adm(String nome, String matricula, double salario, String telefone, String endereco, String dataNascimento,
			int cra) {
		super(nome, matricula, salario, telefone, endereco, dataNascimento);
		this.cra = cra;
	}

	public int getCra() {
		return cra;
	}

	public void setCra(int cra) {
		this.cra = cra;
	}
	
}
