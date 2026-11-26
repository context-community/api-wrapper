package com.example.api_wrapper.ThirdParty;

import com.example.api_wrapper.Model.Comment;
import com.example.api_wrapper.Model.Post;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.List;


@Component
public class PostIntegration extends CallThirdPartyProvider {

    private final RestClient restClient;

    public PostIntegration(RestClient.Builder builder) {
        super(builder);

        this.restClient = builder
                //TODO: move to env var
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();

    }

    //remove to the onother class
    public List<Post> getPosts() {
        return restClient.get()
                .uri("/posts")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Post>>() {
                });
    }


    public ResponseEntity<Void> deletePost(long id) {
        return restClient.delete().uri("/posts/{id}", id)
                .retrieve()
                .toBodilessEntity();
    }

    public Post updatePost(long id, Post post) {

        return restClient.put()
                .uri("/posts/{id}", id)
                .body(post)
                .retrieve()
                .body(Post.class);

    }

    public List<Comment> getCommentOfPost(long postId) {

        return restClient.get().uri(uriBuilder -> uriBuilder
                        .path("/comments")
                        .queryParam("postId", postId)
                        .build()
                )
                .retrieve()
                .body(new ParameterizedTypeReference<List<Comment>>() {
                });


    }

    public Post createPost(Post post) {

        return restClient.post().uri("posts").body(post).retrieve().body(Post.class);

    }
}
