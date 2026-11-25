package com.example.api_wrapper.ThirdParty;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
//@RequiredArgsConstructor
public class ThirdPartyCallerService {
    private final RestClient restClient;

    public ThirdPartyCallerService(RestClient.Builder builder) {
        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
    }

    public <T> T getRequest(String path, ParameterizedTypeReference<T> responseType) {
        return restClient.get()
                .uri(path)
                .retrieve()
                .body(responseType);
    }
}
