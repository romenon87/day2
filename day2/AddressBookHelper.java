package com.day2;

public class AddressBookHelper {

    public static void main(String[] args){
        Contact c1 = new Contact("Rohit", "12345","Bangalore");
        Contact c2 = new Contact("Daksh", "78906","Mumbai");
        AddressBook addrBook = new AddressBook();
        addrBook.addEntry(c1);
        addrBook.addEntry(c2);

        for(Object obj : addrBook.addressBookEntries){
            Contact c = (Contact) obj;
            System.out.println("Entry: Name: "+c.name+" Phone: "+c.phone+" Address: "+c.address);
        }

        addrBook.deleteEntry(c2);
        System.out.println("After entry deletion..");
        for(Object obj : addrBook.addressBookEntries){
            Contact c = (Contact) obj;
            System.out.println("Entry: Name: "+c.name+" Phone: "+c.phone+" Address: "+c.address);
        }

    }
}
