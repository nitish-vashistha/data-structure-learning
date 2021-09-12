public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("hello world");
        int myarray[] = {1,2,3,4,5,6,7,8,9};
        int outputArray[] = reverseArray(myarray);

        for(int i = 0 ; i < outputArray.length; i++){
            System.out.println(outputArray[i]);
        }
    }

    

    public static int[] reverseArray(int array[]){
        int i  = 0 ; 
        int j = array.length - 1;
        while(i<=j){
            // int ith = array[i];
            // int jth = array[j];
            // array[i] = jth;
            // array[j] = ith;
            // i++;
            // j--;


            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }
}