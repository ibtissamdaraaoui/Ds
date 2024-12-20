package ma.xproce.ds.service;

import lombok.AllArgsConstructor;
import ma.xproce.ds.dao.entities.Book;
import ma.xproce.ds.dao.repositories.BookRepository;
import ma.xproce.ds.dto.BookDTO;
import ma.xproce.ds.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BookManager implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book=bookMapper.fromBookDTOtoBook(bookDTO);
        book=bookRepository.save(book);
        bookDTO=bookMapper.fromBookToBookDTO(book);
        return bookDTO;
    }

    @Override
    public BookDTO getBookByTitle(String title) {

        Book book=bookRepository.findByTitle(title);
        BookDTO bookDTO=bookMapper.fromBookToBookDTO(book);
        return bookDTO;
    }



}
