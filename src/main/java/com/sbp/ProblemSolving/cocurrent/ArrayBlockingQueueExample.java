package com.sbp.ProblemSolving.cocurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ArrayBlockingQueueExample
{
    public void Example() throws InterruptedException
    {
        BlockingQueue queue = new ArrayBlockingQueue(1024);

        Producer producer1 = new Producer(queue);
        Producer producer2 = new Producer(queue);

        Consumer consumer = new Consumer(queue);

        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(consumer).start();

        Thread.sleep(4000);

//      MyThread mt = new MyThread();
//      new Thread(mt).start();

    }

    public class MyThread implements Runnable
    {
        public void run()
        {
            System.out.println("1.1 MyThread");

            try
            {
                BlockingQueue queue = new ArrayBlockingQueue(1024);

                Producer producer1 = new Producer(queue);
                Producer producer2 = new Producer(queue);

                Consumer consumer = new Consumer(queue);


                new Thread(producer1).start();
                new Thread(producer2).start();
                new Thread(consumer).start();

                Thread.sleep(4000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            System.out.println("1.2 MyThread");
        }
    }

    private class Producer implements Runnable
    {
        protected BlockingQueue queue = null;

        public Producer(BlockingQueue queue)
        {
            this.queue = queue;
        }

        public void run()
        {
            try
            {
                System.out.println("Producing: 1");
                Thread.sleep(1000);

                System.out.println("Producing: 2");
                queue.put("2");
                Thread.sleep(1000);

                System.out.println("Producing: 3");
                queue.put("3");

            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    private class Consumer implements Runnable
    {
        protected BlockingQueue queue = null;

        public Consumer(BlockingQueue queue)
        {
            this.queue = queue;
        }

        public void run()
        {
            try
            {
                System.out.println("Consuming: "+ queue.take());
                System.out.println("Consuming: "+ queue.take());
                System.out.println("Consuming: "+ queue.take());
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
