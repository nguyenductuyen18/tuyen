package com.codegym.demo15.controller;

import com.codegym.demo15.model.Phong;
import com.codegym.demo15.service.IPhongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class PhongController {
    @Autowired
    private IPhongService iPhongService;
    @RequestMapping("/play")
    private ModelAndView findAll(){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("phong",iPhongService.findAll());
        return modelAndView;
    }
    @GetMapping("/show/{id}")
    private ModelAndView findById(@PathVariable Long id){
        ModelAndView modelAndView = new ModelAndView("/show");
        Optional<Phong> phong = iPhongService.findById(id);
        Phong phongObject = new Phong(phong.get().getId(), phong.get().getName(),phong.get().getDerail(),phong.get().getPrice(),phong.get().getStatus(),phong.get().getNumberOfPerson(),phong.get().getNumberBed());
        modelAndView.addObject("phong",phongObject);
        return modelAndView;
    }

    @GetMapping("/create")
    private ModelAndView add(){
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("phong",new Phong());
        return modelAndView;
    }
    @PostMapping("/save")
    private String save(Phong phong){
        iPhongService.save(phong);
        return "redirect:/play";
    }
    @GetMapping("/update/{id}")
    private ModelAndView update(@PathVariable Long id){
        Optional<Phong> phong = iPhongService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/update");
        modelAndView.addObject("phong",phong.get());
        return modelAndView;
    }
    @GetMapping("/delete/{id}")
    private ModelAndView showDelete(@PathVariable Long id){
        Optional<Phong> phong = iPhongService.findById(id);
        ModelAndView modelAndView = new ModelAndView("/delete");
        modelAndView.addObject("phong",phong.get());
        return modelAndView;
    }
    @PostMapping("/remove")
    private String delete(Phong phong){
        iPhongService.delete(phong.getId());
        return "redirect:/play";
    }

}
