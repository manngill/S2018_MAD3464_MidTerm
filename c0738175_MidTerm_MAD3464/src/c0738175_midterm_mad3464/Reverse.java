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

    public Reverse()
    {
        
    }
    char[] temp = input.toCharArray();
        int i = 0 , j =0;
        int j = temp.length-1;
        

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public char[] getTemp() {
        return temp;
    }

    public void setTemp(char[] temp) {
        this.temp = temp;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
       
                
               
                
        
    for (i=0; i < j ; i++ )
        {
            
            char t = temp[i];
            temp[i] = temp[j];
            temp[j]=t;
        }
 
        public void display()
        {
            System.out.println();
        }
       
    
}
