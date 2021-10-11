public class if_else{
	public static void main(String[] args){
		System.out.println("PASSOU");
		boolean passou = true;//Confirmo que a variavel booleana passou é verdadeira
		if(passou){//Se passou...
		System.out.println("Contratado\n\n");}//Imprima na tela "Contratado"
		System.out.println("NUMERO");
		int numero = 10;
		if((numero % 2) ==0){//Se o resto da divisao de 10 por 2 for igual a zero...
		System.out.println("Numero par\n\n");//Imprima Numero par
		} else{//Caso contrario
			System.out.println("Numero impar\n\n");//Imprima Numero impar
		}
		System.out.println("IDADE");
		int idade = 11;//minha variavel idade tem o valor igual a 11
		if(idade<=11){//se minha idade for menor ou igual a 11...
			System.out.println("Criancinha");//é uma criança
		} else if (idade>11 && idade <= 18){// senao se a idade for maior que 11 e menos ou igual a 18, é um adolescente
			System.out.println("Adolescente");
		}else if (idade>18 && idade <=50){//senao se a idade for maior que 18 e menor ou igual a 50, é um adulto
			System.out.println("Adulto");
		}else{//senao é uma pessoa da melhor idade
			System.out.println("Melhor idade");
		}
	}
}