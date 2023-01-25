package factorial;
import java.math.BigInteger;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FactorialCalculator {
  // The array of 3-digit numbers whose factorials we want to calculate
  private static final int[] NUMBERS = {100, 200, 300, 400, 500};

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    // Calculate the factorials using multithreading
    long startTime = System.currentTimeMillis();
    BigInteger[] results = calculateFactorialsUsingMultithreading();
    long endTime = System.currentTimeMillis();
    System.out.println("Time taken (multithreading): " + (endTime - startTime) + "ms");
    for (BigInteger result : results) {
      System.out.println("Result: " + result);
    }

    // Calculate the factorials using parallel programming
    startTime = System.currentTimeMillis();
    results = calculateFactorialsUsingParallelProgramming();
    endTime = System.currentTimeMillis();
    System.out.println("Time taken (parallel programming): " + (endTime - startTime) + "ms");
    for (BigInteger result : results) {
      System.out.println("Result: " + result);
    }
  }

  private static BigInteger[] calculateFactorialsUsingMultithreading() throws InterruptedException, ExecutionException {
    BigInteger[] results = new BigInteger[NUMBERS.length];
    ExecutorService executorService = Executors.newFixedThreadPool(NUMBERS.length);
    for (int i = 0; i < NUMBERS.length; i++) {
      FactorialTask task = new FactorialTask(NUMBERS[i]);
      Future<BigInteger> result = executorService.submit(task);
      results[i] = result.get();
    }
    executorService.shutdown();
    return results;
  }

  private static BigInteger[] calculateFactorialsUsingParallelProgramming() {
    BigInteger[] results = new BigInteger[NUMBERS.length];
    for (int i = 0; i < NUMBERS.length; i++) {
      BigInteger result = BigInteger.ONE;
      for (int j = 2; j <= NUMBERS[i]; j++) {
        result = result.multiply(BigInteger.valueOf(j));
      }
      results[i] = result;
    }
    return results;
  }

  private static class FactorialTask implements Callable<BigInteger> {
    private int number;

    public FactorialTask(int number) {
      this.number = number;
    }


    @Override
    public BigInteger call() throws Exception {
      BigInteger result = BigInteger.ONE;
      for (int i = 2; i <= number; i++) {
        result = result.multiply(BigInteger.valueOf(i));
      }
      return result;
    }
  }
      
    
  }





