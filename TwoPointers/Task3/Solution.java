class Solution {
    public int maxArea(int[] heights) {
        int maxLitres = 0;

        for(int i = 0; i < heights.length - 1; i++){
            for(int j = i + 1; j < heights.length; j++){
                int cL = countLitres(i, heights[i], heights[j], j);
                if(cL > maxLitres) {
                	maxLitres = cL;
                }
            }
        	
        }

        return maxLitres;
    }
    
    public int countLitres(int x1, int height1, int height2, int x2){
        int len = x2-x1;
        int height = Math.min(height1, height2);

        return len*height;
    }
}
