package pratice.file;

public class CsvSaver implements FileSaver{
    @Override
    public void save(String data) {
        System.out.println("CSV 파일로 저장: "+data);
    }
}
