
public class Password {
	
	//Atributos de clase
	private int longitud;
	private String contraseña;
	
	//Constructores
	public Password() {
		this.longitud = 0;
		this.contraseña = "";
	}
	
	public Password(int longitud, String contraseña) {
		this.contraseña = generarContraseña(longitud);
		this.longitud = longitud;
	}


	//Métodos de clase
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public static String generarContraseña(int longitud) {
		String contraseña = "";
		
		for (int i=0; i < longitud; i++) {
			final String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; //62 Caracteres
			contraseña += caracteres.charAt((int) (Math.floor(Math.random() * (62 - 0 + 1)) + 0));
		}
		
		return contraseña;
	}
}
