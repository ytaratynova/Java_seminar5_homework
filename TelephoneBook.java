package seminar05_homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TelephoneBook {
    private Map<String, List<String>> telBook = new HashMap<>();
        
    void addContact(String name, String phone){
        if (telBook.containsKey(name)){
            telBook.get(name).add(phone);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phone);
            telBook.put(name, phones);
        }
    }


    void search(String name){
        for (Map.Entry<String, List<String>> entry: telBook.entrySet()){
            if (entry.getKey().equals(name)){
                System.out.println(entry);
            }
        }
    }
}
