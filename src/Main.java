public class Main {

    public static void main(String[] args) {
        //Yazar için,
        Instructor instructor = new Instructor();
        instructor.setAdminId("engin");
        instructor.setAdminPassword("123123");
        instructor.setId(1);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setEmail("kodlamaio@gmail.com");
        instructor.setGender("Erkek");

        InstructorManager instructorManager = new InstructorManager(); // nesne türettik.

        instructorManager.login(instructor);
        instructorManager.deleteCommentAdmin(new Student());
        instructorManager.addComment(instructor);
        instructorManager.deleteComment(instructor);
        instructorManager.uploadLesson();
        instructorManager.deleteLesson();
        instructorManager.uploadHomework();
        instructorManager.deleteHomework();
        instructorManager.editComment(instructor);

        //öğrenci için,
        Student student = new Student();
        student.setStudentId("Arif");
        student.setStudentPassword("290388");
        student.setId(2);
        student.setFirstName("Arif");
        student.setLastName("İskilip");
        student.setEmail("arifiskilip@icloud.com");
        student.setGender("Erkek");

        StudentManager studentManager = new StudentManager(); // nesne türettik.

        studentManager.login(student);
        studentManager.addComment(student);
        studentManager.deleteComment(student);
        studentManager.editComment(student);
        studentManager.rollCall(student); // yoklama
    }
}
