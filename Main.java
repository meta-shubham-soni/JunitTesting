import java.util.Scanner;


public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Enter length of your array!");
		int lenOfArr = sc.nextInt();
		int[] arr = new int[lenOfArr];
		System.out.println("Enter elements of your array!");
		for(int i=0;i<lenOfArr;i++){
			int num = sc.nextInt();
			arr[i] = num;
		}
		int X,Y;
		System.out.println("Enter X & Y !");
		X = sc.nextInt();
		Y = sc.nextInt();
		ArrOperation arrOps = new ArrOperation();
		System.out.println("Largest Mirror Section Length:-");
		System.out.println(arrOps.maxMirror(arr));
		System.out.println("Number of Clumps:-");
		System.out.println(arrOps.findNumberOfClumps(arr));
		System.out.println("Fix XY:-");
		int[] tempArr = arrOps.fixXY(arr, X, Y);
		for(int i=0;i<lenOfArr;i++){
			System.out.print(tempArr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Split Array:-");
		System.out.println(arrOps.splitArray(arr));
		
		
	}
}
