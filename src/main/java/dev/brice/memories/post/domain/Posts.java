package dev.brice.memories.post.domain;

import java.util.Collections;
import java.util.List;

public record Posts() {
  public List<Post> get() {
    return Collections.emptyList();
  }
}
