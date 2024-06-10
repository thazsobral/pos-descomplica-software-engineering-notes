package sort;

public class MergeSort {
    public static void sort(int[] vector, int start, int end) {
        if(start == end) {
            return;
        }
        int middle = (start+end)/2;
        sort(vector, start, middle);
        sort(vector, middle+1, end);
        merge(vector, start, middle, end);
    }

    public static void merge(int[] a, int start, int middle, int end) {
        int n = end - start + 1;
        int[] b = new int[n];
        int i1 = start, i2 = middle + 1, j = 0;

        while(i1 <= middle && i2 <= end) {
            if(a[i1] < a[i2]) {
                b[j] = a[i1];
                i1++;
            } else {
                b[j] = a[i2];
                i2++;
            }
            j += 1;
        }

        while(i1 <= middle) {
            b[j] = a[i1];
            i1 += 1;
            j += 1;
        }

        while(i2 <= end) {
            b[j] = a[i2];
            i2 += 1;
            j += 1;
        }

        for(j = 0; j < n; j++) {
            a[start + j] = b[j];
        }
    }

    public static void main(String[] args) {
        int array[] = {2,1,56,23,33,1001,103};

        System.out.println("Vetor original:");
        for (int j : array) {
            System.out.println(j);
        }

        System.out.println("Organizando o vetor ...");
        sort(array, 0, array.length-1);
        
        System.out.println("Vetor ordenado:");
        for (int j : array) {
            System.out.println(j);
        }

        System.exit(0);

    }
}
