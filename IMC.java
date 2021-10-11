import javax.swing.JOptionPane;//importação necessaria pra poder usar o JOptionPane
public class IMC{
	public static void main(String[] args){
		String peso = JOptionPane.showInputDialog("Qual seu peso?");//pergunta meu peso
		String altura = JOptionPane.showInputDialog("Qual eh sua altura?");//pergunta minha altura
		double pesoEmKg = Double.parseDouble(peso);//transforma minha String peso em uma variavel double pesoEmKg
		double alturaEmCm = Double.parseDouble(altura);//transforma minha String peso em uma variavel double alturaEmCm
		double imc = pesoEmKg / (alturaEmCm*alturaEmCm);//faz a conta pra descobrir meu imc
		String msg = (imc>= 20 && imc <=25) ? "Peso ideal" : "Gordona";//se meu imc for maior ou igual a 20 E e for menor ou igual a 25, estou no peso idela, caso contrario eu estou fora do peso
		msg = "IMC = "+imc + "\n" + msg;// a menssagem que ira apareer na caixa de dialogo
		JOptionPane.showMessageDialog(null, msg);
		System.out.println("IMC = "+ imc);// o que ira imprimir como resposta
		System.out.println(msg);
	 
}
}
 