package dev.brice.memories.post.infrastructure.secondary;

import static dev.brice.memories.post.domain.PostsFixture.post;
import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration;
import org.junit.jupiter.api.Test;

public class PostEntityUnitTest {

  @Test
  void shouldConvertFromAndToPost() {
    assertThat(PostEntity.from(post()).toDomain())
      .usingRecursiveComparison(RecursiveComparisonConfiguration.builder().withIgnoredFields("createdAt").build())
      .isEqualTo(post());
  }
}
