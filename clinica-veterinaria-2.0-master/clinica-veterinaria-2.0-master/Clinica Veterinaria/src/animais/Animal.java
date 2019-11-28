package animais;

public abstract class Animal {

	private String nome;
	private String raca;
	private String especie;
	private double peso;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Animal(String nome, String raca, String especie, double peso, int idade) {
		this.nome = nome;
		this.raca = raca;
		this.especie = especie;
		this.peso = peso;
		this.idade = idade;
	}
	
	public Animal() {}
	
}
