package pratice.file;

public abstract class FileOption {
    public static FileSaver optionSelect(String option){
        FileSaver fileSaver;
        if (option.equals("txt")){
            return fileSaver = new TxtSaver();
        }else if (option.equals("csv")){
            return fileSaver = new CsvSaver();
        }else if (option.equals("Json")){
            return fileSaver = new JsonSaver();
        }
        else {
            return fileSaver = new DefaultSaver();
        }
    }
}
