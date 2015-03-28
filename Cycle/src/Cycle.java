
public class Cycle {
	private int numOfWheels;
	private int weight;
	
	public Cycle (){
		this.numOfWheels= 100;
		this.weight= 1000;
	}
	public Cycle (int numOfW, int wt){
		numOfWheels = numOfW;
		weight = wt;
	}

	public String toString() {
		
		String whatever = "[numOfWheels=" + numOfWheels + ", weight=" + weight + "]";
		return whatever;
	}
}