package Lecture16;

public class CBNumber {
	public static void main(String[] args) {
		String s = "81615";
		boolean visited[] = new boolean[s.length()];
		for (int len = 1; len <= s.length(); len++) {
			for (int i = 0; i <= s.length() - len; i++) {
				String k = s.substring(i, i + len);
				if (isCBNumber(Integer.parseInt(k))&& isvisited(i,i+len,visited)) {
					System.out.println(k);
					for(int k1=i;k1<(len+i);k1++) {
						visited[k1]=true;
					}
				}
			}
		}
	}
	private static boolean isvisited(int si, int ei,boolean [] visited) {
		for(int i=si;i<ei;i++) {
			if(visited[i]==true) {
				return false;
			}
		}	
		return true;
	}

	private static boolean isCBNumber(int val) {
		// 1
		if (val == 1 || val == 0) {
			return false;
		}

		// 2
		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int k : arr) {
			if (val == k) {
				return true;
			}
		}

		// 3
		for (int k : arr) {
			if (val % k == 0) {
				return false;
			}
		}

		return true;
	}
}
