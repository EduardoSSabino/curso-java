import java.util.Arrays;
public class ArrayInt{
	public static void main(String[] args){
		int[] impares = new int[5];//inicializando o array. Estou crinado um array de inteiros chamados impares, depopis eu falo quantas posições meu array ira ter 
		//Toda vez que eu for inicializar um array indicando o numero de posições que ele terá, eu incio com com a palavra "new"
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 2;
		System.out.println(impares.length);//usando o length pra descobrir quantos elementos tem meu array
		Arrays.sort(impares, 0, 5);//Ordene meu arrays impares da posição 0 até a posição final
		System.out.println(Arrays.toString(impares));
	}
}
		