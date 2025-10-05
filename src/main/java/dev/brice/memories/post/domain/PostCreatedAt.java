package dev.brice.memories.post.domain;

import dev.brice.memories.shared.error.domain.MissingMandatoryValueException;
import java.time.LocalDateTime;

public record PostCreatedAt(LocalDateTime createdAt) {
  public PostCreatedAt() {
    this(LocalDateTime.now());
  }

  public PostCreatedAt {
    if (createdAt == null) {
      throw MissingMandatoryValueException.forNullValue("postCreatedAt");
    }
  }

  public LocalDateTime get() {
    return createdAt;
  }
}
