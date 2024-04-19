package projetoPOO1Unidade;

import java.util.Random;

public class Carro {
	int velocidade;
	
	int distancia;
	
	Random rand = new Random();
	
	public Carro() {
		this.velocidade = 0;
		this.distancia = 0;
	}
	
	public void calcVelocidade() {
		int[] velocidade = new int[3];
		for(int i = 0; i < velocidade.length; i++) {
			velocidade[i] = i;
			int velocidadeCarro = velocidade[i];
			this.velocidade = velocidadeCarro;
		}
	}
	
	public void calcDistancia() {
		this.distancia += this.velocidade;
		for(int i = 0; i < this.distancia; i++) {
			if(i == this.distancia - 1) {
				System.out.print("#");
			}else {
				System.out.print(" ");
			}
		}
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public void setDistancia() {
		this.distancia += this.velocidade;
	}
	
	public int getDistancia() {
		return this.distancia;
	}
	
	public String toString() {
		return "#";
	}
}
