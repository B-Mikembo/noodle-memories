package dev.brice.memories.post.domain;

import java.util.UUID;

public record PostId(UUID id) {
  public PostId() {
    this(null);
  }

  public PostId(UUID id) {
    this.id = id == null ? UUID.randomUUID() : id;
  }

  public UUID get() {
    return id;
  }
}
