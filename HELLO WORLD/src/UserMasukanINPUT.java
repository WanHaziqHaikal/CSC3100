import java.util.Scanner;
	// nak masukan dlm console input
public class UserMasukanINPUT {
	
	 public static void main (String[] arg ) {


	//String studentName ;
	Scanner  input = new Scanner(System.in);
	//  open system
	//double total, avg;

	System.out.print("mark1=");
	int m = input.nextInt();
	// masukan imput

	System.out.print("mark2=");
	int m2 = input.nextInt();

	System.out.print("mark3=");
	int m3 =  input.nextInt();
	
	System.out.print("mark4=");
	int m4 =  input.nextInt();
	//println nak selang line
	
	int total2= m + m2+m3+m4;
	System.out.println("total = "+ total2 );
	//kirakan oleh system
	
	double averange = total2/4;
	System.out.println("averange = " + averange);
	//kirakan oleh system
	
	if   (total2 == 100) {
		//== sama dgn 
		System.out.println("full");}
	
	else if ((total2 >80) && (total2 < 100)) {
		// {} letak kat gred
	System.out.println("A");}
	
	else if ((total2 >60) && (total2 <80)) {
		System.out.println("B");}
	
	else if ( (total2 < 40)&& (total2 <60)) {
		System.out.println("C");}
	
	else if ((total2 < 20) && (total2 < 20)) {
		System.out.println("F");}
	
	
	input.close();
	// close system
	 }
}