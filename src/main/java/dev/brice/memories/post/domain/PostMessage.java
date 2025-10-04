package dev.brice.memories.post.domain;

import dev.brice.memories.shared.error.domain.Assert;

public record PostMessage(String message) {
  public PostMessage {
    Assert.field("postMessage", message).notNull();
  }

  public String get() {
    return message;
  }
}
