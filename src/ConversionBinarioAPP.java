import javax.swing.JOptionPane;

public class ConversionBinarioAPP {

	public static void main(String[] args) {
		
		String numTexto = JOptionPane.showInputDialog("Introduce un numero");
		int numero = Integer.parseInt(numTexto);
		String binario = decimalBinario(numero);
		JOptionPane.showMessageDialog(null, "El numero " + numero + " en binario es " + binario);
	}
	
	public static String decimalBinario(int numero) {
		
		String binario = "";
		String digito;
		
		for(int i = numero; i > 0; i /= 2) {
			if(i % 2 == 1) {
				digito = "1";
			}else {
				digito = "0";
			}
		
			binario = digito + binario;
		}
		return binario;
	}
}
