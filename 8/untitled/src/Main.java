public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];

        for(int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }

        Calculate calculate = new Calculate();
        int[] result = calculate.calculate(array, 5);

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println(result[i]);
            }
        }



    }
}g