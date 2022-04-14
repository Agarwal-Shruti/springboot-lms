package lms.co;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import lms.co.model.Book;
import lms.co.model.User;
import lms.co.repository.BookRepository;
import lms.co.repository.UsersRepository;

@ComponentScan
@EnableAutoConfiguration
public class LMSApplication
{
    @Autowired
    private BookRepository booksRepo;
    
    @Autowired
    private UsersRepository usersRepo;


    public static void main( String[] args ){
        SpringApplication.run(LMSApplication.class, args);

    }

    @PostConstruct
    public void initApplication() throws IOException {
        booksRepo.addBook(new Book("111-1","Let us C","Deepti Verma","pbs publisher","Avilable","none","none","none"));
        booksRepo.addBook(new Book("111-2","Gita","Lord Krishna","Kbs publisher","Avilable","none","none","none"));
        booksRepo.addBook(new Book("111-3","Ramayan","Tulsi das","pbs publisher","Avilable","none","none","none"));

        usersRepo.addUser(new User("111-1","Shruti","Kanpur","none","none","none","none","none","none"));
        usersRepo.addUser(new User("111-2","Ketan","Pune","none","none","none","none","none","none"));
        usersRepo.addUser(new User("111-3","Shrikant","Pune","none","none","none","none","none","none"));
        usersRepo.addUser(new User("111-4","Shruti","Kanpur","111-1","111-2","111-3","none","none","none"));
        
    }
}

