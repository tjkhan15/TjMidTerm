package algorithm;

public class Sort {

    long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper methods.
	 * Store all the sorted data into one of the databases.
	 */


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
    // ====================[ END OF SELECTION SORT  ]================================= \\

    // ====================[ START OF INSERTION SORT ]================================ \\

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int in, out;
        for (out = 1; out < array.length; out++) {
            int temp = array[out];
            in = out;

            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[in - 1];
                --in;
            }
            array[in] = temp;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    // ===================[ END OF INSERTION SORT  ]=============================== \\

    // ===================[ START OF BUBBLE SORT ]================================= \\

    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int out, in;
        for (out = array.length - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    int temp = array[in];
                    array[in] = array[in + 1];
                    array[in + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    // =====================[ END OF BUBBLE SORT  ]================================ \\

    // ====================[ START OF MERGE SORT ]================================= \\

    public static int[] leftHalf(int[] array ){
        int size1= array.length/2;
        int [] left = new int [size1];
        for (int i=0;i<size1;i++){
            left[i]=array[i];
        }
        return left ;
    }
    public static int[] righttHalf(int[] array ){
        int size1 = array.length/2;
        int size2 =array.length-size1;
        int [] right = new int [size2];
        for (int i=0;i<size2;i++){
            right[i]=array[i+size1];
        }
        return right ;
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++)
        {
            if (i2 >= right.length || (i1 < left.length &&
                    left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }

    public int[] mergeSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if (array . length >1 )
        {
            int[] leftArray = leftHalf(array);
            int[] rightArray = righttHalf(array);

            mergeSort(leftArray);
            mergeSort(rightArray);

            merge(array, leftArray, rightArray);

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;

        this.executionTime = executionTime;

        return list;
    }
    // ======================[ END OF MERGE SORT  ]================================ \\

    // ====================[ START OF QUICK SORT ]================================= \\

    public int[] quickSort(int [] array, int low, int high) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        if(low < high) {
            int next = partition(array, low, high);
            quickSort(array, low, next-1);
            quickSort(array, next+1, high);
        }
            final long endTime = System.currentTimeMillis();
            final long executionTime = endTime - startTime;
            this.executionTime = executionTime;
            return list;
        }

        public int partition(int array[], int p, int r){
            int part = p-1;
            int pivot = array[r];
            for(int i=p; i <= r; i++){
                if(array[i] <= pivot){
                    part++;
                    if(part != i){
                        array[part] = array[part] ^ array[i];
                        array[i] = array[part] ^ array[i];
                        array[part] = array[part] ^ array[i];
                    }
                }
            }
            return part;
        }
    // ======================[ END OF QUICK SORT  ]================================ \\

    // =====================[ START OF HEAP SORT ]================================= \\

    public int[] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        buildHeap(array);
        for(int i = array.length-1; i>=1; i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public void buildHeap(int[] array){
        for(int i=array.length/2-1; i >= 0; i--){
            heapify(array, array.length, i);
        }
    }

    public void heapify(int[] array, int n, int i){
        int max;
        int child;
        child = 2 * i + 1;
        max = i;
        if(child < n){
            if(array[child] > array[max]){
                max = child;
            }
            if(child+1 < n){
                if(array[child + 1] > array[max]){
                    max = child + 1;
                }
            }
            if(max != i){
                int temp = array[i];
                array[i] = array[max];
                array[max] = temp;
                heapify(array, n, max);
            }
        }
    }
    // =======================[ END OF HEAP SORT  ]================================ \\

    // ======================[ START OF BUCKET SORT ]============================== \\

    public int[] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int maxVal = getMax(array);
        int[] bucket = new int[maxVal+1];
        for(int i=0; i<bucket.length; i++){
            bucket[i] = 0;
        }

        for(int i=0; i<array.length; i++){
            bucket[array[i]]++;
        }

        int outPos = 0;
        for(int i=0; i<bucket.length; i++){
            for(int j=0; j<bucket[i]; j++){
                array[outPos++] = i;
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int getMax(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    // ======================[ END OF BUCKET SORT  ]================================ \\

    // =======================[ START OF SHELL SORT ]=============================== \\

    public int[] shellSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        int inner, outer;
        int temp;
        int h = 1;
        while(h <= array.length/3)
            h = h*3 + 1;
        while(h>0) {
            for(outer=h; outer<array.length; outer++) {
                temp = list[outer];
                inner = outer;
                while(inner > h-1 && list[inner-h] >= temp)
                {
                    list[inner] = list[inner-h];
                    inner -= h;
                }
                list[inner] = temp;
            }
            h = (h-1) / 3;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    // =======================[ END OF SHELL SORT  ]================================ \\

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
