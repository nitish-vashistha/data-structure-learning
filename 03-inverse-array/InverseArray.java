public class InverseArray{
    public static void main(String[] args) {
        int[] myArray = {1,3,0,2};
        int[] inversed = inverse(myArray);
        for(int i = 0; i < inversed.length; i++){
            System.out.println(inversed[i]);
        }
    }

    public static int[] inverse(int[] array){
        int[] inverse = new int[array.length];
        for(int i = 0 ; i < array.length; i++){
            int value = array[i];
            // array ---> {1,3,0,2}
            inverse[value] = i;
        }
        return inverse;
    }
}