 

/**
 * This class is responsible for keeping the
 * track of students fees, name ,grade & fees
 * paid.
 * https://www.youtube.com/watch?v=e0X00EoFQbE&list=PLXuLP_lLi2eBoYWqukzSuevdKxyFu-ZiT&index=22
 1:24:00
 */
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;


    /**
     * To create a new student by initializing.
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name, int grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    //Not going to alter student's name, student's id.
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Add the fees to the fees paid.
     * @param fees the fees that the student pays.
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);//Updating a static ver in School class
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}



