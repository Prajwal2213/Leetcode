class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int max_ind = 0;
        double area = 0;
        double max = 0;
        for(int i = 0;i < dimensions.length  ;i++){
            int l = dimensions[i][0];
            int w = dimensions[i][1];
            area = Math.sqrt(l * l + w * w);
            if(area > max || (area == max && l * w > dimensions[max_ind][0] * dimensions[max_ind][1])){
                max = area;
                max_ind = i;
            }
            
        }
        return (dimensions[max_ind][0] * dimensions[max_ind][1]);
    }
}