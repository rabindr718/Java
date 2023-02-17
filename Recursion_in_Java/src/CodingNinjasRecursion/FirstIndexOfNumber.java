package CodingNinjasRecursion;

public class FirstIndexOfNumber {

	    public static int firstIndex(int input[], int x) {
	        //method overloading
	        return firstIndex(input,x,0);		

	    }
	    private static int firstIndex(int input[],int x,int startIndex){
	        if(startIndex==input.length)
	            return -1;
	        if(input[startIndex]==x)
	            return startIndex;
	        return firstIndex(input,x,startIndex+1);
	        }
	}
