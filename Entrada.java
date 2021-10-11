 import java.util.Scanner;
 public class Entrada{//Forma de recuperar os dados do usuario 
	 public static void main(String[] args){/*"args" é o meu parametro */
		 //Chamada do programa
		 //System.out.println(args[0]);
	     //Interagindo com o usuario
		 //Recuperando a entrada do sistema
		 Scanner s = new Scanner(System.in);     //Scanner consegue trabalhar
         System.out.println("Qual o seu nome?");//com as entradas do meu sistema
         String gordin = s.nextLine();            //e trazer isso pra dentro do meu 
											    //programa Java
		System.out.println("Bem vindo, ", gordin);//Agora podemos ler a entrada do scanner									
	}    
 }
	 