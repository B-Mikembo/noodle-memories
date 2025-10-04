package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PostTagsUnitTest {

  @Test
  void shouldGetEmptyPostTags() {
    assertThat(new PostTags().get()).isEmpty();
  }

  @Test
  void shouldAddAndGetPostTags() {
    var postTags = new PostTags();

    postTags.add(new PostTag("tag"));
    assertThat(postTags.get()).containsExactlyInAnyOrder(new PostTag("tag"));
  }
}
