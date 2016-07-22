package tsm01_J_CS;

public class DefaultExceptionReporter implements ExceptionReporter { 
	public DefaultExceptionReporter(ExceptionReporter er) {
	// ... 
	}
	// Should be called after subclass's initialization is over 
	public void publishExceptionReporter() {
		setExceptionReporter(this); // Registers this exception reporter 
		}
	// Implementation of setExceptionReporter() and report() 
	@Override
	public void setExceptionReporter(ExceptionReporter er) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void report(Throwable exception) {
		// TODO Auto-generated method stub
		
	}
}
