import java.util.Scanner;

public class Number {

	public static void main(String[] args) {

		var in = new Scanner(System.in);

        int greatestSmaller = Integer.MIN_VALUE;
        int smallestGreater = Integer.MAX_VALUE;

        int[] list ={15,12,788,1,-1,-778,2,0,345,27,34,3,6,10,-30,-456,-2,51};
        
        System.out.print("Bir sayı girin: "); 
        int n = in.nextInt();

        for(int i : list){
            if(i < n){
                if(i > greatestSmaller){
                    greatestSmaller =i;
                }
            }else if(i > n){
                if(i < smallestGreater){
                    smallestGreater = i;
                }
            }
        }

        System.out.println("Girilen sayıya en yakın küçük sayı:"+greatestSmaller);
        System.out.println("Girilen sayıya en yakın büyük sayı:"+smallestGreater);
		}
	
}
