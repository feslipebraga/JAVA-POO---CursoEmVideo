package combat;

public class Lutador {
	// atributos
	private String nome, nacionalidade;
	private int idade;
	private float altura, peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	// metodos publicos
	public void apresentar1() {
		System.out.println("Vindo diretamente de " + this.getNacionalidade());
		System.out.println("Com " + this.getAltura() + "m de altura e " + this.getPeso() + "kg de pura determinação, poder e precisão.");
		System.out.println(this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.");
		System.out.println("APRESENTAMOS: " + this.getNome());
	}
	
	public void apresentar2() {
		System.out.println("Do outro lado");
		System.out.println("Do coração de " + this.getNacionalidade());
		System.out.println("Medindo " + this.getAltura() + "m de altura e " + this.getPeso() + "kg");
		System.out.println(this.getVitorias() + " vitórias, " + this.getDerrotas() + " derrotas e " + this.getEmpates() + " empates.");
		System.out.println("APLAUSOS PARA: " + this.getNome());
	}
	
	public void status(){
		System.out.println(this.getNome() + " participa do peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}
	
	public void ganharLuta(){
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta(){
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void empatarLuta(){
		this.setEmpates(this.getEmpates() + 1);
	}
	
	// metodos especiais
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso,
			int vitorias, int derrotas, int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		if (peso < 52.2) {
			this.categoria = "Inválido";
		} else if (peso <= 70.3) {
			this.categoria = "Leve";
		} else if (peso <= 83.9) {
			this.categoria = "Médio";
		} else if (peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
		
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
}