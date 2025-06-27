import java.util.concurrent.RecursiveTask;
import java.util.concurrent.ForkJoinPool;

public class T8Q4 {

    // RecursiveTask to find the maximum value in a subarray
    static class MaxValueTask extends RecursiveTask<Integer> {
        private final int[] array;
        private final int start;
        private final int end;
        private static final int THRESHOLD = 1000; // Threshold for splitting the array into smaller sub-arrays

        public MaxValueTask(int[] array, int start, int end) {
            this.array = array;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {
            if (end - start <= THRESHOLD) {
                // If the sub-array is small enough, find the maximum value directly
                int max = array[start];
                for (int i = start + 1; i < end; i++) {
                    if (array[i] > max) {
                        max = array[i];
                    }
                }
                return max;
            } else {
                // Otherwise, split the task into two sub-tasks
                int mid = (start + end) / 2;
                MaxValueTask leftTask = new MaxValueTask(array, start, mid);
                MaxValueTask rightTask = new MaxValueTask(array, mid, end);

                // Fork the tasks (execute them asynchronously)
                leftTask.fork();
                rightTask.fork();

                // Wait for the results from both tasks
                int leftMax = leftTask.join();
                int rightMax = rightTask.join();

                // Return the maximum of the two results
                return Math.max(leftMax, rightMax);
            }
        }
    }

    public static void main(String[] args) {
        // Create a large array of random numbers
        int[] array = new int[1000000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100000); // Random numbers between 0 and 99999
        }

        // Create a ForkJoinPool to manage the parallel execution
        ForkJoinPool forkJoinPool = new ForkJoinPool();

        // Submit the task to the ForkJoinPool
        MaxValueTask task = new MaxValueTask(array, 0, array.length);
        int maxValue = forkJoinPool.invoke(task);

        // Output the result
        System.out.println("The maximum value in the array is: " + maxValue);

        // Shut down the ForkJoinPool
        forkJoinPool.shutdown();
    }
}

