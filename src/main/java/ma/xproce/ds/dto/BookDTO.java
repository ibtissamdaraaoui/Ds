package ma.xproce.ds.dto;

import lombok.*;




@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class BookDTO {
    String title;
    String publisher;
    String datePublication;
    double Price;
    String resume;

}
