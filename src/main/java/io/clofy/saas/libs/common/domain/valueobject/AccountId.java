package io.clofy.saas.libs.common.domain.valueobject;

import java.io.Serializable;

public class AccountId extends BaseId<String> implements Serializable {
    public AccountId(String value) {
        super(value);
    }

    public static AccountId of(String id) {
        return new AccountId(id);
    }
}
