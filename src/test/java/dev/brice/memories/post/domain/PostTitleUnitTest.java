package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import dev.brice.memories.shared.error.domain.MissingMandatoryValueException;
import org.junit.jupiter.api.Test;

public class PostTitleUnitTest {

  @Test
  void shouldNotBuildWithoutPostTitle() {
    assertThatThrownBy(() -> new PostTitle(null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("postTitle");
  }

  @Test
  void shouldNotBuildWithBlankPostTitle() {
    assertThatThrownBy(() -> new PostTitle(" "))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("postTitle");
  }
}
