package Junior.SecondCourse.N7_Multithreading.N15_Callable_Future;

import java.util.concurrent.*;

public class RunnableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
//        executorService.execute(factorial);
       Future future = executorService.submit(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(future.get());//null
        System.out.println(future.isDone());//null
        System.out.println(factorialResult);
        //поток должен подождать, иначе результат = 0 сразу выдаст
    }
}

class Factorial implements Runnable{
    int f;

    public Factorial(int f){
        this.f = f;
    }

    @Override
    public void run() {
        if(f<=0){
            System.out.println("Вы ввели не верное число");
            return;
        }
        int result = 1;
        for(int i = 1; i <= f; i++){
            result*=i;
        }
        RunnableFactorial.factorialResult = result;
    }
}
