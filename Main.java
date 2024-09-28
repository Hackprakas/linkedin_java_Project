// LinkedInApp.java
package linkedin;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Authentication auth = new Authentication();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to LinkedIn!");
        while(true){

            System.out.println("1 for Sign Up and 2 for Sign In and 3 for Sign Out and 4 for Exit and 5 for displaying all posts");    
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                // System.out.println("Sign Up");
                System.out.println("Enter email: ");
                String email = scanner.next();
                System.out.println("Enter password: ");
                String password = scanner.next();
                System.out.println("Enter first name: ");
                String firstName = scanner.next();
                System.out.println("Enter last name: ");
                String lastName = scanner.next();
                
                auth.signUp(email, password,firstName, lastName);
                break;
                case 2:
                System.out.println("\nSign In");
                System.out.println("Enter email: ");
                String signInEmail = scanner.next();
                System.out.println("Enter password: ");
                String signInPassword = scanner.next();
                auth.signIn(signInEmail, signInPassword);
                break;
                case 3:
                auth.signOut();
                break;
                case 4:
                System.exit(0);
                break;
                case 5:
                auth.viewallpost();
                break;
                case 6:
                auth.addpost("Hello");
                break;
                case 7:
                auth.viewmypost();
                default:
                System.out.println("Invalid Choice");
            }
            
            // Sign-up and Sign-in process
        }
        //     System.out.println("Sign Up");
        //     System.out.print("Enter email: ");
        // String email = scanner.nextLine();
        // System.out.print("Enter password: ");
        // String password = scanner.nextLine();
        // System.out.print("Enter first name: ");
        // String firstName = scanner.nextLine();
        // System.out.print("Enter last name: ");
        // String lastName = scanner.nextLine();

        // auth.signUp(firstName,lastName,email, password);

        // System.out.println("\nSign In");
        // System.out.print("Enter email: ");
        // String signInEmail = scanner.nextLine();
        // System.out.print("Enter password: ");
        // String signInPassword = scanner.nextLine();

        // if (auth.signIn(signInEmail, signInPassword)) {
        //     // Create a user and start interacting with the app
        //     User user1 = auth.createUser(1, "Prakash", "T R", signInEmail,"123");
        //     User user2 = new User(2, "Jane", "Smith", "jane.smith@example.com","123");

        //     // Creating posts
        //     user1.createPost("Excited to start my new job!");
        //     user2.createPost("Looking forward to the weekend!");

        //     // Adding comments to posts
        //     user1.getPosts().get(0).addComment(user2, "Congratulations!");
        //     user2.getPosts().get(0).addComment(user1, "Enjoy!");

        //     // Displaying posts and comments
        //     System.out.println(user1.getFullName() + "'s Posts:");
        //     user1.displayPosts();

        //     System.out.println(user2.getFullName() + "'s Posts:");
        //     user2.displayPosts();

        //     // Job and JobApplication
        //     Job job = new Job("Tech Corp", "Software Engineer", "Develop and maintain software applications.");
        //     user1.applyForJob(job, "I am very interested in this position.");

        //     // Sending messages
        //     user1.sendMessage(user2, "Hi Jane, how are you?");
        //     user2.sendMessage(user1, "I'm good, thanks! How about you?");
        // }

        // scanner.close();1
    }
}
