public class TrappingRainWater {
    public static int calculateTotalWater(int height[]){
        int n = height.length;

        // Maximum height of left bars - auxilary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // Maximum height of right bars - auxilary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int trappedWater = 0;
        // loop
        for(int i = 0; i < n; i++){
            // Calculate Water Level = min(leftHeight, rightHeight)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // Calculate trapped water = WaterLevel - curr bar height
            trappedWater += waterLevel - height[i];
        } 

        return trappedWater;


    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("Total Trapped Water: " + calculateTotalWater(height));
    }
}
