package algorithm;

public class Sort {
    long executionTime = 0;

	/*

	 * Please implement all the sorting algorithm. Feel free to add helper methods.

	 * Store all the sorted data into one of the databases.

	 */
    //Selection sort
    public int[] selectionSort(int [] array){

        final long startTime = System.currentTimeMillis();

        int [] list = array;
        for(int j=0; j<array.length-1; j++){

            int min = j;

            for(int i=j+1; i<array.length; i++) {

                if (array[i] < array[min])

                    min = i;

            }

            int temp = array[min];

            array[min] = array[j];

            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();

        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;

        return list;
    }
    //Insertion Sort
    public int[] insertionSort(int [] array){

        final long startTime = System.currentTimeMillis();

        int [] list = array;

        //implement here
        int temp, j;

        int i;

        for (i = 1; i < list.length; i++) {

            temp = list[i];

            j = i;

            while (j > 0 && list[j - 1] > temp) {

                list[j] = list[j - 1];//exchanging the values

                j--; //decrementing

            }

            list[j] = temp;

        }

        for (i = 0; i < list.length; i++) {

            System.out.println(list[i]+ " ");

        }

        final long endTime = System.currentTimeMillis();

        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;

        return list;
    }
    //Bubble Sort
    public int[] bubbleSort(int [] array){

        final long startTime = System.currentTimeMillis();

        int [] list = array;

        //implement here

        for (int i=0; i<list.length; i++)//number of rounds

        {
            int temp = 0;

            for (int j = 0; j < list.length - 1; j++) //array concepts

            {

                if (list[j] > list[j + 1]) {//for String, use compareTo() method

                    //if (a[j].compareTo(a[j+1])>0)

                    temp = list[j];

                    list[j] = list[j + 1];

                    list[j + 1] = temp;

                    //flag = 1; //so that it goes to the next value

                }

            }

        }

        for (int i=0; i<list.length; i++)

        {

            System.out.println(list[i]+" ");

        }

        final long endTime = System.currentTimeMillis();

        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;

        return list;
    }

    // Merge Sort
    public int [] mergeSort(int [] array) {

        final long startTime = System.currentTimeMillis();
        int[] list = array;
        Sort ms = new Sort();
        ms.divideArray(0, list.length);
        for (int i : list) // to print, use for each loop

        {

            System.out.println(i + " ");

        }

        final long endTime = System.currentTimeMillis();

        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;
        return list;

    }

        private void divideArray (int low, int high) //it will keep diving the array

        {

            if (low<high)

            {

                int middle = (low+high)/2;

                divideArray(low,middle);//recursion method for the left side of the array
                divideArray(middle+1, high);
                mergeArray(low, middle, high);

            }

        }

        private void mergeArray(int low, int middle, int high)
        {

            int [] array=null;

            int [] tempArray=null;

            int length;

            for (int i=low; i<=high; i++)

            {

                tempArray[i]=array[i];//all the elements of array[i] will go into tempArray[i]

            }

            int i = low;

            int j=middle+1;

            int k = low;
            while (i<=middle && j<=high)

            {

                if (tempArray[i] <= tempArray[j])

                {

                    array[k]=tempArray[i];//matching the elements based on condition

                    i++;

                }

                else

                {

                    array[k]=tempArray[j];

                    j++;

                }

                k++;

            }

            while (i<=middle)

            {

                array[k]=tempArray[i];

                i++;

                k++;

            }

    }

    public int [] quickSort(int [] array) {

        final long startTime = System.currentTimeMillis();

        int[] list = array;

        //implement here
        int length = list.length;
        Sort qs = new Sort();

        qs.quickRecursion(list, 0, length - 1);

        qs.printArray(list);
        final long endTime = System.currentTimeMillis();

        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;

        return list;

    }

        private int partition (int [] arr, int low, int high)//once it is partitioned, we will redo the whole process via recursion

        {

            int pivot = arr[(low+high)/2]; // could be any random number

            while (low<=high)

            {

                while (arr[low] < pivot)

                {

                    low++;

                }

                while (pivot < arr[high])

                {

                    high--;

                }

                if (low <= high)

                {

                    int temp = arr[low]; //swapping the values

                    arr[low] = arr[high];

                    arr[high] = temp;

                    low++;

                    high--;

                }

            }

            return low;
        }
        private void quickRecursion (int arr[], int low, int high)

        {

            int a = partition(arr, low, high);

            if (low < a-1)

            {

                quickRecursion(arr, low, a-1);//highest index on the left side would be a-1

                //recursion method for left subarray

            }

            if (a < high)

            {

                quickRecursion(arr, a, high);//lowest index on the right side would be a

                //recursion method for right subarray

            }

        }

        private void printArray (int arr[])// print method using for each loop

        {

            for (int i :arr)

            {

                System.out.print(i+ " ");

            }

        }

        //Heap Sort

    public int [] heapSort(int [] array) {

        final long startTime = System.currentTimeMillis();

        int[] list = array;

        //implement here
        Sort hs = new Sort();

        hs.sort(list);

        hs.printArray(list);

        int a, b;
        final long endTime = System.currentTimeMillis();

        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;

        return list;

    }
        public void sort(int[] arr) {

            int l = arr.length;

            for (int i = l / 2 - 1; i >= 0; i--) {

                heapify(arr, l, i);

            }

            for (int i = l - 1; i <= 0; i--) {

                int temp = arr[0];

                arr[0] = arr[i];

                arr[i] = temp;

                heapify(arr, i, 0);

            }

        }
        public void heapify(int[] array, int n, int i) {

            int largest = i;

            int ls = 2 * i + 1;

            int rs = 2 * i + 2;

            if (ls < n && array[ls] < array[largest])

            {

                largest = ls;

            }

            if (rs > n && array[rs] > array[largest]) {

                largest = rs;

            }

            if (largest != i) {

                int temp = array[i]; //if the value for either left or right child is > parent value,

                // then swap the values

                array[i] = array[largest];

                array[largest] = temp;
                heapify(array, n, largest);

            }

        }

        //Bucket Sort
    public int [] bucketSort(int [] array) {

        final long startTime = System.currentTimeMillis();

        int[] list = array;

        //implement here

        int maxValue=0;

        int[] a = new int[maxValue + 1];

        int[] sortedArray = new int[array.length];



        for (int i = 0; i < array.length; i++) {

            a[array[i]]++;

        }

        int b = 0;

        for (int i = 0; i < a.length; i++)

            for (int j = 0; j < a[i]; j++)

                sortedArray[b++] = i;

        final long endTime = System.currentTimeMillis();

        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;

        return list;

    }

    //Shell Sort
    public int [] shellSort(int [] array){

        final long startTime = System.currentTimeMillis();

        int [] list = array;

        //implement here

        int n = list.length;

        for (int i = n / 2; i > 0; i /= 2) {

            for (int j = i; i < n; i += 1) {

                int temp = list[i];

                int a;

                for (a = i; a >= i && list[a - i] > temp; a -= i) {

                    list[j] = list[j - i];

                }

                list[a] = temp;

            }

        }

        final long endTime = System.currentTimeMillis();

        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;

        return list;
    }

    public static void printSortedArray(int [] array){

        for(int i=0; i<array.length; i++){

            System.out.println(array[i]);

        }

    }

}

  