public class Main {
	public static void main(String[] args) {
		int[] n = {49,36,8,10,12};
		
		int[][] res = new int[n.length][];
		
		for (int i=0; i<n.length; i++) {
			int weight = 0;
			if (Math.floor(Math.sqrt(n[i])) - Math.sqrt(n[i]) == 0) {
				weight += 5;
			}
			if (n[i]%4 == 0 && n[i]%6 ==0) {
				weight += 4;
			}
			if (n[i]%2 == 0) {
				weight += 3;
			}
			res[i] = new int[] {n[i], weight};
		}
			sortOnWeight(res);
			System.out.println(Arrays.deepToString(res)); 
	}
	static void sortOnWeight(int[][] arr) {		
	Arrays.sort(arr, (a1,a2) -> (Integer.compare(a2[1], a1[1]) == 0 ? 
										Integer.compare(a2[0], a1[0]): 
										Integer.compare(a2[1], a1[1])));
		
	}
}