public class Ceiling {
    public static void main(String[] args){
        int[] arr = {2, 5, 9, 14, 18};
        int target = 10;

        int result = ceiling(arr, target);
        System.out.println(result);
    }

   static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]) {
            return -1;
        }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return arr[mid];
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start]; 
    }
}


        


    

