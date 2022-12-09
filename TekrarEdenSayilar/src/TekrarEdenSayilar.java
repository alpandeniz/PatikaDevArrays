import java.util.Arrays;

public class TekrarEdenSayilar {

	 public static void main(String[] args) {

	        int[] list = {5,8,9,1,2,5,6,8,9,10,25,25,14,12,53,5,8,9,2,2,5};
	        	Arrays.sort(list);

	        		int counter = 0;
	        		int tempNum = list[0];
	        	
	        		System.out.println("Tekrar sayıları");
	        for(int i=0;i<list.length;i++){
	            if(i==0 || tempNum!=list[i]){
	                for (int k : list) {
	                    if (k == list[i]) {
	                        counter++;
	                        tempNum = list[i];
	                    }
	                }
	                System.out.println(list[i]+" sayısı "+counter+" kere tekrar edildi!");
	                									  counter = 0;
	            }
	        }
	    }
}
