package app;

public class ArrayUtils {

    @MethodInfo(name = "sum", returnType = "int", description = "Calculates total sum of array.")
    @Author(firstName = "Dmytro", lastName = "Slobodian")

    public int sum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    @MethodInfo(name = "max", returnType = "int", description = "Finds max element in array.")
    @Author(firstName = "Dmytro", lastName = "Slobodian")

    public int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
