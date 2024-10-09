package curso09_10_relacionamentos;

public class Principal_empresa {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("RH");
		Empresa empresa = new Empresa("Star", departamento);
		System.out.println("A empresa é: " + empresa.getNome()+ "\nDepartamento: " + departamento.getNome());


	}

}
