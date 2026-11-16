package com.example.api_wrapper.Controller;


import com.example.api_wrapper.Model.Comment;
import com.example.api_wrapper.Model.Post;
import com.example.api_wrapper.Service.PostService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.PipedOutputStream;
import java.util.List;

@RestController
public class PostController {

    private final PostService postService;

    public PostController(PostService postService){
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> getPosts(){

        return postService.getPosts();

    }

    @PostMapping("/posts")
    public Post createPost(Post post){
        return postService.createPost(post);
    }

    @DeleteMapping("/posts/{id}")
    public ResponseEntity<Void> deletePost(@PathVariable long id){

        return postService.deletePost(id);
    }

    @PutMapping("/posts/{id}")
    public Post updatePost(@PathVariable long id , @RequestBody Post post){
        return postService.updatePost(id, post);
    }

    @GetMapping("/comments")
    public List<Comment> getCommentOfPost(@RequestParam long postId){

        return postService.getCommentOfPost(postId);

    }

}
