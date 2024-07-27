public class SearchInRotatedArr {
    public static int search(int arr[], int tar, int si, int ei){
        // Base Case
        if(si > ei){
            return -1;
        }

        int mid = si + (ei - si) / 2; // middle element

        // check if middle element is target or not
        if(arr[mid] == tar){
            return mid;
        }

        // Search on line 1
        if(arr[si] <= arr[mid]){
            // Case a: left part
            if(arr[si] <= tar && tar <= arr[mid]){
                return search(arr, tar, si, mid - 1);
            }
            // Case b: right part
            else{
                return search(arr, tar, mid + 1, ei);
            }
        }
        // Search on line 2
        else{
            // case c: left part
            if(arr[mid] <= tar && tar <= arr[ei]){
                return search(arr, tar, mid + 1, ei);
            }
            // case d: right part
            else{
                return search(arr, tar, si, mid - 1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 5, 26, 9, 16};
        int target = 26;
        int tarInx = search(arr, target, 0, arr.length - 1);
        System.out.println(tarInx);
    }
}
