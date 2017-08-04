package day04;

public class Insertion {
	public static void main(String[] args) {
		int a[]={1,2,7,5,8,0,4,6,2};
		
		for(int i=1;i<a.length;i++){
			
			for(int j=i;j>0&&(a[j]<a[j-1]);j--){
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	

}
