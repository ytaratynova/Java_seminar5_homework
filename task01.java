//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package seminar05_homework;

public class task01 {

    public static void main(String[] args) {
        TelephoneBook telephoneBook = new TelephoneBook();
        
        telephoneBook.addContact("Ivanova", "8926444444");
        telephoneBook.addContact("Ivanova", "89267778889");
        telephoneBook.addContact("Petrova", "89269999000");
        telephoneBook.addContact("Sidorova", "89260004445");
        telephoneBook.addContact("Sidorova", "89267776644");
        telephoneBook.addContact("Sidorova", "89267776688");
        

        telephoneBook.search("Ivanova");
       
    }
   
  
}
