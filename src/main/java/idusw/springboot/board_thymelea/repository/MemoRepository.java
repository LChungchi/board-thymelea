package idusw.springboot.board_thymelea.repository;

import idusw.springboot.board_thymelea.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<MemoEntity, Long> {
    // Repository는 Data를 Access 하는 객체, Entities (table, view, index ...)
}
