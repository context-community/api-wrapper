package com.example.api_wrapper.ThirdParty;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class CallThirdPartyProvider {

    private final RestClient restClient;

    public CallThirdPartyProvider(RestClient.Builder builder) {
        this.restClient = builder
                //TODO: move to env var
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();

    }

    public <T> T makeGetRequest(String path, ParameterizedTypeReference<T> responseType) {
        return restClient.get()
                .uri(path)
                .retrieve()
                .body(responseType);
    }
}
