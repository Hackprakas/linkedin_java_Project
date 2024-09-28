// User.java
package linkedin;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class User {
    private int userId;
    private String firstName;
    private String lastName;
    private static String email;
    private static String password;
    private List<Post> posts = new ArrayList<>();
    private List<JobApplication> jobApplications  = new ArrayList<>();
    private List<Message> receivedMessages = new ArrayList<>();
    private List<Message> sentMessages = new ArrayList<>();

    public User( String firstName, String lastName, String emails, String passwords) {
        Random random = new Random();
        this.userId = random.nextInt(1000);
        this.firstName = firstName;
        this.lastName = lastName;
        email = emails;
        password = passwords;
    }

    public void createPost(String content,User s) {
        Post newPost = new Post(content, s);
        posts.add(newPost);
        System.out.println("Post created by " + firstName + ": " + content);
    }

    public void applyForJob(Job job, String coverLetter) {
        JobApplication application = new JobApplication(this, job, coverLetter);
        jobApplications.add(application);
        System.out.println(firstName + " applied for " + job.getTitle() + " at " + job.getCompanyName());
    }

    public void sendMessage(User receiver, String content) {
        Message message = new Message(this, receiver, content);
        sentMessages.add(message);
        receiver.receiveMessage(message);
        System.out.println(firstName + " sent a message to " + receiver.getFullName() + ": " + content);
    }

    public void receiveMessage(Message message) {
        receivedMessages.add(message);
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void displayPosts() {
        for (Post post : posts) {
            System.out.println(post.getContent());
            post.displayComments();
        }
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Getters and Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public static boolean emailExists(String emails) {
        return email.equals(emails);
    }
    public static boolean passwordMatches(String emails, String passwords) {
        return email.equals(emails) && password.equals(passwords);
    }

    public void setEmail(String emails) {
        email = emails;
    }
    public String getPassword() {
        return password;
    }
}
