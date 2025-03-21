package io.clofy.saas.libs.common.domain.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract class AggregateRoot<ID> extends BaseEntity<ID> implements Serializable {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AggregateRoot<?> that = (AggregateRoot<?>) o;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
