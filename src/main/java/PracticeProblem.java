public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int[] createIntArray(){
		int[] array;
		array = new int[5];
		for (int i =0; i<array.length;i++){
			array[i]=i+1;
		}
		return array;
	}
	public static String[] createArray(String word, String word1, String word2, String word3){
		String[] wordArr = {word, word1, word2, word3};
		return wordArr;
	}
	public static int findValue(int num, int[]arr){
		int index=-1;
		for (int i=0; i <arr.length;i++){
			if (arr[i]==num){
				index=i;
				i = arr.length;
			}
		}
		return index;
	}
	public static int findThirdValue(String word, String[] arr){
		int index= -1;
		int x =0;
		for (int i =0;i<arr.length;i++){
			if(arr[i]==word){
				x=x+1;
				if (x==3){
					index=i;
					i= arr.length;
				}
			}
		}
		return index;
	}

}
