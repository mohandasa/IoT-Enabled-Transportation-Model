/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validator;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author anita
 */
public class Validators1 {
    
 private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    public static boolean isValidString(String str) {
		// check if string is not null and not blank 
		return (str != null && !str.trim().isEmpty());
	}
	
	public static boolean isValidInteger(String str) {
		// check if string is not null and not blank 
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
	public static boolean isValidFloat(String str){
       try{
           Float.parseFloat(str);
             return true;
        }
          catch(NumberFormatException nfe) {
			return false;
           
        }        
        
}
        public static boolean isValidLong(String str){
       try{
           Long.parseLong(str);
             return true;
        }
          catch(NumberFormatException nfe) {
			return false;
           
        }      
        }
        
    public static void main( String[] args ){
    
        java.util.Date date= new java.util.Date();
        System.out.println(new Timestamp(date.getTime()));
    }
    
    public static boolean isValidDate(String str) {
		try {
			DATE_FORMAT.setLenient(false);
			DATE_FORMAT.parse(str);
			return true;
		} catch (ParseException e) {
			return false;
		}
        
        }
    
     public static boolean isValidZipCode(String str){
            if (str.length()==4)
            {
                return true;
                
        }

            else {
                return false;
            }
        }
        public static boolean isValidPhoneNumber(String str) {
		
                    if (str.length()==10)
                    {
			
			return true;
                    }
		 else {
			return false;
		}
        }
                    
     public static boolean isValidAreaCode(String str){
            if (str.length()==3)
            {
                return true;
                
        }

            else {
                return false;
            }
        }
         
        
      
    
    
}

