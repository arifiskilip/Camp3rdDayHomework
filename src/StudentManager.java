public class StudentManager extends UserManager{
    public void rollCall(Student student)
    {
        System.out.println(student.getFirstName()+": yoklamanız alındı.");
    }
}
