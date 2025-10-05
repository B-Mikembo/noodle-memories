package dev.brice.memories.post.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PostIdUnitTest {

  @Test
  void shouldGetRandomUniqueIdFromDefaultConstructor() {
    var id = new PostId();

    assertThat(id.get()).isNotNull();
    assertThat(id.get()).isEqualTo(id.get());
  }

  @Test
  void shouldGetRandomUniqueIdFromConstructorWithoutId() {
    var id = new PostId(null);

    assertThat(id.get()).isNotNull();
    assertThat(id.get()).isEqualTo(id.get());
  }
}
