package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.assertThat;
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

  @Test
  void shouldNotBuildWithBlankPostCreator() {
    assertThatThrownBy(() -> new PostCreator(" "))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("postCreator");
  }

  @Test
  void shouldGetPostCreator() {
    assertThat(new PostCreator("creator").get()).isEqualTo("creator");
  }
}
