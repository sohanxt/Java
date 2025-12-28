
package labexam;
class student {
    String name;
    int roll;
    void inputstudent(String n,int r)
    {
        this.name= n;
        this.roll = r;
    }
    void displayinfo()
    {
        System.out.println("Name :"+name + "\nRoll :"+roll);
    }
}

class result extends student{
    int m1,m2,m3;
    void inputmarks(int mark1,int mark2,int mark3)
    {
        this.m1=mark1;
        this.m2=mark2;
        this.m3=mark3;
    }
    void displayaverage()
    {
        double sum = (double)m1+(double)m2+(double)m3;
        double avg = sum/3.0;
        System.out.println("Here Total Average :" + avg);
    }
}
        
public class Labexam {

    public static void main(String[] args) {
       result r1 = new result();
       r1.inputstudent("Sohan",1098);
       r1.displayinfo();
       r1.inputmarks(90,98,78);
       r1.displayaverage();
    }
    
}
