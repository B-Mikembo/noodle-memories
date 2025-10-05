package dev.brice.memories.post.domain;

import static dev.brice.memories.post.domain.PostsFixture.post;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class PostUnitTest {

  private final Post post = post();

  @Test
  void shouldGetNewPostInformation() {
    assertThat(post.title()).isEqualTo(new PostTitle("title"));
    assertThat(post.message()).isEqualTo(new PostMessage("message"));
    assertThat(post.creator()).isEqualTo(new PostCreator("creator"));
    assertThat(post.tags()).isNotNull();
    assertThat(post.like()).isEqualTo(new PostLike());
    assertThat(post.createdAt()).isNotNull();
    assertThat(post.id()).isNotNull();
  }

  @Test
  void shouldBeEqualToSelf() {
    var post = post();

    assertThat(post.equals(post)).isTrue();
  }

  @Test
  void shouldNotBeEqualToNull() {
    assertThat(post().equals(null)).isFalse();
  }

  @Test
  @SuppressWarnings("unlikely-arg-type")
  void shouldNotBeEqualToAnotherClass() {
    assertThat(post().equals("post")).isFalse();
  }

  @Test
  void shouldNotBeEqualToPostWithAnotherId() {
    assertThat(post().id().equals(new PostId())).isFalse();
  }
}
