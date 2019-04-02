package google1419;

public class PiEstimate {
	
	int runs = 1000000;
	
	double inCount = 0;
	double shot = 0;
	double pi;
	
	public PiEstimate(){
		
		for(int i = 0; i < runs; i++) {
		
			double x = Math.random();
			double y = Math.random();
			double d = Math.sqrt(x*x + y*y);
		
			shot++;
			if(d < 1) inCount++;
		
			pi = (inCount/shot) * 4;
		
		}
		
		System.out.println("Pi calculated as " + pi + " with " + runs + " runs!");
	}

}




