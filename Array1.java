import java.util.Arrays;
public class Array1{
	public static void main(String[] args){
		String[] paises = {"Brasil", "Russia", "India", "China"};//tipo do array. nome da variavel. dentro de chaves as minhas variaveis
		System.out.println(Arrays.toString(paises));//mostra todos os valores do meu array
        //pesquisa
		int posicao = Arrays.binarySearch(paises, "Russia");//em qual posição está a russia?
		System.out.println(posicao);
		//Como ordenar meu array?
		Arrays.sort(paises, 0, paises.length);//Ordene meu arrays paises da posição 0 até a posição final
		System.out.println(Arrays.toString(paises));
	}
}