package livraria;

public class Livraria {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa[2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Felipe", "M", 23);
		p[1] = new Pessoa("Nathan", "M", 31);
		
        l[0] = new Livro("Java Programming", "John Doe", 500, p[0]);
        l[1] = new Livro("Python Basics", "Jane Smith", 300, p[1]);
        l[2] = new Livro("C# Fundamentals", "Alice Johnson", 400, p[0]);

		System.out.println(l[1].detalhes());
		l[1].abrir();
		l[1].folhear(200);
		System.out.println(l[1].detalhes());
	}
}