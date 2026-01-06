package com.nhnacademy.File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.nhnacademy.model.Category;
import com.nhnacademy.model.Priority;
import com.nhnacademy.model.Todo;

public class TodoFile {
    private static final String FILENAME = "todos.csv";

    public static void loadFromFile(List<Todo> todos) {
        File file = new File(FILENAME);
        if (!file.exists()) {
            System.out.println("파일이 없습니다. 빈 리스트로 시작합니다.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String title = parts[1];
                int hours = Integer.parseInt(parts[2]);
                Category category = Category.valueOf(parts[3]);
                Priority priority = Priority.valueOf(parts[4]);
                int enumNum = category.ordinal() + 1;     
                int priNum = priority.ordinal() + 1;   
                todos.add(new Todo(id,title, hours, enumNum, priNum));
            }
            System.out.println("파일 로드 완료: " + FILENAME + " (" + todos.size() + "건)");
        } catch (IOException e) {
            System.err.println("파일 로드 실패: " + e.getMessage());
        }catch (NumberFormatException e) {
            System.err.println("파일 형식 오류(숫자 파싱 실패): " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("파일 값 오류: " + e.getMessage());
        }
    }
    

    public static void saveToFile(List<Todo> todos) {
         try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            for (Todo todo : todos) {
                String line = todo.getid() + "," + todo.getTitle() + "," + todo.getHour() + "," + todo.getEnum()+","+todo.getImportance();
                writer.write(line);
                writer.newLine();
            }
            System.out.println("파일 저장 완료: " + FILENAME + " (" + todos.size() + "건)");
        } catch (IOException e) {
            System.err.println("파일 저장 실패: " + e.getMessage());

       }
    }
}
