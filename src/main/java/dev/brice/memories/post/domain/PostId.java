package dev.brice.memories.post.domain;

import java.util.UUID;

public record PostId(UUID id) {
  public PostId() {
    this(UUID.randomUUID());
  }

  public PostId get() {
    return new PostId(id);
  }
}
