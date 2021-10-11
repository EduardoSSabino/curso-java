import java.util.Random;
public class Baralho{
//SE ATENTAR QUE TEMOS DUAS VARIAVEIS PARECIDAS, NAIPES E NAIPE, FACE E FACES!!!	
	public static void main(String[] args){
		String[] faces= {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
		String[] naipes= {"Ouro", "Espada", "Copa", "Paus"};
		Random numero = new Random();//Crio um objeto numero
		int indiceFace = numero.nextInt(faces.length);//Crio uma variavel inteira que vai trazer o indice da minha face, aleatoriamente vai escolher um valor de zero ate o face.length, ou seja, meu ultimo indice
		String face = faces[indiceFace];//Crio uma variavel do tipo String que trara o valor do indice escolhido aleatroiamente na linha superior.
		int indiceNaipe = numero.nextInt(naipes.length);
		String naipe = naipes[indiceNaipe];
		String carta = face+ " " + naipe;//Crio uma variavel carta que tera sua face e seu naipe escolhido aleatoriamente
		System.out.println(carta);//imprimo minha carta aleatoria
	}
}