package idusw.springboot.board_thymelea.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity // 엔티티 클래스임으로 나타내는 에노테이션
@Table(name="tbl_memo")

@ToString   //   lomBok 라이브러리 사용
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    // Oracle : GenerationType.SEQUENCE
    private Long mno;

    @Column(length = 200, nullable = false)
    private String memoText;
}
