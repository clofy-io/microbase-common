package io.clofy.saas.libs.common.domain.valueobject;

import java.io.Serializable;

public class NumericId extends BaseId<Long> implements Serializable {
    public NumericId(Long value) {
        super(value);
    }

    public static NumericId of(Long value) {
        return new NumericId(value);
    }
}
