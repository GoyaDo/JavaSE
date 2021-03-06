package com.goya.thread;

/**
 * @author goya
 * @create 2021-04-21 23:37
 */
public class Bank {

    private final double[] accounts;



    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        for (int i = 0; i < accounts.length; i++) {
            accounts[i] = initialBalance;
        }
    }

    public void transfer(int from, int to, double amount){
        if (accounts[from] < amount) return;
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf(" %10.2f rom %d to %d", amount, from, to);
        accounts[to] += amount;
        System.out.printf("Total Balance: %10.2f%n", getTotalBalance());
    }

    private double getTotalBalance() {
        double sum = 0;
        for (double a : accounts){
            sum += a;
        }
        return sum;
    }
    public int size(){
        return accounts.length;
    }

}
