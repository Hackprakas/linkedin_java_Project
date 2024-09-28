// Post.java
package linkedin;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Post {
    private String postid;
    private String content;
    private User author;
    private List<Comment> comments;

    public Post(String content, User author) {
        Random random = new Random();
        this.postid = String.valueOf(random.nextInt(100));
        this.content = content;
        this.author = author;
        this.comments = new ArrayList<>();
    }

    public void addComment(User user, String content) {
        Comment comment = new Comment(user, content);
        comments.add(comment);
        System.out.println("Comment added by " + user.getFullName() + ": " + content);
    }

    public void displayComments() {
        for (Comment comment : comments) {
            System.out.println("  Comment: " + comment.getContent() + " by " + comment.getUser().getFullName());
        }
    }
    

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
    
}

class Comment {
    private User user;
    private String content;

    public Comment(User user, String content) {
        this.user = user;
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class Job {
    private String companyName;
    private String title;
    private String description;

    public Job(String companyName, String title, String description) {
        this.companyName = companyName;
        this.title = title;
        this.description = description;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

class JobApplication {
    private User applicant;
    private Job job;
    private String coverLetter;

    public JobApplication(User applicant, Job job, String coverLetter) {
        this.applicant = applicant;
        this.job = job;
        this.coverLetter = coverLetter;
    }

    public User getApplicant() {
        return applicant;
    }

    public void setApplicant(User applicant) {
        this.applicant = applicant;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }
}

class Message {
    private User sender;
    private User receiver;
    private String content;

    public Message(User sender, User receiver, String content) {
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
