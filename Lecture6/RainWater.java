package Lecture6;

import java.util.Arrays;

public abstract class RainWater {

	public static void main(String[] args) {
		int[] hights = {4,2,0,3,2,5};

		int[] left = new int[hights.length];
		left[0] = hights[0];

		for (int i = 1; i < hights.length; i++) {
			left[i] = Math.max(left[i - 1], hights[i]);
		}
		System.out.println(Arrays.toString(left));

		int[] right = new int[hights.length];
		right[hights.length - 1] = hights[hights.length - 1];

		for (int i = hights.length - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], hights[i]);
		}
		System.out.println(Arrays.toString(right));

		int water = 0;
		for (int i = 0; i < hights.length; i++) {
			water += Math.min(left[i], right[i]) - hights[i];
		}
		System.out.println(water);
	}

}
