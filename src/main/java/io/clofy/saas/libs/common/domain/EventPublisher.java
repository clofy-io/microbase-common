package io.clofy.saas.libs.common.domain;

import io.clofy.saas.libs.common.domain.event.DomainEvent;

public interface EventPublisher<T extends DomainEvent<?>> {
    default void publish(T event){
        throw new UnsupportedOperationException("Publish event is not implemented");
    }
}
