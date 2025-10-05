package dev.brice.memories.post.application;

import static dev.brice.memories.post.domain.PostsFixture.post;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import dev.brice.memories.post.domain.Posts;
import dev.brice.memories.post.domain.PostsRepository;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PostsApplicationServiceUnitTest {

  @Mock
  private PostsRepository repository;

  @InjectMocks
  private PostsApplicationService service;

  @Test
  void shouldGetPostsFromRepository() {
    when(repository.getAll()).thenReturn(new Posts(List.of(post())));

    var posts = service.posts();

    assertThat(posts.get()).containsExactlyInAnyOrder(post());
  }
}
