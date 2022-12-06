

public class HarmonicNumber {

	public static void main(String[] args) {
		
		int[] list = {1,2,3,4,5,6,7,8,9};
							
							double sum = 0.0;
							for(int i =0 ; i<list.length ; i++) {
							sum +=(1/list[i]);	
							}

							double avarage =0.0;
							avarage = list.length/sum;
							
		System.out.print("harmonik ortalama: "  + avarage);
		
	}

}
