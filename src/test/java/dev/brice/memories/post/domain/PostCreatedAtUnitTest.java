package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import dev.brice.memories.shared.error.domain.MissingMandatoryValueException;
import org.junit.jupiter.api.Test;

public class PostCreatedAtUnitTest {

  @Test
  void shouldNotBuildWithoutPostCreatedAt() {
    assertThatThrownBy(() -> new PostCreatedAt(null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("postCreatedAt");
  }
}
