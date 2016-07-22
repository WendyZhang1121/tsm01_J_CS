package tsm01_J_CS;

import java.util.logging.Logger;

//Class MyExceptionReporter derives from DefaultExceptionReporter 

public class MyExceptionReporter extends DefaultExceptionReporter {

	private final Logger logger;

	public MyExceptionReporter(ExceptionReporter er) { 
		super(er); // Calls superclass's constructor 
		logger = Logger.getLogger("com.organization.Log");
	}
	//Implementations of publishExceptionReporter(), 
	// setExceptionReporter() and report()
	//are inherited
}