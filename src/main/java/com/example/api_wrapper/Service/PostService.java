package com.example.api_wrapper.Service;


import com.example.api_wrapper.Model.Comment;
import com.example.api_wrapper.Model.Post;
import com.example.api_wrapper.ThirdParty.ThirdParty;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final ThirdParty thirdParty;

    public PostService(ThirdParty thirdParty){
        this.thirdParty = thirdParty;
    }

    public List<Post> getPosts() {
        return thirdParty.getPosts();
    }

    public ResponseEntity<Void> deletePost(long id){
        return thirdParty.deletePost(id);
    }

    public Post updatePost(long id, Post post) {

        return thirdParty.updatePost(id, post);

    }

    public List<Comment> getCommentOfPost(long postId) {

        return thirdParty.getCommentOfPost(postId);

    }

    public Post createPost(Post post) {

        return thirdParty.createPost(post);

    }
}
