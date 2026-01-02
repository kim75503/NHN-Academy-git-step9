package com.nhnacademy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import com.nhnacademy.exception.TodoNotFoundException;
import com.nhnacademy.model.Todo;
import com.nhnacademy.service.TodoService;


public class Main 
{

    static String MAIN = """
        === TODO 앱 ===
        1. 등록
        2. 조회
        3. 수정
        4. 삭제
        0. 종료
        """;

    static String VIEW = """
        === 조회 메뉴 ===
        1. 전체 조회
        2. 구분별 조회
        3. 중요도별 조회
        0. 이전 
            """;

    public static void main( String[] args ) throws IOException
    {
        TodoService service = new TodoService();
        ArrayList<Todo> todo = new ArrayList<>();
        boolean Run = true;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int Msel, Vsel, hour, Enum, importance, selSetid,setHour,selDelid;
        String title, setTitle;

        
        

        
        while(Run){
            System.out.print(MAIN);
            System.out.print("선택 > ");
            Msel = Integer.parseInt(reader.readLine());
        switch(Msel){
            case 1 :{
                
                System.out.println("\n=== TODO 등록 ===");
                System.out.print("제목 > ");
                title = reader.readLine();
                if(service.titleOverlap(todo, title)){
                    break;
                }

                System.out.print("예상 시간 > ");
                hour = Integer.parseInt(reader.readLine());
                System.out.print("구분 (1:WORK, 2:STUDY, 3:PERSONAL, 4:HEALTH, 5:OTHER) > ");
                Enum = Integer.parseInt(reader.readLine());
                System.out.print("중요도 (1:LOW, 2:MEDIUM, 3:HIGH) > ");
                importance = Integer.parseInt(reader.readLine());
                try {
                        todo.add(new Todo(title, hour, Enum, importance));
                        System.out.println("등록 완료!\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("입력값이 올바르지 않습니다: " + e.getMessage() + "\n");
                    }
                break;
            } 
            case 2 :{
                System.out.print("\n"+VIEW);
                System.out.print("선택 > ");
                Vsel = Integer.parseInt(reader.readLine());

                if (Vsel == 0) {
                        System.out.println();
                        break;
                    }

                    if (todo.isEmpty()) {
                        System.out.println("등록된 TODO가 없습니다.\n");
                        break;
                    }
                
                if(Vsel == 1 ){
                    System.out.println("\n=== TODO 목록 ===");
                    for(Todo t : todo){
                        System.out.println("["+ t.getCountid() +"] " + t.getTitle() + " | " + t.getHour() +"시간 | " + t.getEnum() +" | " + t.getImportance() +" | [ ]" );
                    }
                    System.out.println();
                }else if (Vsel == 2){
                    //구분별 조회
                    service.NameSort(todo);System.out.println();
                }else if(Vsel == 3){
                    //중요도별 조회
                    service.ImportanceSort(todo);System.out.println();
                    
                }else
                    System.out.println("올바르지않은 선택입니다.");

                break;
            }
            case 3 :{
                if (todo.isEmpty()) {
                   System.out.println("TODO가 없습니다.");
                    break;
                }

                try{
                System.out.print("\n수정할 TODO ID > ");
                selSetid = Integer.parseInt(reader.readLine());

                System.out.print("새 제목 > ");
                setTitle = reader.readLine();
                todo.get(selSetid -1).setTitle(setTitle);
                System.out.print("새 예상 시간 > ");
                setHour = Integer.parseInt(reader.readLine());
                todo.get(selSetid -1).sethour(setHour);
                System.out.println("수정 완료!");       
                }catch( TodoNotFoundException e) {
                        System.out.println(e.getMessage() + "\n");
                    }
                break;        
            }
            case 4 :{
                if (todo.isEmpty()) {
                   System.out.println("TODO가 없습니다.");
                    break;
                }
                try{
                System.out.print("\n삭제할 TODO ID > ");
                selDelid = Integer.parseInt(reader.readLine());
                todo.remove(selDelid-1);
                System.out.println("삭제 완료!"); 
                }catch(TodoNotFoundException e) {
                        System.out.println(e.getMessage() + "\n");
                    }
                
                System.out.println();
                break;  
            }
            case 0 :{
                System.out.println("프로그램을 종료합니다.");   
                Run = false;
                break;
            }
            default:
                System.out.println("올바르지 않은 선택입니다.");

        }
            
        }
    }
}
