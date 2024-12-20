package ma.xproce.ds.web;

import lombok.AllArgsConstructor;
import ma.xproce.ds.dto.BookDTO;
import ma.xproce.ds.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;



@Controller
@AllArgsConstructor
public class GraphQLController {
    @Autowired
    private BookService bookService ;

    @MutationMapping
    public BookDTO saveBook(@Argument BookDTO book){
        return bookService.saveBook(book);
    }


    @QueryMapping
    public BookDTO getBookByTitle(@Argument String title){
        return bookService.getBookByTitle(title);
    }


}
