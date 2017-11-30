/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Contact;

import Business.Train.Train;
import java.util.ArrayList;

/**
 *
 * @author anita
 */
public class FeedbackDirectory {
    
    ArrayList<Feedback>contactList;

    public FeedbackDirectory() {
        contactList=new ArrayList<>();
    }

    public ArrayList<Feedback> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Feedback> contactList) {
        this.contactList = contactList;
    }

    
    
     public Feedback addContact(Feedback c)
    {
       
        contactList.add(c);
        return c;
    }
    
    
    
    public void removeContact(Feedback c)
    {
        contactList.remove(c);
    }
    
}
