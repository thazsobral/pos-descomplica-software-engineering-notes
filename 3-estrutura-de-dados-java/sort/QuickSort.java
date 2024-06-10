package sort;

public class QuickSort {
    public static void sort(int p, int q, int array[]) {
        int x;
        if(p<q) {
            x = partiction(p,q,array);
            sort(p, x-1, array);
            sort(x+1, q, array);
        }

    }

    public static int partiction(int p, int q, int array[]) {
        int j  = p - 1;
        int temp, aux = array[q];

        for(int i = p; i <= q; i++) {
            if(array[i] <= aux) {
                j++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int array[] = {2,1,56,23,33,1001,103};

        System.out.println("Vetor original:");
        for (int j : array) {
            System.out.println(j);
        }

        System.out.println("Organizando o vetor ...");
        sort(0, array.length-1, array);
        
        System.out.println("Vetor ordenado:");
        for (int j : array) {
            System.out.println(j);
        }

        System.exit(0);
    }
}
