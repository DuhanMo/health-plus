package org.duhan.healthplus.service.post;

import org.duhan.healthplus.dto.post.PostRequest;
import org.duhan.healthplus.entity.Post;
import org.duhan.healthplus.repository.post.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PostService {
    Post read(Long id);

    void register(PostRequest postRequest);

    default Post dtoToEntity(PostRequest dto) {
        Post entity = Post.builder()
                .id(dto.getId())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();
        return entity;
    }
}
