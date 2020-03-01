package com.sbp.ProblemSolving.cocurrent;

public class OddEvenPrintingByMultiThreeading
{
    public void printOddEven(int num)
    {
        OddEvenPrinting oep = new OddEvenPrinting(num);
        oep.odd = true;

        Thread t1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                oep.printOdd();
            }
        });

        Thread t2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                oep.printEven();
            }
        });

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }

//    public void OddEvenByExecutorsService(int num)
//    {
//        OddEvenPrinting oep = new OddEvenPrinting(num);
//        oep.odd = true;
//
//        Thread oddThread = new Thread(EvenOddRunnable("odd", oep));
//
//        Thread t1 = new Thread(new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                oep.printOdd();
//            }
//        });
//
//        Thread t2 = new Thread(new Runnable()
//        {
//            @Override
//            public void run()
//            {
//                oep.printEven();
//            }
//        });
//
//        t1.start();
//        t2.start();
//
//        try
//        {
//            t1.join();
//            t2.join();
//        }
//        catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }
//    }
//
//    private interface EvenOddRunnable extends Runnable
//    {
//        public String name = null;
//        public OddEvenPrinting oep = null;
//
//        public EvenOddRunnable(String name, OddEvenPrinting oep)
//        {
//            this.name = name;
//            this.oep = oep;
//        }
//
//        public void run()
//        {
//            if(this.name.equals("even"))
//            {
//                oep.printEven();
//            }
//            else if(this.name.equals("odd"))
//            {
//                oep.printOdd();
//            }
//        }
//    }
}

