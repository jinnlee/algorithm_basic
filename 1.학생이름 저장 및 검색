import java.util.ArrayList;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Student stu1 = new Student("1", "1f");
    Student stu2 = new Student("2", "2f");
    Student stu3 = new Student("3", "3f");

    ArrayList<Student> sts = new ArrayList<Student>();
    sts.add(stu1);
    sts.add(stu2);
    sts.add(stu3);

    for (Student s : sts) {  
      System.out.println(s.getName());
    }
    Scanner sc = new Scanner(System.in);
    while(true) {
      System.out.println("검색하시려면 y, 종료하실려면 n을 입력해주세요");
      String input = sc.nextLine();
      boolean flag = false;
      
      if("y".equals(input)){
        System.out.println("검색을 시작했습니다. 검색할 이름을 입력해주세요.");
        String name = sc.nextLine();
       
        for(Student s : sts) {
          if(s.getName().equals(name)){
            System.out.println("해당 학생의 학번은 "+s.getNo()+"입니다"); 
            flag = true;
          }
        }
        if(!flag) System.out.println("해당하는 학생 이름이 없습니다."); 
      
      } else if("n".equals(input)) {
        break;
      }
      
    }
  System.out.println("종료되었습니다.");
  }
}

class Student {
  private String name;
  private String no;

  public Student(String no, String name){
    this.no = no;
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getNo() {
    return this.no;
  }
}
