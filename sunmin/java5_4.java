//2���� �迭 arr�� ��� ��� ���� ���հ� ����� ���ϴ� ���α׷��� �ϼ��Ͻÿ�.
public class java5_4 {

	public static void main(String[] args) {
		 
		 int [][] arr =	{{5, 5, 5, 5, 5},
						{10, 10, 10, 10, 10},
						{20, 20, 20, 20, 20},
						{30, 30, 30, 30, 30}};
	int div = 0;
	int total = 0;
	float average = 0;
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr[i].length; j++) {
			div++; //i,j ���̸�ŭ �Բ� �����Ѵ�.
			total+=arr[i][j];
		}
	}
//	System.out.println(total);
//	System.out.println(div);
	average=(float)total/(float)div;
	
	
	System.out.println("total="+total);
	System.out.println("average="+average);

	}

}
