package pack;

public class Generator {
	
	
	private static final String[] errStr ={
			"ACTIVATION.cannotReadRepositoryDb=IOP00910401: (INITIALIZE) Cannot read repository datastore",
			"ACTIVATION.cannotAddInitialNaming=IOP00910402: (INITIALIZE) Cannot add initial naming",
			"ACTIVATION.cannotWriteRepositoryDb=IOP00710401: (INTERNAL) Cannot write repository datastore",
			"ACTIVATION.serverNotExpectedToRegister=IOP00710403: (INTERNAL) Server not expected to register",
			"ACTIVATION.unableToStartProcess=IOP00710404: (INTERNAL) Unable to start server process",
			"ACTIVATION.serverNotRunning=IOP00710406: (INTERNAL) Server is not running",
			"ACTIVATION.errorInBadServerIdHandler=IOP02510401: (OBJECT_NOT_EXIST) Error in BadServerIdHandler",
			"IOR.ortNotInitialized=IOP00711201: (INTERNAL) ObjectReferenceTemplate is not initialized",
			"IOR.nullPoa=IOP00711202: (INTERNAL) Null POA",
			"IOR.badMagic=IOP00711203: (INTERNAL) Bad magic number {0} in ObjectKeyTemplate"
};

	
	public static String genStr(){
		double idx = Math.round(Math.random()*10);
		int i = (int)idx;
		return errStr[i];
	}
	
	public static int genType(){
		return (int)Math.round(Math.random()*10);
	}
	
}
