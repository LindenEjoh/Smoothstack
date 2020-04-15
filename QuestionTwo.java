

public class QuestionTwo {

	public static void main(String[] args) {
			int [][] twoD = {{1,8}, {4,6}};
			String position="";
			int largest=twoD[0][0];
			for (int i=0; i<twoD.length; i++) {
				for (int j=0; j< twoD.length; j++) {
					if (twoD[i][j] > largest) {
						largest=twoD[i][j];
						position="("+ i + "," + j + ")";
					}
				}
			}
		System.out.println(largest);
		System.out.println(position);
	}

}
