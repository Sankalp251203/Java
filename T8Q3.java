import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class T8Q3 {

    // RecursiveTask to count even and odd numbers in a subarray
    static class CountTask extends RecursiveTask<int[]> {
        private final int[] array;
        private final int start;
        private final int end;
        private static final int THRESHOLD = 1000; // Threshold for splitting the array into smaller sub-arrays

        public CountTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected int[] compute() {
            if (end - start <= THRESHOLD) {
                // If the sub-array is small enough, count the even and odd numbers directly
                int evenCount = 0;
                int oddCount = 0;
                for (int i = start; i < end; i++) {
                    if (array[i] % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
                return new int[]{evenCount, oddCount};
            } else {
                // Otherwise, split the task into two sub-tasks
                int mid = (start + end) / 2;
                CountTask leftTask = new CountTask(array, start, mid);
                CountTask rightTask = new CountTask(array, mid, end);

                // Fork the tasks (execute them asynchronously)
                leftTask.fork();
                rightTask.fork();

                // Wait for the results from both tasks
                int[] leftResult = leftTask.join();
                int[] rightResult = rightTask.join();

                // Combine the results
                return new int[]{leftResult[0] + rightResult[0], leftResult[1] + rightResult[1]};
            }
        }
    }

    public static void main(String[] args) {
        // Create a large array of random numbers
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // Random numbers between 0 and 99
        }

        // Create a ForkJoinPool to manage the parallel execution
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        // Submit the task to the ForkJoinPool
        CountTask task = new CountTask(array, 0, array.length);
        int[] result = forkJoinPool.invoke(task);

        // Output the results
        System.out.println("Even numbers: " + result[0]);
        System.out.println("Odd numbers: " + result[1]);

        // Shut down the ForkJoinPool
        forkJoinPool.shutdown();
    }
}

