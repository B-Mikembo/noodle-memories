package dev.brice.memories.post.infrastructure.secondary;

import dev.brice.memories.post.domain.Posts;
import dev.brice.memories.post.domain.PostsRepository;
import org.springframework.stereotype.Repository;

@Repository
public class PostGreSQLRepository implements PostsRepository {

  private final PostsSpringRepository springRepository;

  public PostGreSQLRepository(PostsSpringRepository springRepository) {
    this.springRepository = springRepository;
  }

  public Posts getAll() {
    return new Posts(springRepository.findAll().stream().map(PostEntity::toDomain).toList());
  }
}
