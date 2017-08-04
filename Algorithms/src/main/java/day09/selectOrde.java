package day09;

public class selectOrde {
	public static void main(String[] args) {
		int []a={1,3,6,2,8,3,9};
		for(int i=0;i<a.length;i++){
			int min=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[min]){
					min=j;
					int temp=a[j];
					a[j]=a[min];
					a[min]=temp;
				}
			}
			
		}
	}

}
