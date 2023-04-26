public class Calculate {

    public int[] calculate(int[] array, int number){
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++){
            result[i] = array[i] * number;
        }

        return result;
    }
}
