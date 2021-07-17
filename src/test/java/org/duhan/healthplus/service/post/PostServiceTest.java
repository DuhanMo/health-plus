package org.duhan.healthplus.service.post;

import org.duhan.healthplus.dto.post.PostRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class PostServiceTest {

    @Autowired
    private PostService postService;

    @Test
    public void testRegister() {
        PostRequest postRequest = PostRequest
                .builder()
                .title("test title")
                .content("content test")
                .writer("user test")
//                .regDate(LocalDateTime.now())
//                .modDate(LocalDateTime.now())
                .build();
        postService.register(postRequest);
//         커밋 테스트
    }

}