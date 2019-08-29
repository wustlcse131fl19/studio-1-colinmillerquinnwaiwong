package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("What's the first of the two integers?");
        int n2 = ap.nextInt("What's the second of the two integers?");
        System.out.println("The average of the two integers is " + (double)(n1+n2)/2 + ".");
    }
}
