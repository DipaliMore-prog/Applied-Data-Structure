class BinarySearch {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int binarySearch(int arr[], int low, int high, int key) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if(arr[mid] == key) {
                return mid;
            }
            else if(arr[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1; // Not found
    }

    public static void main(String args[]) {
        int arr[] = {6, 3, 2, 5, 8};
        int n = arr.length;

        bubbleSort(arr);

        // Print sorted array
        for(int i = 0; i < n; i++) { 
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int result = binarySearch(arr, 0, n - 1, 5);
        if(result != -1) {
            System.out.println("Element is found at index " + result);
        } 
        else {
            System.out.println("Element Not found");
        }      
    }
}
