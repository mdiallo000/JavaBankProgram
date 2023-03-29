package com.company;

public interface BankProgramV5 {
//     this time i will use the public absract keyword but eventually they will be omitted in further versions of the program
//     abstract keyword means that the logic will not be included in this interface, instead it will be provided by any class that tries to implement it
        public abstract int getAccNumber();
        public abstract  int getBalance();
        public  abstract  boolean isForeign();
        public  abstract  void  setForeign(boolean isForeign);
        public abstract  void deposit(int amt);
        public abstract  boolean hasEnoughColleteral(int amt);
        public  abstract  String to_String();








}
