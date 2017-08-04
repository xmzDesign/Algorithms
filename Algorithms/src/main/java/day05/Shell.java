package day05;

public class Shell {
	public static void main(String[] args) {
		int []a={1,3,6,9,3,6,8,2,0,2};
		int l=a.length;
		int h=0;
		int temp=0;
		while(h<(l/3)){
			h=h*3+1;
		}
		while(h>=1){
			for(int i=h;i<l;i++){
				//将a[i] 插入到a[i-h],a[i-2h]
				for(int j=i;j>=h;j-=h){
					if(a[j]<a[j-h]){
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					}
				}
			}
			h=h/3;
		}
		for(int i=0;i<l;i++){
			System.out.print(a[i]+"  ");
		}
	}

}
