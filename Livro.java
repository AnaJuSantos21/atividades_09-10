package curso09_10_relacionamentos;

public class Livro {
	private String titulo;
	private Autor autor; //composição
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = new Autor(autor);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitlo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor.getNome();
	}
	

}
