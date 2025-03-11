package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {

    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        ArrayList<Student> changedArr = new ArrayList<Student>();
        Student firststudent = new Student("Joe", "Biden", 1);
        int removeIdx = 0;

        boolean equalFirst = false; 
        boolean equalLast = false;

        while(list.size() > 0){ 
            firststudent = new Student("ZZZZZZZZZZZ", "ZZZZZZZZZZZZ", 1); 
            removeIdx = 0;
            for (int j = 0; j < list.size(); j++){

                equalFirst = false; 
                equalLast = false;

                if (firststudent.getLastName().compareTo(list.get(j).getLastName()) >= 0){ 
                 if (firststudent.getLastName().equals(list.get(j).getLastName())){ 
                    equalLast = true; 
                    if (firststudent.getGpa() == list.get(j).getGpa() && firststudent.getGpa() > list.get(j).getGpa()){ 
                     equalFirst = true;
                      if (firststudent.getGpa() > list.get(j).getGpa()){
                            firststudent = list.get(j); //if 
                            removeIdx = j;
                            }
                        }
                        if (!equalFirst){ 
                            if (firststudent.getFirstName().compareTo(list.get(j).getFirstName()) >= 0){
                            firststudent = list.get(j);
                            removeIdx = j; 
                            }
                        }
                    }
                    if (!equalFirst && !equalLast){ 
                        firststudent = list.get(j);
                        removeIdx = j; 
                    }
                }
            }
            changedArr.add(firststudent);
            list.remove(removeIdx);
        }
        return changedArr;
    }
}
    


