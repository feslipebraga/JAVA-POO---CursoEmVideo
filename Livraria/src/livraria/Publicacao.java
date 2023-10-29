package livraria;

public interface Publicacao {
	// toda interface é public e abstract por padrão
	void abrir();
	void fechar();
	void folhear(int pag);
	void avancarPag();
	void voltarPag();
}