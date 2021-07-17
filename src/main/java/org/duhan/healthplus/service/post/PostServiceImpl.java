package org.duhan.healthplus.service.post;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.duhan.healthplus.dto.post.PostRequest;
import org.duhan.healthplus.entity.Post;
import org.duhan.healthplus.repository.post.PostRepository;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService{


    private final PostRepository postRepository;

    @Override
    public Post read(Long id) {
        return null;
    }

    @Override
    public void register(PostRequest postRequest) {
        Post entity = dtoToEntity(postRequest);
        postRepository.save(entity);
    }

}
