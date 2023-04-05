package idusw.springboot.board_thymelea.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity // 엔티티 클래스임으로 나타내는 에노테이션
@Table(name="tbl_memo")

@ToString   //   lomBok 라이브러리 사용
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    // Oracle : GenerationType.SEQUENCE
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
