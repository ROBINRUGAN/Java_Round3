import java.util.Scanner;

public class Menu
{
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        while (true)
        {
            System.out.println("欢迎来到MEWWWの学籍管理系统！！");
            System.out.println("1.新增学生信息");
            System.out.println("2.学生信息更新");
            System.out.println("3.删除学生");
            System.out.println("4.退出");
            System.out.println("输入选项前的数字并回车:).....");
            String choice = scan.nextLine();
            //新增学生信息
            if (choice.equals("1"))
            {
                System.out.println("请输入学生信息(学号，姓名，性别，班级编号)，中间用回车分开，格式为：");
                System.out.println("052106112");
                System.out.println("林黄骁");
                System.out.println("男");
                System.out.println("101");
                String id = scan.nextLine();
                String name = scan.nextLine();
                String sex = scan.nextLine();
                int classNumber = Integer.parseInt(scan.nextLine());
                Student stu = new Student(id, name, sex, classNumber);
                Function.insert(stu);
            }
            //这里是学生信息更新/班级信息更新，本程序数据库的主键设置为学号，此外数据更新为单条单项更新
            if (choice.equals("2"))
            {
                System.out.println("输入要更新信息的学生学号，以及更新的类型和内容，用回车分隔开");
                System.out.println("例如:");
                System.out.println("052106112");
                System.out.println("classNumber");
                System.out.println("114514");
                Function.update();
            }
            if (choice.equals("3"))
            {
                System.out.println("输入要删除学生信息的学号");
                Function.delete();
            }
            if (choice.equals("4"))
            {
                System.out.println("再见ヾ(≧▽≦*)o");
                return;
            }
        }
    }
}