
public class KiraPurata {
	public static void main (String [] args) {
		
		double avg = myAverage (4,6,4);
		printAverage (avg);
	
		
	}
		
		public static double myAverage (double a, double b ,double c) {
             return ( a+b+c)/3;
             
}
	public static void printAverage(double avg) {
		System.out.printf("Purata ialah %.2f", avg);
	}
		
		
}