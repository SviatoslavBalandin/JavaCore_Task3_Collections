package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {

    private Map<String, String> phonebook_Map;

    public Phonebook () {
        this.phonebook_Map = new HashMap<>();
    }

    public void add(String phoneNumber, String surname) {
        //put data inside
        phonebook_Map.put(phoneNumber, surname);
    }

    public List<String> get(String surname) {
        List<String > list = new ArrayList<>();
        if(phonebook_Map.containsValue(surname)) {
            list.add(surname);
            for (Map.Entry<String, String> entry : phonebook_Map.entrySet()) {
                String k = entry.getKey();
                String v = entry.getValue();
                if (v.equals(surname)) list.add(k);
            }
        }
        return list;
    }
}
