import java.util.ArrayList;
public class Foreach{
	public static void main(String[] args){
		int[] pares = {2, 4, 6, 8};//tenho um array chamado pares, com elementos do tipo inteiro
		for(int par : pares){//percorra cada elemento par do tipo int presente dentro do meu conjunto pares
			System.out.println(par);
		}
		System.out.println();
		ArrayList<Integer> lista = new ArrayList<Integer>();//CRio uma lista com os valores que eu vou colocar dentro do meu laço for
		//Crio um objeto lista 
		for(int i=0; i<10; i++){//Quero adicionar 10 valores a minha lista
			lista.add(i);
		}
		for(Integer numero : lista){//Agora pra apresentar esses meus valores, vou usar meu for aprimorado
			System.out.println(numero);
		}
			
	}
}
			
		
