package com.example.lienhespring.controllers;

import com.example.lienhespring.domains.LienHe;
import com.example.lienhespring.models.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.lienhespring.respositorys.lienheRespository;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;
import java.util.Objects;

@Controller
@RestController
public class apiController {

    @Autowired
    lienheRespository lienheRespository;


    @GetMapping("/danh-sach-lien-he")
    public List<LienHe> getList(){
        List<LienHe> list = lienheRespository.findAll();
        return  list;
    }
    @PostMapping("/add-lien-he")
    public Notice getList(@RequestBody LienHe lienhe){
        System.out.println(lienhe);
        LienHe result = lienheRespository.save(lienhe);
        Notice notice = new Notice();
        if(!Objects.isNull(result)){
            notice.setSuccess(true);
            notice.setMessage("Thêm liên hệ thành công");
            return notice;
        }else{
            notice.setSuccess(false);
            notice.setMessage("Thêm liên hệ thất bại");
            return notice;
        }
    }
}
