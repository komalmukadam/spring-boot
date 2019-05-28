package com.therealdanvega.service;

import com.therealdanvega.domain.Author;
import com.therealdanvega.domain.Post;
import com.therealdanvega.repository.AuthorRepository;
import com.therealdanvega.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;

@Service
public class PostService {
    private PostRepository postRepository;



    @Autowired
    public PostService(PostRepository postRepository){
        this.postRepository = postRepository;

    }

    public Post getLatestPost(){
        return postRepository.findFirstByOrderByPostedOnDesc();

    }


}
