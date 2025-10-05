package dev.brice.memories.post.domain;

import dev.brice.memories.shared.error.domain.Assert;

public record PostLike(int like) {
  public PostLike() {
    this(0);
  }

  public PostLike {
    Assert.field("postLike", like).positive();
  }

  public int get() {
    return 0;
  }
}
