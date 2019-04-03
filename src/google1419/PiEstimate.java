package google1419;

public class PiEstimate {
	
	double pi;
	int runs;
	double inCount, shot;
	
	public PiEstimate(){
		inCount = 0;
		shot = 0;
	}
	
	public double calculate(int num) {
		
		runs = num;
		
		for(int i = 0; i < runs; i++) {
		
			double x = Math.random();
			double y = Math.random();
			double d = Math.sqrt(x*x + y*y);
		
			shot++;
			if(d < 1) inCount++;
		
			pi = (inCount/shot) * 4;
		}
		
		System.out.println("count = " + (int)inCount + "... shot = " + (int)shot + "... pi = "  + pi);
		return pi;
	}
	
	public void resetCounts() {
		inCount = 0;
		shot = 0;
	}
	
	public String getInfo() {
		return "Shots : "+ (int)shot + "  ---  Hit : " + (int)inCount;
	}
}




