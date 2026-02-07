package io.matoshri.demo2;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/{version}/posts", version = "1")
public class PostController {
    private  final PostService postService;
    public PostController(PostService postService, PostService postService1) {
        this.postService = postService1;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Post> getPosts() {
        return postService.getPosts();
    }
}
