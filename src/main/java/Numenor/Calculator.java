/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Numenor;

import java.util.Scanner;

/**
 *
 * @author spartan
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int res=0;
        boolean cond=false,cond1=false;


        while(true){
            System.out.print("choose the operator:");
            char op=in.next().trim().charAt(0);
            
            if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                System.out.println("Enter the first and second number");
                int n1=in.nextInt();
                int n2=in.nextInt();

                if(op=='+'){
                    System.out.println("hey it's happend");
                    res=n1+n2;
                }
                else if(op=='-'){
                    res=n1-n2;
                }
                else if(op=='*'){
                    res=n1*n2;
                }
                else if(op=='/'){
                    if(n1!=0 && n2!=0){
                        while(cond==false){
                            System.out.print(n1+" or "+n2+" wich one is dividing?");
                            int cho =in.nextInt();
                        
                            if(cho==n1){
                            res=n1/n2;
                            cond=true;
                            }  
                            else if(cho==n2){
                            res=n2/n1;
                            cond=true;
                            }
                            else {
                            System.out.println("please choose right");
                            } 
                        }

                        
                    }
                    else{
                        System.out.println("Syntax Error");
                    }

                }
                else if(op=='%'){

                    while(cond1==false){

                        System.out.println(n1+" or "+n2+" Which one is getting modded?");
                        int cho =in.nextInt();
                    
                        if(cho==n1){
                            res=n1%n2;
                            cond1=true;
                        }
                        else if (cho==n2){
                            res=n2%n1;
                            cond1=true;
                        }
                        else{
                            System.out.println("please choose right");
                        }
                    }
                    
                }
                
            }
            else if (op=='x' || op=='X'){
                break;
            }
            
        }
        System.out.println("Answer is: "+res);
    }

}
