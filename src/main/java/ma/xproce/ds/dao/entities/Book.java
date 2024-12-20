package ma.xproce.ds.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;



@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Builder
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    Long Id_Book;
    String title;
    String publisher;
    String datePublication;
    double Price;
    String resume;


}
