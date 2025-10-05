package dev.brice.memories.post.domain;

import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class Post {

  private final PostTitle title;
  private final PostMessage message;
  private final PostCreator creator;
  private final PostTags tags;
  private final PostLike like;
  private final PostCreatedAt createdAt;
  private final PostId id;

  public Post(UUID id, String title, String message, String creator, Set<String> tags) {
    this.title = new PostTitle(title);
    this.message = new PostMessage(message);
    this.creator = new PostCreator(creator);
    this.tags = new PostTags();
    tags.forEach(tag -> this.tags.add(new PostTag(tag)));
    this.like = new PostLike();
    this.createdAt = new PostCreatedAt();
    this.id = new PostId(id);
  }

  public Post(String title, String message, String creator, Set<String> tags) {
    this.title = new PostTitle(title);
    this.message = new PostMessage(message);
    this.creator = new PostCreator(creator);
    this.tags = new PostTags();
    tags.forEach(tag -> this.tags.add(new PostTag(tag)));
    this.like = new PostLike();
    this.createdAt = new PostCreatedAt();
    this.id = new PostId();
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

  public PostId id() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Post post)) return false;
    return Objects.equals(id, post.id);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(id);
  }
}
