// Пусть дан список сотрудников: Иван Иванов, Светлана Петрова, Кристина Белова, 
// Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, 
// Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, 
// Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности. Для сортировки использовать TreeMap.

package seminar05_homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class task02 {

    public static void main(String[] args) {
        String employees = "Иван Иванов, Светлана Петрова, Кристина Белова,\n"
                           +"Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков,\n"
                           +"Павел Чернов, Петр Чернышов, Мария Федорова,\n"
                           +"Марина Светлова, Мария Савина, Мария Рыкова,\n"
                           +"Марина Лугова, Анна Владимирова, Иван Мечников,\n"
                           +"Петр Петин, Иван Ежов\n";
        String[] empList = employees.replace(", ", ",").replace("\n", "").split(",");       
        
         Map<Integer, List<String>> empMap = new TreeMap<>(Collections.reverseOrder());

        for(int i = 0; i < empList.length; i++){
            int count = 0;
            for(int j = 0; j < empList.length; j++){
               if (empList[i].split(" ")[0].equals(empList[j].split(" ")[0])){
                count++;
               }
            
            }
            
            if (empMap.containsKey(count)){
                List<String>  names = empMap.get(count);
                if (!names.contains(empList[i].split(" ")[0])){
                    names.add(empList[i].split(" ")[0]);
                }
            } else {
                List<String> names = new ArrayList<>();
                names.add(empList[i].split(" ")[0]);
                empMap.put(count, names);
            }
        }
        System.out.println(empMap);

    }        
    
}
