package dev.brice.memories.post.domain;

import static dev.brice.memories.post.domain.PostsFixture.post;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PostsUnitTest {

  @Test
  void shouldGetEmptyPostsByDefault() {
    assertThat(new Posts().get()).isEmpty();
  }

  @Test
  void shouldAddAndGetPosts() {
    var posts = new Posts();

    posts.add(post());

    assertThat(posts.get()).containsExactlyInAnyOrder(post());
  }
}
