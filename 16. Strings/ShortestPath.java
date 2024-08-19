public class ShortestPath {
    // Time Complexity: O(n)
    public static float calculateShortestPath(String path){
        int x = 0, y = 0;
        for(int i = 0; i < path.length(); i++){
            char direction = path.charAt(i);
            // South
            if (direction == 'S') {
                y--;
            }
            // North
            else if (direction == 'N'){
                y++;
            }
            // West
            else if(direction == 'W'){
                x--;
            }else{
                // East
                x++;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        String dir = "WNEENESENNN";
        System.out.println(calculateShortestPath(dir));
    }
}
