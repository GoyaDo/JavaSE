package com.goya.thread;

/**
 * @author goya
 * @create 2021-04-21 23:39
 */
public class TransferRunnable implements Runnable{

    private  Bank bank;
    private  int fromAccount;
    private double maxAmount;
    private int DELAY = 10;

    public TransferRunnable(Bank b, int from, double initialBalance) {
        bank = b;
        fromAccount = from;
        maxAmount = initialBalance;
    }

    @Override
    public void run() {
        while (true){
            int toAccount = (int) (bank.size() * Math.random());
            double amount = maxAmount * Math.random();
            bank.transfer(fromAccount,toAccount,amount);
            try {
                Thread.sleep((int) (DELAY * Math.random()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
