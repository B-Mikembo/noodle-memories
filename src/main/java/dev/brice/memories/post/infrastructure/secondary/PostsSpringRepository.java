package dev.brice.memories.post.infrastructure.secondary;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsSpringRepository extends JpaRepository<PostEntity, UUID> {}
