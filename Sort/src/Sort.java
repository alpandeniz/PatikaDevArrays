import java.util.Arrays;
import java.util.Scanner;

public class Sort {
	public static void main(String[] args) {
	        Scanner scanner  = new Scanner(System.in);
	       System.out.print("Kaç elemanlı bir dizi olacak? Giriniz: ");
	       int n = scanner.nextInt();
	       int list[] = new int[n];
	       System.out.println("Elemanları giriniz: ");
	       for (int i=0; i<n; i++){
	           System.out.print( i +". Elemanı : ");
	           list[i]=scanner.nextInt();
	       }
	       Arrays.sort(list);
	       System.out.println("Küçükten büyüğe: "+ Arrays.toString(list));
	       
	    }
}
