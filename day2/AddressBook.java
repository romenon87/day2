package com.day2;

import java.util.ArrayList;

public class AddressBook {

    ArrayList addressBookEntries = new ArrayList();

    public void addEntry(Contact contact){
        addressBookEntries.add(contact);
    }

    public void deleteEntry(Contact contact){
        addressBookEntries.remove(contact);
    }
}
