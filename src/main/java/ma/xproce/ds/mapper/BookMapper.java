package ma.xproce.ds.mapper;

import ma.xproce.ds.dao.entities.Book;
import ma.xproce.ds.dto.BookDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {
    private final ModelMapper mapper = new ModelMapper();
    public Book fromBookDTOtoBook(BookDTO bookDto){
        return mapper.map(bookDto, Book.class);
    }

    public BookDTO fromBookToBookDTO(Book book){
        return mapper.map(book, BookDTO.class);
    }
}
