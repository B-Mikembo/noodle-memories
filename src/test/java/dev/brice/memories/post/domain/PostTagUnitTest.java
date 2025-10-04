package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import dev.brice.memories.shared.error.domain.MissingMandatoryValueException;
import org.junit.jupiter.api.Test;

public class PostTagUnitTest {

  @Test
  void shouldNotBuildWithoutPostTag() {
    assertThatThrownBy(() -> new PostTag(null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("postTag");
  }

  @Test
  void shouldNotBuildWithBlankPostTag() {
    assertThatThrownBy(() -> new PostTag(" "))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("postTag");
  }
}
