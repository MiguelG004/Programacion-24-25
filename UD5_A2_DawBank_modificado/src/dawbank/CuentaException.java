package dawbank;

public class CuentaException extends Exception{

	public CuentaException(String mensaje) {
        super("Error en la operacion");
    }
}
