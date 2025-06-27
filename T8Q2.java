import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class T8Q2 {

    // Callable task that calculates the sum of the first N natural numbers
    static class SumOfNaturalNumbersTask implements Callable<Integer> {
        private final int N;

        public SumOfNaturalNumbersTask(int N) {
            this.N = N;
        }

        @Override
        public Integer call() {
            // Formula for the sum of the first N natural numbers: N * (N + 1) / 2
            return N * (N + 1) / 2;
        }
    }

    public static void main(String[] args) {
        int N = 10; // You can change N to any number to calculate sum for different ranges

        // Create an ExecutorService with a fixed thread pool
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Create a Callable task with the number N
        Callable<Integer> sumTask = new SumOfNaturalNumbersTask(N);

        // Submit the task to the executor
        Future<Integer> futureResult = executorService.submit(sumTask);

        try {
            // Get the result from the Future object (this will block until the result is available)
            Integer result = futureResult.get();
            System.out.println("The sum of the first " + N + " natural numbers is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Shut down the executor
            executorService.shutdown();
        }
    }
}
