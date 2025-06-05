package pratice.file;

public class FileService {
    public void saveFile(String option,String data){
        FileSaver fileSaver;
        fileSaver = FileOption.optionSelect(option);
        fileSaver.save(data);
    }
}
