package idusw.springboot.board_thymelea.repository;

import idusw.springboot.board_thymelea.entity.Memo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemoRepository extends JpaRepository<Memo, Long> {
}
