
public class DublicateNumbers {
	static boolean isFind(int[] array, int value) {
		for (int i : array) {
			if(value == i) {
				return true;
			}			
		}
		return false;
}

public static void main(String[] args) {

	int[] list = {1,2,56,8,4,3,11,17,25,2,8,4,3,25,11,56,88,88,9};
	int[] dublicate = new int[list.length];
	int startIndex = 0;
	for (int i = 0; i<list.length; i++) {
		for (int k = 0; k<list.length;k++) {
			if(i != k && list[i] == list[k] ) {
				if(!isFind(dublicate, list[i])) {
					dublicate[startIndex++] = list[i];
				}
				break;
			}
		}
		
	}
	
	 for (int value : dublicate){ 
		 if(value!=0 && value%2==0) {
			 	System.out.println(value);
			 	} 
		 }
	 
	
}
}
