package exceptionHandler;

public class predicterExceptionHandler extends RuntimeException {
	// structure
    public predicterExceptionHandler(Integer code,String message) {
        super(message);
        this.code = code;
    }

    // getter
    public Integer getCode() { return code; }

    // setter
    public void setCode(Integer code) { this.code = code; }
    
    // data
    private String message;
    private Integer code;
}
