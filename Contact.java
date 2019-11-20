package com.example.contactv1;
import java.io.Serializable;

public class Contact implements Serializable {
    private int id;
    private String contactName;
    private String phoneNumber;
    public Contact()
    {
        super();
    }
    public Contact( String contactName, String phoneNumber)
    {
        super();
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
    }
    public int getID()
    {

        return this.id;
    }
    public void setId(int id)
    {

        this.id=id;
    }

    public String getContactName()
    {
        return contactName;
    }
    public void setContactName(String contactName)
    {
        this.contactName = contactName;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
}