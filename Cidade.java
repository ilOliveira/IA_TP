import java.util.ArrayList;

public class Cidade {

	private String nome;

	private int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	private int y;

	public Cidade(String nome, int x, int y) {
		this.setNome(nome);
		this.x = x;
		this.y = y;
	}

	public double distanceToCity(Cidade city) {
		int x = Math.abs(getX() - city.getX());
		int y = Math.abs(getY() - city.getY());
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
