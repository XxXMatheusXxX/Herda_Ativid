package Herda;



public class Main {
	

	public static void main(String[] args) {
	Funcionario funcionario = new Funcionario("Genival","2737",2033,"15 9913773", "Rua dos boboes",
			"1945");
	System.out.println("Funcionario: ");
	System.out.println("Nome: " + funcionario.getNome());
	System.out.println("Telefone: " + funcionario.getTelefone());
	System.out.println("Matrícula: " + funcionario.getMatricula());
	System.out.println("Salário: " + funcionario.getSalario());
	System.out.println("Endereço: " + funcionario.getEndereco());
	System.out.println("Data de nascimento: " + funcionario.getDataNascimento());
	System.out.println("------------------------");
	
	Engenheiro engenheiro = new Engenheiro("Genival","2737",2033,"15 9913773", "Rua dos boboes",
			"1945",369);
	System.out.println("Engenheiro: ");
	System.out.println("Nome: " + engenheiro.getNome());
	System.out.println("Telefone: " + engenheiro.getTelefone());
	System.out.println("Matricula: " + engenheiro.getMatricula());
	System.out.println("Salario: " + engenheiro.getSalario());
	System.out.println("Endereço: " + engenheiro.getEndereco());
	System.out.println("Data de nascimento: " + engenheiro.getDataNascimento());
	System.out.println("NumCrea: " + engenheiro.getNumCrea());
	System.out.println("------------------------");
	
	Adm adm = new Adm("Genival","2737",2033,"15 9913773", "Rua dos boboes",
			"1945",72);
	System.out.println("Adm: ");
	System.out.println("Nome: " + adm.getNome());
	System.out.println("Telefone: " + adm.getTelefone());
	System.out.println("Matricula: " + adm.getMatricula());
	System.out.println("Salario: " + adm.getSalario());
	System.out.println("Endereço: " + adm.getEndereco());
	System.out.println("Data de nascimento: " + adm.getDataNascimento());
	System.out.println("Cra: " + adm.getCra());
	System.out.println("------------------------");
	
	
	Medico medico = new Medico("Genival","2737",2033,"15 9913773", "Rua dos boboes",
			"1945",69);
	System.out.println("Médico: ");
	System.out.println("Nome: " + medico.getNome());
	System.out.println("Telefone: " + medico.getTelefone());
	System.out.println("Matricula: " + medico.getMatricula());
	System.out.println("Salario: " + medico.getSalario());
	System.out.println("Endereço: " + medico.getEndereco());
	System.out.println("Data de nascimento: " + medico.getDataNascimento());
	System.out.println("CRM: " + medico.getCrm());
	}
}
