public class DesafioFibonacci{
	public static void main(String[] args){
	int anterior=1;
	int proximo=2;
	System.out.println(anterior);
		while(proximo<50){
			System.out.println(proximo);
			proximo=proximo+anterior;//proximo numero Fibonacci
			anterior=proximo-anterior;//atualizando o numero anterior
		}
	}
}
			
			
		
		
				
			
			
			
		