package dev.brice.memories.post.infrastructure.secondary;

import dev.brice.memories.post.domain.Post;
import dev.brice.memories.post.domain.PostTag;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

@Entity
@Table(name = "post")
public class PostEntity {

  @Id
  private UUID id;

  private String title;
  private String message;
  private String creator;
  private Set<String> tags;
  private int likeCount;
  private LocalDateTime createdAt;

  public static PostEntity from(Post post) {
    return new PostEntity()
      .id(post.id().get())
      .title(post.title().get())
      .message(post.message().get())
      .creator(post.creator().get())
      .tags(buildTags(post))
      .like(post.like().get())
      .createdAt(post.createdAt().get());
  }

  private PostEntity createdAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  private PostEntity like(int likeCount) {
    this.likeCount = likeCount;
    return this;
  }

  private static Set<String> buildTags(Post post) {
    return post.tags().get().stream().map(PostTag::get).collect(Collectors.toSet());
  }

  private PostEntity tags(Set<String> tags) {
    this.tags = Set.copyOf(tags);
    return this;
  }

  private PostEntity creator(String creator) {
    this.creator = creator;
    return this;
  }

  private PostEntity message(String message) {
    this.message = message;
    return this;
  }

  private PostEntity title(String title) {
    this.title = title;
    return this;
  }

  private PostEntity id(UUID id) {
    this.id = id;
    return this;
  }

  public UUID id() {
    return id;
  }

  public String title() {
    return title;
  }

  public String message() {
    return message;
  }

  public String creator() {
    return creator;
  }

  public Set<String> tags() {
    return tags;
  }

  public int likeCount() {
    return likeCount;
  }

  public LocalDateTime createdAt() {
    return createdAt;
  }

  public Post toDomain() {
    return new Post(id, title, message, creator, tags);
  }
}
