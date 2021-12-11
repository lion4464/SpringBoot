package com.example.demo.post.convertor;

import com.example.demo.post.domain.Post;
import com.example.demo.post.domain.PostDTO;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostConvertor {

    public PostDTO convert(PostDTO to, Post from){
        to.setId(from.getId());
        to.setTitle(from.getTitle());
        to.setContext(from.getContext());
        to.setCategory(from.getCategory());
        return to;
    }
}
