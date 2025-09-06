import java.util.Scanner;
public class Main {
	public static void triangle(int n){
	    for (int i=0;i<n;i++){
	        for(int j=0;j<=i;j++){
	            System.out.print("* ");}
	            System.out.println();
	        }  
	    }
	public static void iTriangle(int n){
	    for(int i=0;i<n;i++){
	        for (int space=n-i;space<n;space++){
	            System.out.print("  ");}
	            for(int j=i;j<n;j++){
	                System.out.print("* ");}
	                System.out.println();
	        }
	    }
	public static void square(int n){
	    for(int i=0;i<n;i++){
	        for(int j=0;j<n;j++){
	            System.out.print("* ");}
	            System.out.println();
	        }}
	public static void main(String[] args) {
	    Scanner inp=new Scanner(System.in);
	    System.out.println("Enter the number");
	    System.out.println("Like 3,4,5..: ");
	    int number=inp.nextInt();
	triangle(number);
	square(number);
	iTriangle(number);
	

	}
}
