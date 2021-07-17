package org.duhan.healthplus.controller.post;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.duhan.healthplus.dto.post.PostRequest;
import org.duhan.healthplus.service.post.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/api/post")
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;
//
//    @GetMapping("/list")
//    public void list() {
//    }

    @PostMapping("/register")
    public void register(PostRequest postRequest) {
        postService.register(postRequest);
    }
}
