/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package valinor;

import java.util.Scanner;


/**
 *
 * @author spartan
 */
public class FirstLecture {

    public static void main(String[] args) {
        System.out.println("Enter the nTH fibanocci ");
        Scanner inp =new Scanner(System.in);
        int b=inp.nextInt();
        int p=0,n=1;
        int count=2;

        if(b==1){
             System.out.println(p);
        }
        else if(b==2){
            System.out.println(n);
        }
        else{
            while(count<=b){
            int temp=n;
            n+=p;
            p=temp;
            count++;
            }
           System.out.println(n);
        }
           
        
    }
}
