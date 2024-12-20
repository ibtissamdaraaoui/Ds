package ma.xproce.ds.dao.repositories;

import ma.xproce.ds.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Long> {
    public Book findByTitle(String title);
}
