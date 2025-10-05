package dev.brice.memories.post.domain;

import java.util.Set;

public class Post {

  private final PostTitle title;
  private final PostMessage message;
  private final PostCreator creator;
  private final PostTags tags;
  private final PostLike like;
  private final PostCreatedAt createdAt;

  public Post(String title, String message, String creator, Set<String> tags) {
    this.title = new PostTitle(title);
    this.message = new PostMessage(message);
    this.creator = new PostCreator(creator);
    this.tags = new PostTags();
    tags.forEach(tag -> this.tags.add(new PostTag(tag)));
    this.like = new PostLike();
    this.createdAt = new PostCreatedAt();
  }

  public PostTitle title() {
    return title;
  }

  public PostMessage message() {
    return message;
  }

  public PostCreator creator() {
    return creator;
  }

  public PostTags tags() {
    return tags;
  }

  public PostLike like() {
    return like;
  }

  public PostCreatedAt createdAt() {
    return createdAt;
  }
}
