package dev.brice.memories.post.infrastructure.secondary;

import static dev.brice.memories.post.domain.PostsFixture.post;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PostGreSQLPostsRepositoryUnitTest {

  @Mock
  private PostsSpringRepository springRepository;

  @InjectMocks
  private PostGreSQLRepository repository;

  @Test
  void shouldGetAllFromRepository() {
    when(springRepository.findAll()).thenReturn(List.of(PostEntity.from(post())));

    assertThat(repository.getAll().get()).containsExactlyInAnyOrder(post());
  }
}
