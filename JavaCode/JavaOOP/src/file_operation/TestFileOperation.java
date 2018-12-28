package file_operation;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileOperation {
    public static void main(String[] args) throws IOException {
        readFileByCharacter("./src/file_operation/files/error.log");
    }
    
    public void renameFileOrDir() {
        File fileDir = new File("./src/file_operation/files");
        boolean isSuccess = fileDir.renameTo(new File("./src/file_operation/file_folder"));
        System.out.print(isSuccess ? "Rename file folder successfully!" : "rename file failed");
    }
    
    public void deleteFileOrDir() {
        File fileDir = new File("./src/file_operation/files/error.log");
        boolean isSuccess = fileDir.delete();
        System.out.print(isSuccess ? "Delete file successfully!" : "delete file failed");
    }
    
    public static void createFileOrDir() throws IOException{
        File fileDir = new File("./src/file_operation/files/");
        fileDir.mkdir();
        File logFile = new File("./src/file_operation/files/error.log");
        Boolean isCreateSuccess = logFile.createNewFile();
        System.out.print(isCreateSuccess ? "Create file successfully!" : "Create file failed");
    }
    
    public static void readFileByCharacter(String filePath) {
        File file = new File(filePath);
        FileReader reader = null;
        try {
            reader = new FileReader(file);
            
            int temp;
            String result = "";
            while ((temp = reader.read()) != -1) {
                result += (char)temp;
            }
            System.out.print(result);
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
