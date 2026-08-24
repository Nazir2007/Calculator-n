/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Numenor;

/**
 *
 * @author spartan
 */
public class Elrond {
    public static void main(String[] args) {
        int n=23597,res=0;
        
        
        while(n>0){
            int j=n%10;
            res=res*10+j;
            n/=10;
        }
        System.out.println(res);
    }

}
