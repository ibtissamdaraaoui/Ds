package ma.xproce.ds;

import ma.xproce.ds.dto.BookDTO;
import ma.xproce.ds.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class DsApplication {


    public static void main(String[] args) {
        SpringApplication.run(DsApplication.class, args);
    }
    @Bean
    CommandLineRunner start(BookService bookService){
        return args -> {


            bookService.saveBook(
                            BookDTO.builder().title("Book1")
                                    .publisher("sdf64w6e")
                                    .datePublication("20-12-2024")
                                    .Price(12345)
                                    .resume("abcdef").build()
            );
        };
    }

}
