package pratice.file;

public class TxtSaver implements FileSaver{
    @Override
    public void save(String data) {
        System.out.println("TXT파일로 저장: "+data);
    }
}
