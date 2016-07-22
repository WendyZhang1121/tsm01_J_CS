package tsm01_J_CS;

public interface ExceptionReporter {

	public void setExceptionReporter(ExceptionReporter er); 
	public void report(Throwable exception);
}