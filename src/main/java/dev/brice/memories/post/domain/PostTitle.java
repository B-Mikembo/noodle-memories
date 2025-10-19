package dev.brice.memories.post.domain;

import dev.brice.memories.shared.error.domain.Assert;

public record PostTitle(String title) {
  public PostTitle {
    Assert.field("postTitle", title).notNull();
  }
}
