// Authentication.java
package linkedin;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Authentication {
    private ArrayList<User> alluser= new ArrayList<>();
    private ArrayList<User> currentuser= new ArrayList<>();
    private ArrayList<Post> allpost= new ArrayList<>();


    public void signUp(String email, String password, String firstName, String lastName) {
        for (User user : alluser) {
            if (user.getEmail().equals(email)) {
                System.out.println("Email is already registered. Please sign in.");
                return;
            }
        }
        User user = new User(firstName, lastName, email, password);
        alluser.add(user);
        System.out.println("Sign-up successful for email: " + email);
    }

    public boolean signIn(String email, String password) {
        for (User user : alluser) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Sign-in successful for email: " + email);
                currentuser.add(user);
                return true;
            }
        }
        System.out.println("Sign-in failed. Invalid email or password.");
        return false;
    }
    public void signOut() {
        currentuser.clear();
        System.out.println("Sign-out successful.");
    }

    public User createUser( String firstName, String lastName, String email, String password) {
        return new User( firstName, lastName, email,password);
    }
    public void addpost(String content){
        User current= currentuser.get(0);
        Post newPost = new Post(content, current);
        allpost.add(newPost);

    }
    public void viewmypost(){
        User current= currentuser.get(0);
        List<Post> posts = allpost.stream().filter(post -> post.getAuthor().equals(current)).collect(Collectors.toList());
        for (Post post : posts) {
            System.out.println(post.getContent());
            post.displayComments();
        }

    }
    public void viewallpost(){
        for (Post post : allpost) {
            System.out.println(post.getContent());
            post.displayComments();
        }
    }
}
