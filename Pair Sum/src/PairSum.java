import java.util.Scanner;

public class PairSum {

	
	static int[] takeInput() {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the size of array : ");
		int n=s.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the elem at "+i+"th index : ");
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	static void printInput(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
							
				System.out.print(arr[i]+" ");
					
		}
		System.out.println();
	}

	static int pairSum(int arr[],int x) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==x) {
					sum+=1;
				}
			}
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int arr1[]=takeInput();

       
         System.out.println(pairSum(arr1 ,12));
		
		
	}

}
