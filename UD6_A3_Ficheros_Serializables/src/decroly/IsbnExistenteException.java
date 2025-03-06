package decroly;

public class IsbnExistenteException extends Exception {
	
	//constructor vacio para que no de error la funcion de comprobar isbn
	public IsbnExistenteException() {
    }

    public IsbnExistenteException(String message) {
        super(message);
    }
	
}
