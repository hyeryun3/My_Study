package workshop;

public class Test03 {
	public static void main(String[] args) {
		int[][] arr2 = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
		int total=0, cnt=0;
		double avg=0;
		
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				total += arr2[i][j];
				cnt++;
			}
		}
		avg=(float)total/cnt;

		System.out.println("total="+total);
		System.out.println("average="+avg);
	}
}