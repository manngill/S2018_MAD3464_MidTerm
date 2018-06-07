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
    public Reverse()
    {
        
    }
  public String reverse(String s)
  {
   char r[] = s.toCharArray();
   
   for (int i = r.length -1;i>=0;i++)
   {
       System.out.println(r[i]);
   }
  return null;
  }
  }
