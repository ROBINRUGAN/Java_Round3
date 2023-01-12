import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Function
{
    static Scanner scan = new Scanner(System.in);
    static Connection conn = new MySQLConnection().connection();
    static Student[] student = new Student[1001];//数组存储

    static void insert(Student stu)
    {
        if (stu != null)
        {
            //sql的第一种写法，用字符串拼接，但是有点麻烦qwq
            String sql = "INSERT INTO student\n" +
                    "VALUES ('" + stu.getId() + "','" + stu.getName() + "','" + stu.getSex() + "'," + stu.getClassNumber() + ",'" + stu.getEnterTime() + "')";
            System.out.println(sql);
            try
            {
                Statement s = conn.createStatement();
                s.execute(sql);
            }
            catch (SQLException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
    //这里是学生信息更新/班级信息更新，本程序数据库的主键设置为学号，此外数据更新为单条单项更新
    static void update()
    {
        System.out.println("输入要更新信息的学生学号，以及更新的类型和内容，用回车分隔开");
        System.out.println("例如:");
        System.out.println("052106112");
        System.out.println("classNumber");
        System.out.println("114514");
        String id = scan.nextLine();
        String column = scan.nextLine();
        String data = scan.nextLine();
        //sql的第二种写法，格式化字符串，这样方便多了
        String sql = String.format("UPDATE student SET %s='%s' WHERE id='%s'", column, data, id);
        System.out.println(sql);
        try
        {
            Statement s = conn.createStatement();
            s.execute(sql);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    static void delete()
    {
        String id = scan.nextLine();
        String sql = String.format("DELETE FROM student WHERE id='%s'", id);
        System.out.println(sql);
        try
        {
            Statement s = conn.createStatement();
            s.execute(sql);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
