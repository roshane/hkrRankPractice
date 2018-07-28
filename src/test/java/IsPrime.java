import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 * Created by roshane on 7/8/2018.
 */
public class IsPrime {

    private static class IsPrimeHolder {
        private static final IsPrime INSTANCE = new IsPrime();
    }

    public IsPrime() {
        System.out.println(IsPrime.class.getName() + " Initialized");
    }

    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = (i) -> i * 2;
        
        IntStream.range(1, 5)
                .forEach(n -> {
                    System.out.println(String.format("%d isPrime %b", n, isPrime(n)));
                });
    }

    static boolean isPrime(final int i) {
        return i != 1 && IntStream.range(2, i)
                .noneMatch(x -> isDividableBy.apply(x).test(i));
    }

    private static final Function<Integer, IntPredicate> isDividableBy = (v) -> {
        System.out.println("returm predicate");
        return (i) -> i % v == 0;
    };
}
