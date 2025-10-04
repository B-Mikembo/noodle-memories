package dev.brice.memories.post.domain;

import java.util.HashSet;
import java.util.Set;

public class PostTags {

  private final HashSet<PostTag> tags = new HashSet<>();

  public Set<PostTag> get() {
    return tags;
  }

  public void add(PostTag tag) {
    tags.add(tag);
  }
}
