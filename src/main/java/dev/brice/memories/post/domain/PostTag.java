package dev.brice.memories.post.domain;

import dev.brice.memories.shared.error.domain.Assert;

public record PostTag(String tag) {
  public PostTag {
    Assert.field("postTag", tag).notNull();
  }
}
