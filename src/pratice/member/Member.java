package pratice.member;

public class Member {
    private String id;
    private String name;
    private String grade;

    public Member(String id,String name,String grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
