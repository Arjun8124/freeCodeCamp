package com.company;
import java.util.Random;
import java.util.Scanner;
public class rock_paper_scissor_game {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Random rand=new Random();
        System.out.println("Enter the values:-\n0 for ROCK!\n1 for PAPER!\n2 for SCISSORS!");
        int i=0;
        int j=0;
        int k=0;
        while(i<10){
            int a= read.nextInt();
            int b= rand.nextInt(0,3);
            if(a!=b){
                if(a==0&&b==1){
                    System.out.println("YOU LOSE!");
                    j=j+1;
                }
                else if(a==0&&b==2){
                    System.out.println("YOU WIN");
                    k=k+1;
                }
                else if(a==1&&b==0){
                    System.out.println("YOU WIN");
                    k=k+1;
                }
                else if(a==1&&b==2){
                    System.out.println("YOU LOSE");
                    j=j+1;
                }
                else if(a==2&&b==0){
                    System.out.println("YOU LOSE");
                    j=j+1;
                }
                else{
                    System.out.println("YOU WIN");
                    k=k+1;
                }
            }
            else{
                System.out.println("IT WAS A DRAW!");
            }
            i=i+1;
        }
        if(k>j){
            System.out.println("\nYOU WON FROM THE COMPUTER!\nCONGRATULATIONS!!");
        }
        else if (k==j) {
            System.out.println("\nIT WAS A DRAW!");
        }
        else{
            System.out.println("\nYOU LOST FROM THE COMPUTER\nGIT GOOD NOOB!");
        }
        System.out.println("\n\nTHANK YOU SO MUCH FOR PLAYING!\nMADE BY \'ARJUN GUPTA!\'");
    }
}
