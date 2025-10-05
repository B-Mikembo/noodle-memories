package dev.brice.memories.post.application;

import dev.brice.memories.post.domain.Posts;
import dev.brice.memories.post.domain.PostsRepository;
import org.springframework.stereotype.Service;

@Service
public class PostsApplicationService {

  private final PostsRepository postsRepository;

  public PostsApplicationService(PostsRepository postsRepository) {
    this.postsRepository = postsRepository;
  }

  public Posts posts() {
    return postsRepository.getAll();
  }
}
