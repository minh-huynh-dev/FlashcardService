import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "flashcard.services")
public class FlashcardService {

    public static void main(String[] args) {
        SpringApplication.run(FlashcardService.class, args);
    }
}
