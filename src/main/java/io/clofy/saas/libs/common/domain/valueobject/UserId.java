package io.clofy.saas.libs.common.domain.valueobject;

import java.io.Serializable;

public class UserId extends BaseId<String> implements Serializable {
    public UserId(String value) {
        super(value);
    }

    public static UserId of(String id) {
      return new UserId(id);
    }
}
