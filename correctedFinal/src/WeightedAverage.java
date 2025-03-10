import java.math.BigInteger;
import java.util.List;
import java.util.Arrays;

public class WeightedAverage {

    public static double mean(List<Integer> numbers, List<Integer> weights) {
        // Check for null arguments
        if (numbers == null || weights == null) {
            throw new IllegalArgumentException("Arguments cannot be null");
        }

        // Check if the lists have the same length
        if (numbers.size() != weights.size()) {
            throw new IllegalArgumentException("The lists must have the same length");
        }

        BigInteger total = BigInteger.ZERO;
        BigInteger totalWeights = BigInteger.ZERO;

        // Calculate the weighted sum and total weight using BigInteger
        for (int i = 0; i < numbers.size(); i++) {
            BigInteger num = BigInteger.valueOf(numbers.get(i));
            BigInteger weight = BigInteger.valueOf(weights.get(i));
            total = total.add(num.multiply(weight));
            totalWeights = totalWeights.add(weight);
        }

        // Handle division by zero
        if (totalWeights.equals(BigInteger.ZERO)) {
            throw new IllegalArgumentException("Total weight cannot be zero");
        }

        // Perform division and return the result as a double
        BigInteger result = total.divide(totalWeights);
        return result.doubleValue();
    }

    public static void main(String[] args) {
        // Example usage
        List<Integer> a = Arrays.asList(3, 6);
        List<Integer> b = Arrays.asList(4, 2);

        System.out.println(WeightedAverage.mean(a, b)); // Output should be 4.0
    }
}
