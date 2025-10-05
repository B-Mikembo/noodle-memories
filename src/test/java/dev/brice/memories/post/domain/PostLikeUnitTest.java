package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import dev.brice.memories.shared.error.domain.NumberValueTooLowException;
import org.junit.jupiter.api.Test;

public class PostLikeUnitTest {

  @Test
  void shouldNotBuildWithNegativePostLike() {
    assertThatThrownBy(() -> new PostLike(-1))
      .isExactlyInstanceOf(NumberValueTooLowException.class)
      .hasMessageContaining("postLike");
  }

  @Test
  void shouldGetZeroByDefault() {
    assertThat(new PostLike().get()).isEqualTo(0);
  }

  @Test
  void shouldIncrementAndGetPostLike() {
    var postLike = new PostLike();

    assertThat(postLike.increment()).isExactlyInstanceOf(PostLike.class).extracting(PostLike::get).isEqualTo(1);
  }
}
