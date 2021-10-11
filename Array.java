public class Array{
	public static void main(String[] args){
		String[] paises = {"Brasil", "Russia", "India", "China"};//tipo do array. nome da variavel. dentro de chaves as minhas variaveis
		System.out.println(paises[0]);//imprimir na tela o valor da variavel paises, posição zero, ou seja, o primeiro
		paises[0]="BRAZIL";//trocando minha variavel da posição zero,pelo nome BRAZIL
		System.out.println(paises[0]);//imprimindo o valor da posição zero da minha coleção de elementos paises
		System.out.println(paises.length);//usando o length pra descobrir quantos elementos tem meu array

	}
}
		