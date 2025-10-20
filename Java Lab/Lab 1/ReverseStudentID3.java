public class ReverseStudentID3 {
     public static void main(String[] args) {
        long studentID = 2241081098L;

        int lastThree = (int)(studentID % 1000);
        
        int d1 = lastThree % 10;
        int d2 = (lastThree / 10) % 10;
        int d3 = (lastThree / 100) % 10;

        System.out.println("Reversed last three digits: " + d1 + ", " + d2 + ", " + d3);
    }
    
}
