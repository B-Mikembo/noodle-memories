package dev.brice.memories.post.domain;

import java.util.Set;
import java.util.UUID;

public final class PostsFixture {

  private PostsFixture() {}

  public static Post post() {
    return new Post(id(), "title", "message", "creator", Set.of("ddd", "craft"));
  }

  public static UUID id() {
    return UUID.fromString("ff0ac298-3959-4969-a930-8b7aa36ad939");
  }
}
