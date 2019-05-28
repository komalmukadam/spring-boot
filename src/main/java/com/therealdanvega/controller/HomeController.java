package com.therealdanvega.controller;

import com.therealdanvega.domain.Post;
import com.therealdanvega.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    private PostService postService;

    @Autowired
    public HomeController(PostService postService){
        this.postService =  postService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Post home(){
        return postService.getLatestPost();

    }


}
