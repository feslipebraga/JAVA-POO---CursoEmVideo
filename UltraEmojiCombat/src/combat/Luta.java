package combat;

import java.util.Random;

public class Luta {
	// attributes
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	// public methods
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria())
			&& !(l1.equals(l2))) {
			System.out.println("Luta aprovada");
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			System.out.println("Luta reprovada");
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar1();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar2();
			
			Random aleatorio = new Random();
			int resultado = aleatorio.nextInt(3); // 0, 1, 2.
			
			switch(resultado) {
			case 0: // empate
				System.out.println("EMPATOU");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			case 1: // desafiado wins
				System.out.println(this.desafiado.getNome() + " GANHOU");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2:	// desafiante wins
				System.out.println(this.desafiante.getNome() + " GANHOU");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
			
		} else {
			System.out.println("A luta não pode acontecer");
		}
	}

	// getters and setters
	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
