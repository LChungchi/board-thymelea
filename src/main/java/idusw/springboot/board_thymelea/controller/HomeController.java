package idusw.springboot.board_thymelea.controller;


import idusw.springboot.board_thymelea.domain.Memo;
import idusw.springboot.board_thymelea.entity.MemoEntity;
import idusw.springboot.board_thymelea.repository.MemoRepository;
import idusw.springboot.board_thymelea.service.MemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class HomeController {
    @Autowired
    MemoService memoService;
    public HomeController(MemoService memoService){ // constructor DI
        this.memoService =memoService;
    }
    /*
    @Autowired
    MemoRepository memoRepository; // Field DI (Dependency Injection)
    */
    @GetMapping("/init")
    public String goHome(){
        memoService.initalize();
        return "index";
    }
    List<Memo> result = new ArrayList<>();
    @GetMapping("/memo")
    public String getMemoList(Model model){
        result = memoService.readList(); // 서비스 객체의 메소드를 호출하여 업무를 처리한다.
        model.addAttribute("memoList",result); // 처리된 결과를 전달하기 위해 model 객체의 속성으로 지정ㄴ
        return "list"; // view 이름
    }
    @GetMapping("/memo/{mno}")
    public String getMemoList(@PathVariable("mno") Long mno, Model model){
        Memo result = new Memo();
        Memo memo = new Memo();
        memo.setMno(mno);
        result = memoService.read(memo); // 서비스 객체의 메소드를 호출하여 업무를 처리한다.
        model.addAttribute("memoList",result); // 처리된 결과를 전달하기 위해 model 객체의 속성으로 지정ㄴ
        return "list"; // view 이름
    }

}
