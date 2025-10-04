package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import dev.brice.memories.shared.error.domain.MissingMandatoryValueException;
import org.junit.jupiter.api.Test;

public class PostCreatorUnitTest {

  @Test
  void shouldNotBuildWithoutPostCreator() {
    assertThatThrownBy(() -> new PostCreator(null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("postCreator");
  }
}
