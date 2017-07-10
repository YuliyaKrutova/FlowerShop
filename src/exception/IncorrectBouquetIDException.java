package exception;

public class IncorrectBouquetIDException extends Exception{

	private static final long serialVersionUID = -1924746065966498155L;

	public IncorrectBouquetIDException(String message, Throwable cause) {
		super(message, cause);
	}

	public IncorrectBouquetIDException(String message) {
		super(message);
	}

	public IncorrectBouquetIDException(Throwable cause) {
		super(cause);
	}
	

}
