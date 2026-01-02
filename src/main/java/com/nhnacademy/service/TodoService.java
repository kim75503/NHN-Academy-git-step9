package com.nhnacademy.service;

import java.util.ArrayList;

import com.nhnacademy.exception.TodoNotFoundException;
import com.nhnacademy.model.Category;
import com.nhnacademy.model.Priority;
import com.nhnacademy.model.Todo;

public class TodoService {
    

    public void NameSort(ArrayList<Todo> todo){
        ArrayList <Todo> Eunmtodo = new ArrayList<>();
            for(Todo t : todo){
                if(t.getEnum() == Category.WORK){
                    Eunmtodo.add(t);
                }
            }
            for(Todo t : todo){
                if(t.getEnum() == Category.STUDY){
                    Eunmtodo.add(t);
                }
            }
            for(Todo t : todo){
                if(t.getEnum() == Category.PERSONAL){
                    Eunmtodo.add(t);
                }
            }
            for(Todo t : todo){
                if(t.getEnum() == Category.HEALTH){
                    Eunmtodo.add(t);
                }
            }
            for(Todo t : todo){
                if(t.getEnum() == Category.OTHER){
                    Eunmtodo.add(t);
                }
            }
            System.out.println("\n");
            for(Todo t : Eunmtodo){
                System.out.println("["+ t.getCountid() +"] " + t.getTitle() + " | " + t.getHour() +"시간 | " + t.getEnum() +" | " + t.getImportance() +" | [ ]" );
            }
            System.out.println("\n");
    }    

     public void ImportanceSort(ArrayList<Todo> todo){
        ArrayList <Todo> Importancetodo = new ArrayList<>();
            for(Todo t : todo){
                if(t.getImportance() == Priority.LOW){
                    Importancetodo.add(t);
                }
            }
            for(Todo t : todo){
                if(t.getImportance() == Priority.MEDIUM){
                    Importancetodo.add(t);
                }
            }
            for(Todo t : todo){
                if(t.getImportance() == Priority.HIGH){
                    Importancetodo.add(t);
                }
            }
    
            System.out.println("\n");
            for(Todo t : Importancetodo){
                System.out.println("["+ t.getCountid() +"] " + t.getTitle() + " | " + t.getHour() +"시간 | " + t.getEnum() +" | " + t.getImportance() +" | [ ]" );
            }
            System.out.println("\n");
    }    

    public boolean titleOverlap(ArrayList<Todo> todo, String title){
        for(Todo t : todo){
            if(t.getTitle().equals(title)){
                System.out.println("동일한 제목의 일정이 이미 존재합니다.\n");
                return true;
            }
        }
        return false;
    }
    public boolean isValidIndex(ArrayList<Todo> todo, int id) {
        int idx = id - 1;
        return idx >= 0 && idx < todo.size();
    }


        public Todo findById(ArrayList<Todo> todos, int id) {
            int index = id - 1;
            if (index < 0 || index >= todos.size()) {
                throw new TodoNotFoundException(id);
            }
            return todos.get(index);
        }

        public void deleteById(ArrayList<Todo> todos, int id) {
            int index = id - 1;
            if (index < 0 || index >= todos.size()) {
                throw new TodoNotFoundException(id);
            }
            todos.remove(index);
        }

}

