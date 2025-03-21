package io.clofy.saas.libs.common.domain.valueobject;

import io.clofy.saas.libs.common.domain.exception.InvalidEmailException;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;

public record Email(String value) implements Serializable {
    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$"
    );

    public Email {
        validateEmail(value);
    }

    private void validateEmail(String email) {
        Objects.requireNonNull(email, "Email cannot be null");
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new InvalidEmailException("Invalid email format: " + email);
        }
    }

    public static Email of(String email) {
        return new Email(email);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Email email)) return false;
        return Objects.equals(value, email.value);
    }

    @Override
    public String toString() {
        return value;
    }
}

