import java.util.Date;
import java.sql.Timestamp;

public class Student
{
    private String id;//学号
    private String name;//姓名
    private String sex;//性别
    private int classNumber;//班级编号
    private Timestamp enterTime;//进入班级时间

    //学生类
    public Student(String id, String name, String sex, int classNumber)
    {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.classNumber = classNumber;
        enterTime = new Timestamp(new Date().getTime());
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getSex()
    {
        return sex;
    }

    public int getClassNumber()
    {
        return classNumber;
    }

    public Timestamp getEnterTime()
    {
        return enterTime;
    }
}
