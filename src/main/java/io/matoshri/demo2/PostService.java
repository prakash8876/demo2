package io.matoshri.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange(url = "https://jsonplaceholder.typicode.com/posts")
public interface PostService {
    @GetExchange
    List<Post> getPosts();

    @GetExchange("/{id}")
    Post getPostById(@PathVariable("id") Integer id);
}
