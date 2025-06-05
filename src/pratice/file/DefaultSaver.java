package pratice.file;

public class DefaultSaver implements FileSaver{
    @Override
    public void save(String data) {
        System.out.println("올바른 파일 형식이 아닙니다.");
    }
}
