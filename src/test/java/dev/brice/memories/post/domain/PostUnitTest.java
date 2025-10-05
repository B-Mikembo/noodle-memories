package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;
import org.junit.jupiter.api.Test;

public class PostUnitTest {

  private final Post post = new Post("title", "message", "creator", Set.of("ddd", "craft"));

  @Test
  void shouldGetNewPostInformation() {
    assertThat(post.title()).isEqualTo(new PostTitle("title"));
    assertThat(post.message()).isEqualTo(new PostMessage("message"));
    assertThat(post.creator()).isEqualTo(new PostCreator("creator"));
    assertThat(post.tags()).isNotNull();
    assertThat(post.like()).isEqualTo(new PostLike());
    assertThat(post.createdAt()).isNotNull();
    assertThat(post.id()).isNotNull();
  }
}
