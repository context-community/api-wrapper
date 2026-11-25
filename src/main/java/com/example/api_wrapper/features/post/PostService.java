package com.example.api_wrapper.features.post;


import com.example.api_wrapper.Model.Comment;
import com.example.api_wrapper.ThirdParty.PostIntegration;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostIntegration postIntegration;

//    public PostService(ThirdParty thirdParty){
//        this.thirdParty = thirdParty;
//    }

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
