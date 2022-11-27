import AnimationCompany.AnimationCompany;
import AnimationCompany.Animator;
import AnimationCompany.Producer;
import AnimationCompany.Screenwriter;
import ITcompany.Employee.*;
import  AnimationCompany.Employee2 ;
public class Main {
    public static void main(String[] args) {
        // айти компания
        Manager manager = new Manager("Isa", "manager", 12000, new String[]{"project1", "project2"});
        Developer developer = new Developer("Azamat", "developer", 60000, new String[]{"JVA", "C",
                "Python", "JavaScript "});
        Tester tester = new Tester("Emir", "tester", 50000, "JAVA");
        Employee[] employees = {manager, developer, tester};
        ITCompany itCompany = new ITCompany(employees, "IT-academy", 120000, "Askat",
                12300, 32000, 34000, 9000, 780);
        //----------------
        //аниматционная компания
        Animator animator =new Animator("Nursultan","animator",32000,new String[]{"face","landscape"});
        Producer producer = new Producer("Munzir","producer",35000,new String[]{"cards","toys"});
        Screenwriter screenwriter =new Screenwriter("muslim","screenwriter",7800,new String[]{"dorama",
        "comedy"});
        Employee2[] employee2 = {animator,producer,screenwriter };
         AnimationCompany animationCompany = new AnimationCompany(employee2 ,"animationCompany",
                 15000,"Argen",1000,250000,3400,
                 6000,2300,500);
    }

}

