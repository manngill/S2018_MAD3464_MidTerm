/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0738175_midterm_mad3464;


/**
 *
 * @author macstudent
 */
public class Reverse {
    
   String input = "Lambton";
        char[] temp = input.toCharArray();
        int i = 0 , j =0;
        int j = temp.length-1;
        
    for (i=0; i < j ; i++ ;j--)
        {
            
            char t = temp[i];
            temp[i] = temp[j];
            temp[j]=t;
        }
 
       
    
}
