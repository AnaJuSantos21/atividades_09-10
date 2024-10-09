package curso09_10_relacionamentos;

public class Principal_livro {

	public static void main(String[] args) {
		Livro livro = new Livro("É assim que acaba", "Collen Houver");
		System.out.println(livro.getTitulo() + " tem como autora " + livro.getAutor());

	}

}
