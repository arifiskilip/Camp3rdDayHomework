public class UserManager {
    public void addComment(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+": bir yorum paylaştı.");
    }
    public void editComment(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+": yorum düzenlendi.");
    }
    public void deleteComment(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+": yorum silindi(kendi).");
    }
    public void login(User user){
        System.out.println("Giriş yapıldı.");
    }
}
