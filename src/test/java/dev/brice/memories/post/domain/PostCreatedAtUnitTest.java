package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.*;

import dev.brice.memories.shared.error.domain.MissingMandatoryValueException;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import org.junit.jupiter.api.Test;

public class PostCreatedAtUnitTest {

  @Test
  void shouldNotBuildWithoutPostCreatedAt() {
    assertThatThrownBy(() -> new PostCreatedAt(null))
      .isExactlyInstanceOf(MissingMandatoryValueException.class)
      .hasMessageContaining("postCreatedAt");
  }

  @Test
  void shouldGetNowByDefault() {
    assertThat(new PostCreatedAt().get()).isCloseTo(LocalDateTime.now(), within(1, ChronoUnit.SECONDS));
  }
}
