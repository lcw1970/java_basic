package pratice.file;

public class JsonSaver implements FileSaver{
    @Override
    public void save(String data) {
        System.out.println("JSON 파일로 저장: "+data);
    }
}
