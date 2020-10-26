package exceptionHandler;

public class predicterExceptionHandler extends RuntimeException {
	public enum predicterException{
		predictAlgorithmPredictError1("predictAlgorithm doesn't predict.");
		
		// structure
		private predicterException (String name) {
			this.name = name;
		}
		
		// getter
		public String getName() { return name; }
		
		
		private String name;
	}
	
	// structure
    public predicterExceptionHandler(predicterException exception) {
        super(exception.getName());
		this.exception = exception;
    }
    
    // data
    private predicterException exception;
}
