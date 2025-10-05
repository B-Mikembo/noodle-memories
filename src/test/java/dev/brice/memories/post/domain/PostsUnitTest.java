package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PostsUnitTest {

  @Test
  void shouldGetEmptyPostsByDefault() {
    assertThat(new Posts().get()).isEmpty();
  }
}
