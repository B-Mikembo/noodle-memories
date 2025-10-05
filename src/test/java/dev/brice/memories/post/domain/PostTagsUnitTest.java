package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import dev.brice.memories.shared.error.domain.MissingMandatoryValueException;
import org.junit.jupiter.api.Test;

public class PostTagsUnitTest {

  @Test
  void shouldGetEmptyPostTagsAtCreation() {
    assertThat(new PostTags().get()).isEmpty();
  }

  @Test
  void shouldNotAddWithoutPostTag() {
    assertThatThrownBy(() -> new PostTags().add(null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("postTag");
  }

  @Test
  void shouldAddAndGetPostTags() {
    var postTags = new PostTags();

    postTags.add(new PostTag("tag"));
    assertThat(postTags.get()).containsExactlyInAnyOrder(new PostTag("tag"));
  }
}
