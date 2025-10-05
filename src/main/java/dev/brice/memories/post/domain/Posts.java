package dev.brice.memories.post.domain;

import java.util.ArrayList;
import java.util.List;

public record Posts(List<Post> posts) {
  public Posts() {
    this(new ArrayList<>());
  }

  public List<Post> get() {
    return posts;
  }

  public void add(Post post) {
    posts.add(post);
  }
}
