package idusw.springboot.board_thymelea.controller;


import idusw.springboot.board_thymelea.entity.Memo;
import idusw.springboot.board_thymelea.repository.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.stream.IntStream;

@Controller
public class HomeController {
    @Autowired
    MemoRepository memoRepository;
    @GetMapping("/")
    public String goHome(){
        IntStream.rangeClosed(1,10).forEach(i -> {
            Memo memo = Memo.builder().memoText("sample" + i).build();
            memoRepository.save(memo);
        });
        return "index";
    }

}
