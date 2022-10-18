package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class BankProgramV1 {
    private HashMap<Integer,Integer> accounts = new HashMap<>();
    private double rate = 0.01;
    private int nextacct = 0;
    private  int current = -1 ;
    private Scanner scanner;
    private  boolean done = false;
    public void run(){
        scanner = new Scanner(System.in);
        while(!done){
            System.out.print("Enter command (0=quit, 1=new, 2=select, 3=deposit, 4=loan, 5=show,6=interest): ");
            int cmd = scanner.nextInt();
            processCommand(cmd);
            
        }
        scanner.close();
    }

    private void processCommand(int cmd) {
        if (cmd== 0) quit();
        else if (cmd ==1) newAccount();
        else if (cmd== 2)
    }

}
