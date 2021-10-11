import java.util.Scanner;
import java.util.Random;
public class DesafioDoDado{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Qual seu palpite?");
		int palpite = s.nextInt();
		System.out.println(" Seu palpite foi "+ palpite);
		int[] Dado = {1, 2, 3, 4, 5, 6};
		Random ladoDado = new Random();//Crio um objeto ladoDado
		int indiceDado1 = ladoDado.nextInt(Dado.length);//Crio uma variavel inteira que vai trazer o indice do meu lado do dado, aleatoriamente vai escolher um valor de zero ate o Dado1.length, ou seja, meu ultimo indice
		int Dado1 = Dado[indiceDado1];//Crio uma variavel do tipo int que trara o valor do indice escolhido aleatroiamente na linha superior
		System.out.println("O lado do dado sorteado foi "+Dado1);
		if(palpite==Dado1){
			System.out.println("Voce GANHOU!");
		}else{
			System.out.println("Voce perdeu. Boa sorte na proxima!");
		}
		
	}
}
	
		
		