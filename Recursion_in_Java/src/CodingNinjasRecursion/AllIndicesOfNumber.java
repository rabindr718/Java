package CodingNinjasRecursion;

public class AllIndicesOfNumber {
	    public static int[] allIndexes(int input[], int x) {
	        return allIndexes(input,x,0);

	    }
	    private static int[] allIndexes(int input[],int x,int startIndex){
	        if(startIndex==input.length)
	        {
	            int output[]=new int[0];
	            return output;
	        }
	        int smallAns[]=allIndexes(input,x,startIndex+1);
	        if(input[startIndex]==x)
	        {
	            int answer[]=new int[smallAns.length+1];
	            answer[0]=startIndex;
	            for(int i=0;i<smallAns.length;i++){
	              answer[i+1]=smallAns[i];
	            }
	             return answer;
	        }
	       else
	           return smallAns;
	    }
	}
