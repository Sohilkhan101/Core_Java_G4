package Lecture8;

public class TransposeMatrix {
	public int[][] transpose(int[][] nums) {
        int row=nums.length;
        int col=nums[0].length;
        int[][] ans=new int[col][row];

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                ans[j][i]=nums[i][j];
            }
        }
        return ans;
        
    }
}
