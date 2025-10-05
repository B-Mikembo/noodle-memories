package dev.brice.memories.post.domain;

import dev.brice.memories.shared.error.domain.Assert;

public record PostTag(String tag) {
  public PostTag(String tag) {
    Assert.field("postTag", tag).notNull().notBlank();
    var replaceSpace = tag.replace(" ", "");
    this.tag = tag.contains("#") ? replaceSpace : "#" + replaceSpace;
  }

  public String get() {
    return tag;
  }
}
