package idusw.springboot.board_thymelea.service;

import idusw.springboot.board_thymelea.domain.Memo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface MemoService {
    int create(Memo m);
    Memo read(Memo m); // m의 식별자인 mno 값도 가능
    List<Memo> readList();
    int update(Memo m); // m은 수정하고자 하는 필드 값을 전달
    int delete(Memo m); // m은 식별자인 mno 값

    List<Memo> initalize(); // 초기화
    // 업무 프로세스(Business Process) 코드가 구현됨
}
