package dev.brice.memories.post.domain;

import dev.brice.memories.shared.error.domain.Assert;

public record PostLike(int like) {
  public PostLike {
    Assert.field("postLike", like).positive();
  }
}
