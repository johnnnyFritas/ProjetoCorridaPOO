package projetoPOO1Unidade;
import java.util.Random;

public class AppCorrida {

	public static void main(String[] args) {
		//vetor do tipo carro e instaciando Random
		Carro[] carro = new Carro[2];
		Random rand = new Random();
		
		//instaciando objetos carro para inicalizar a velocidade e distancia
		carro[0] = new Carro();
		carro[1] = new Carro();
		
		//distancia da pista
		int distanciaTotal = 20;
		
		//imprimindo a pista
		while((carro[0].getDistancia() <= distanciaTotal) || (carro[1].getDistancia() <= distanciaTotal)) {
			for(int i = 0; i < 2; i++) {
				for(int j = 0; j < distanciaTotal; j++) {
					System.out.print("-");
					carro[0].calcVelocidade();
					carro[1].calcVelocidade();
				}
				if(i == 0) {
					System.out.println();
					carro[0].calcDistancia();
					System.out.println();
					carro[1].calcDistancia();
					System.out.println();
				}else {
					System.out.print("");
				}
			}
			for(int i = 0; i < 3; i++) {
				System.out.println();
			}
			
			if(carro[0].getDistancia() >= distanciaTotal) {
				System.out.println("Carro 1 ganhou!");
				break;
			}else if(carro[1].getDistancia() >= distanciaTotal){
				System.out.println("Carro 2 ganhou!");
				break;
			}
		}
		
	}

}
