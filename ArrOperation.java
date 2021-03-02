import java.util.*;



public class ArrOperation {
	
	/**
	 * Find largest mirror section in array nums
	 * @param array of int nums
	 * @return int length of largest mirror section
	 **/
	public int maxMirror(int[] nums) {
	    int max = 0;
	    assert nums.length != 0 : "Array is empty" ;
	    if(arr.length == 0)
	    	return  -1;
	    for(int i = 0; i < nums.length; i++) {
	        int count = 0;
	        for(int j = nums.length - 1; j >= 0 && i + count < nums.length; j--) {
	            if(nums[i + count] == nums[j]) {
	                count++;
	            } else {
	                max = Math.max(max, count);
	                count = 0;
	            }
	        }
	                                                                
	        max = Math.max(max, count);
	    }
	    
	    return max == 1 ? 0 : max;
	}
	
	/**
	 * Find number of clumps in array 
	 * @param array of int 
	 * @return int total number of clumps / groups
	 **/
	public int findNumberOfClumps(int[] arr){
		int count = 0,numberOfClumps = 0;
	    assert arr.length != 0 : "Array is empty" ;
	    if(arr.length == 0)
	    	return  -1;
		for(int i=1;i<arr.length;i++){
			if(arr[i] == arr[i-1]){
				count++;
				if(count == 1)
					numberOfClumps++;
			}
			else{
				count=0;
			}
		}
		return numberOfClumps;
	}
	
	/**
	 * Set X and Y in array simultaneously 
	 * @param array of int 
	 * @param int X
	 * @param int Y
	 * @return array after shuffling 
	 **/
	public int[] fixXY(int[] arr,int X,int Y){
		int noOfX = 0,noOfY = 0;
		int[] ret = new int[1];
		ret[0] = -1;
		boolean flag = false;
	    assert arr.length != 0 : "Array is empty" ;
	    if(arr.length == 0)
	    	return  -1;
		List<Integer> yInd = new ArrayList<Integer>();
		List<Integer> xInd = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++){
			if(arr[i] == X){
				noOfX++;
				if(i>0 && arr[i-1] == X){
					flag = true;
					break;
				}
				if(i == arr.length-1){
					flag = true;
					break;
				}
				xInd.add(i+1);
			}
			else if(arr[i] == Y){
				noOfY++;
				yInd.add(i);
			}
		}

		if(flag == true || noOfX != noOfY ){
			return ret;
		}
		assert flag != true : "X is present at last index or two X are occuring consecutively" ;
		assert noOfX == noOfY : "Number of X is not equal to Number of Y ";
		
		for(int i=0;i<noOfX;i++){
			if(yInd.contains(xInd.get(i))){
				yInd.remove(xInd.get(i));
				xInd.remove(i);
			}
		}	
		
		for(int i=0;i<xInd.size();i++){
			int temp = arr[xInd.get(i)];
			arr[xInd.get(i)] = Y;
			arr[yInd.get(i)] = temp;
		}
		
		return arr;
	}
	
	/**
	 * Find index in array where , sum is equal of both sides 
	 * @param array of int 
	 * @return int ideal index 
	 **/
	public int splitArray(int[] arr){
		int splitIndex = -1;
	    assert arr.length != 0 : "Array is empty" ;
	    if(arr.length == 0)
	    	return  -1;
	    
		int[] sumArray = new int[arr.length];
		sumArray[0] = arr[0];
		int totalSum = arr[0];
		for(int i=1;i<arr.length;i++){
			sumArray[i] = sumArray[i-1] + arr[i];
			totalSum += arr[i];
		}
		
		for(int i=0;i<arr.length;i++){
			if(sumArray[i] == totalSum - sumArray[i]){
				splitIndex = i;
			}
				
		}
		
		return splitIndex == -1 ? -1 : splitIndex+1;
	}
}
