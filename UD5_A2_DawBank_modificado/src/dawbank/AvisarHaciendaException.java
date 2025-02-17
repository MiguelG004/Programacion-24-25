package dawbank;

public class AvisarHaciendaException extends Exception{


	 public AvisarHaciendaException (String mensaje) {
	        super("Error en la operacion, avisaremos a hacienda");
	    }
}
