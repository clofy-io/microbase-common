package io.clofy.saas.libs.common.domain.event;

import io.clofy.saas.libs.common.domain.entity.AggregateRoot;

import java.time.ZonedDateTime;
import java.util.List;

public abstract class DomainEvent<T extends AggregateRoot<?>> {
    private final T source;
    private final ZonedDateTime createdAt;
    private final List<String> failureMessages;
    public DomainEvent(T source, ZonedDateTime createdAt, List<String> failureMessages) {
        this.source = source;
        this.createdAt = createdAt;
        this.failureMessages = failureMessages;
    }

    public T getSource() {
        return source;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public List<String> getFailureMessages() {
        return failureMessages;
    }
}
