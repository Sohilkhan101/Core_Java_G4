package Lecture30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
	public static void main(String[] args) {
		List<List<String>> ans = new ArrayList<>();
		String[] str = { "bbbbbbbbbbc", "bdddddddddd" };
		HashMap<String, List<String>> map = new HashMap<>();
		for (String s : str) {
			String key = genrateKey(s);
			if (map.containsKey(key)) {
				map.get(key).add(s);
			} else {
				List<String> list = new ArrayList<>();
				list.add(s);
				map.put(key, list);
			}
		}
		for (String k : map.keySet()) {
			ans.add(map.get(k));
		}
		System.out.println(ans);

	}

	private static String genrateKey(String s) {
		int[] arr = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			arr[ch - 'a'] = arr[ch - 'a'] + 1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			sb.append(",");
		}
		return sb.toString();
	}

}
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//[[bdddddddddd], [bbbbbbbbbbc]]
