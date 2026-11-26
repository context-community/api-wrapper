package com.example.api_wrapper.Service;


import com.example.api_wrapper.Model.Comment;
import com.example.api_wrapper.Model.Post;
import com.example.api_wrapper.ThirdParty.PostIntegration;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostIntegration postIntegration;

    public PostService(PostIntegration postIntegration) {
        this.postIntegration = postIntegration;
    }

    public List<Post> getPosts() {
        return postIntegration.getPosts();
    }

    public ResponseEntity<Void> deletePost(long id) {
        return postIntegration.deletePost(id);
    }

    public Post updatePost(long id, Post post) {

        return postIntegration.updatePost(id, post);

    }

    public List<Comment> getCommentOfPost(long postId) {

        return postIntegration.getCommentOfPost(postId);

    }

    public Post createPost(Post post) {

        return postIntegration.createPost(post);

    }
}
