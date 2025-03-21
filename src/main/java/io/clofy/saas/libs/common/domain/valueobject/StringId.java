package io.clofy.saas.libs.common.domain.valueobject;

import java.io.Serializable;

public class StringId extends BaseId<String> implements Serializable {

    public StringId(String value) {
        super(value);
    }

    public static StringId of(String value) {
        return new StringId(value);
    }
}
