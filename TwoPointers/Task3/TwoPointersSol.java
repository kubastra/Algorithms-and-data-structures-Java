class TwoPointersSol {
    public int maxArea(int[] heights) {
        int maxLitres = 0;

        int i = 0; 
        int j = heights.length - 1;
        while (i < j){
            int cL = countLitres(i, heights[i], heights[j], j);
            if(cL > maxLitres) {
                maxLitres = cL;
            }
            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
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
