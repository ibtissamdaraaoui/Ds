package ma.xproce.ds.service;

import ma.xproce.ds.dto.BookDTO;

import java.util.List;

public interface BookService {
    public BookDTO saveBook(BookDTO bookDTO);
    public BookDTO getBookByTitle(String title);

}
