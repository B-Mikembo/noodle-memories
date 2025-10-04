package dev.brice.memories.post.domain;

import dev.brice.memories.shared.error.domain.Assert;

public record PostCreator(String creator) {
  public PostCreator {
    Assert.field("postCreator", creator).notNull().notBlank();
  }
}
