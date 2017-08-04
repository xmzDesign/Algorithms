package day02;

public class Erfen {
	public static void main(String[] args) {
		int []a={4,2,1,6,3,6,0,-5,1,1};
		
		for(int i=1;i<a.length;i++){
			int low=0;
			int high=i-1;
			int temp=a[i];
			int mid;
			while(low<=high){
				mid=(high+low)/2;
				if(a[mid]>temp){
					high=mid-1;
				}
				if(a[mid]<=temp){
					low=mid+1;
				}
			}
			for(int j=i-1;j>high;j--){
				a[j+1]=a[j];
			}
			a[high+1]=temp;
		}
		for(int i=0;i<10;i++){
            System.out.printf("%d ",a[i]);
        }
	}

}
