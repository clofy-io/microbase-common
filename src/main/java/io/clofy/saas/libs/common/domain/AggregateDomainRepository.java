package io.clofy.saas.libs.common.domain;

import io.clofy.saas.libs.common.domain.entity.AggregateRoot;
import io.clofy.saas.libs.common.domain.valueobject.BaseId;

import java.util.Optional;

public interface AggregateDomainRepository<T extends AggregateRoot<ID>,ID extends BaseId<?>> {

    default T save(T entity) {
        throw new UnsupportedOperationException("Save method is not implemented");
    }


    default Optional<T> findById(ID id) {
        throw new UnsupportedOperationException("FindById method is not implemented");
    }

    default boolean existsById(ID id) {
        throw new UnsupportedOperationException("ExistsById method is not implemented");
    }

    default void deleteById(ID id) {
        throw new UnsupportedOperationException("DeleteById method is not implemented");
    }
}
