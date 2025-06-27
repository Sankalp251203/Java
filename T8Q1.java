import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class T8Q1 {

    // Callable task that calculates the sum of two numbers
    static class SumTask implements Callable<Integer> {
        private final int num1;
        private final int num2;

        public SumTask(int num1, int num2) {
            this.num1 = num1;
            this.num2 = num2;
        }

        @Override
        public Integer call() {
            // Return the sum of the two numbers
            return num1 + num2;
        }
    }

    public static void main(String[] args) {
        // Create an ExecutorService with a fixed thread pool
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Create a Callable task with the numbers 5 and 10
        Callable<Integer> sumTask = new SumTask(5, 10);

        // Submit the task to the executor
        Future<Integer> futureResult = executorService.submit(sumTask);

        try {
            // Get the result from the Future object (this will block until the result is available)
            Integer result = futureResult.get();
            System.out.println("The sum of the numbers is: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Shut down the executor
            executorService.shutdown();
        }
    }
}
