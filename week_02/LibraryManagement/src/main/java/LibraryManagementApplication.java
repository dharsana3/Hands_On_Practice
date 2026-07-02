import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.repository.BookRepository;
import com.library.service.BookService;

public class LibraryManagementApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =
		        new ClassPathXmlApplicationContext("applicationContext.xml");
		BookRepository bookRepository = context.getBean("bookRepository", BookRepository.class);
		BookService bookService = context.getBean("bookService", BookService.class);
		System.out.println(bookService.availableBooks());
	}

}
