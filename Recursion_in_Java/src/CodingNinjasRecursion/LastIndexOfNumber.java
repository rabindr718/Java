package CodingNinjasRecursion;

public class LastIndexOfNumber {

	    public static int lastIndex(int input[], int x) {
	       return lastIndex(input,x,input.length-1);
	    }
	    private static int lastIndex(int input[],int x,int startIndex){
	        if(startIndex<0)
	            return -1;
	        if(input[startIndex]==x)
	            return startIndex;
	        return lastIndex(input,x,startIndex-1);
	        }

	}
