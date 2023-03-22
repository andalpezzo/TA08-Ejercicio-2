import javax.swing.JOptionPane;

public class TA08Ejercico2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String TextoLongitud;
		int Longitud;
		
		TextoLongitud = JOptionPane.showInputDialog("Introduce la longitud de la contraseña");
		Longitud = Integer.parseInt(TextoLongitud);
		
		
		Password contraseña = new Password (Longitud, Password.generarContraseña(Longitud));
		JOptionPane.showMessageDialog(null, "La contraseña generada es:\n" + contraseña.getContraseña());
	}

}
