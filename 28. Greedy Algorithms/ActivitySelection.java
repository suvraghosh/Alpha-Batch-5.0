import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

// Without Sorting - Time Complexity O(n)
// With Sorting - Time Complexity O(n log n) 
public class ActivitySelection{
    public static void main(String[] args) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // Sorting if the array is not sorted
        int activities[][] = new int[start.length][3];
        for(int i = 0; i < start.length; i++){
            activities[i][0] = i; // Storing index
            activities[i][1] = start[i]; // Storing start
            activities[i][2] = end[i]; // Storing end
        }

        // lambda function -> sort based on the end index
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int maxNumberOfActivityPerform = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // First Activity always played
        maxNumberOfActivityPerform = 1;
        ans.add(activities[0][0]);
        int lastEndingIndexOfActivity = activities[0][2];

        for(int i = 1; i < end.length; i++){
            if(activities[i][1] >= lastEndingIndexOfActivity){
                maxNumberOfActivityPerform++;
                ans.add(activities[i][0]);
                lastEndingIndexOfActivity = activities[i][2];
            }
        }

        System.out.println("Total Number of Activities: " + maxNumberOfActivityPerform);

        for(int i = 0; i < ans.size(); i++){
            System.out.print("A" + ans.get(i)+ " ");
        }
    }
}