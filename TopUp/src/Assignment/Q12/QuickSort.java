package Assignment.Q12;


public class QuickSort {


        private int array[];
        private int length;

        public void sort(int[] input) {

            if (input == null || input.length == 0) {
                return;
            }
            this.array = input;
            length = input.length;
            quickSort(0, length - 1);
        }

        private void quickSort(int smaller, int bigger) {

            int i = smaller;
            int j = bigger;
            int result = array[smaller+(bigger-smaller)/2];

            while (i <= j) {

                while (array[i] < result) {
                    i++;
                }
                while (array[j] > result) {
                    j--;
                }
                if (i <= j) {
                    exNum(i, j);
                    i++;
                    j--;
                }
            }
            if (smaller < j)
                quickSort(smaller, j);
            if (i < bigger)
                quickSort(i, bigger);
        }

        private void exNum(int i, int n) {
            int temp = array[i];
            array[i] = array[n];
            array[n] = temp;
        }

        public static void main(String a[]){

            QuickSort sorter = new QuickSort();
            int[] input = {30,13,22,90};
            sorter.sort(input);
            for(int i:input){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }

