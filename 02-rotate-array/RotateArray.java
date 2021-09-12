public class RotateArray{
    public static void main(String[] args) {
        // System.out.println("hello world");
        int[] myArray = {1,2,3,4,5};
        int[] result = rotate(myArray, -101);
        for(int i = 0 ; i < result.length; i++){
            System.out.println(result[i]);
        }
    }

    public static int[] reverse(int[] array, int i , int j){
        while(i < j){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
        return array;
    }

    public static int[] rotate(int[] array, int k){
        k = k % array.length;
        if(k < 0){
            k = k + array.length;
        }
        int partitionPoint = array.length - k - 1;
        reverse(array, 0, partitionPoint);
        reverse(array, partitionPoint+1, array.length - 1);
        reverse(array, 0, array.length - 1);
        return array;
    }

}