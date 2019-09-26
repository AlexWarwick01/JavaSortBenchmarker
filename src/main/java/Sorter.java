public class Sorter {

//THIS IS A METHOD THAT WILL COMPLETE A BUBBLE SORT
    void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    //END OF BUBBLESORT

//THIS IS A METHOD THAT WILL COMPLETE A QUICKSORT
    void qSort(int arr[], int low, int high){
        if (low < high){
            int pIndex = partition(arr, low, high);

            qSort(arr, low, pIndex-1);
            qSort(arr, pIndex+1, high);
        }
    }


    private int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++){
            if (arr[j] < pivot){
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

}
