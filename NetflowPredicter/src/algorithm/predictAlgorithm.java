package algorithm;
import data.netflowData;
import exceptionHandler.predicterExceptionHandler;

public abstract class predictAlgorithm {
	// structure
	public predictAlgorithm() {
		isPredict = false;
		this.srcData = new netflowData();
		this.rstData = new netflowData();
		this.rstData = new netflowData();
	}
	public predictAlgorithm(netflowData srcData, netflowData askData) {
		isPredict = false;
		this.srcData = srcData;
		this.askData = askData;
		this.rstData = new netflowData();
	}
	
	// predict
	abstract void predict();

	// setter
	public void setSrcData(netflowData srcData) { this.srcData = srcData; }
	public void setAskData(netflowData askData) { this.askData = askData; }
	
	// getter
	public netflowData getSrcData() { return this.srcData; }
	public netflowData getAskData() { return this.askData; }
	public netflowData getRstData() { 
		if (!isPredict) {
			throw new predicterExceptionHandler(1, "PredictAlgorithm doesn't predict.");
		} else {
			return this.rstData;
		}
	}
	
	// data
	protected boolean isPredict;
	protected netflowData srcData;
	protected netflowData askData; // ask for result
	protected netflowData rstData; // result
}
