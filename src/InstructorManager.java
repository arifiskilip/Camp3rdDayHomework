public class InstructorManager extends UserManager{
    public void deleteCommentAdmin(Student student)
    {
        System.out.println(student.getFirstName()+" adlı öğrencinin yorumu silindi.");
    }
    public void  uploadLesson()
    {
        System.out.println("Ders yüklendi.");
    }
    public void deleteLesson()
    {
        System.out.println("Ders silindi.");
    }
    public void uploadHomework()
    {
        System.out.println("Ödev yüklendi.");
    }
    public void deleteHomework()
    {
        System.out.println("Ödev silindi.");
    }
}
