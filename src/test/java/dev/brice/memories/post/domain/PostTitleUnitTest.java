package dev.brice.memories.post.domain;

import dev.brice.memories.shared.error.domain.MissingMandatoryValueException;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class PostTitleUnitTest {
  @Test
  void shouldNotBuildWithoutPostTitle() {
    assertThatThrownBy(() -> new PostTitle(null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("postTitle");
  }
}
