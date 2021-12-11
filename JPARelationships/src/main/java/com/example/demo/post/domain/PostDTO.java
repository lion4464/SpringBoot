package com.example.demo.post.domain;

import com.example.demo.category.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PostDTO {
    private long id;
    private String title;
    private String context;
    private Category category;
}
