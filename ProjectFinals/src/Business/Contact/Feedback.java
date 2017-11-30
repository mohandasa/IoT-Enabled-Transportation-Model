/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Contact;

/**
 *
 * @author anita
 */
public class Feedback {
      private long phNos;
      private String pName;
      private String email;
      private String message;

    public long getPhNos() {
        return phNos;
    }

    public void setPhNos(long phNos) {
        this.phNos = phNos;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
      
    
}
