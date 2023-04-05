package idusw.springboot.board_thymelea.service;

import idusw.springboot.board_thymelea.domain.Memo;
import idusw.springboot.board_thymelea.entity.MemoEntity;
import idusw.springboot.board_thymelea.repository.MemoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class MemoServiceImpl implements  MemoService{
    MemoRepository memoRepository;
    public MemoServiceImpl(MemoRepository memoRepository){ // constructor DI : spring framework 가 해줌
        this.memoRepository = memoRepository;
    }
    @Override
    public int create(Memo m) {
        return 0;
    }

    @Override
    public Memo read(Memo m) {
        MemoEntity memoEntity = memoRepository.getById(m.getMno());
        Memo result = new Memo();
        result.setMno(memoEntity.getMno());
        result.setMemoText(memoEntity.getMemoText());
        return result;
    }

    @Override
    public List<Memo> readList() {
        List<Memo> result = new ArrayList<>(); // Memo 객체를 요소로 하는 ArrayList 객체를 생성하고, 참조변수에 배정
        List<MemoEntity> entities = memoRepository.findAll();
        for(MemoEntity memoEntity : entities) {
            Memo memo = new Memo();
            memo.setMno(memoEntity.getMno());
            memo.setMemoText(memoEntity.getMemoText());
            result.add(memo);
        }
        return result;
    }

    @Override
    public int update(Memo m) {
        return 0;
    }

    @Override
    public int delete(Memo m) {
        return 0;
    }

    @Override
    public List<Memo> initalize() {
        IntStream.rangeClosed(1,10).forEach(i -> {
            MemoEntity memo = MemoEntity.builder().memoText("sample" + i).build();
            memoRepository.save(memo);
        });
        return null;
    }
}
