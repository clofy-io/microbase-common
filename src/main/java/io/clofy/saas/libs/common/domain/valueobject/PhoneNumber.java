package io.clofy.saas.libs.common.domain.valueobject;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;

public record PhoneNumber(String value) implements Serializable {
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\+?[1-9]\\d{1,14}$");

    public PhoneNumber(String value) {
        this.validatePhoneNumber(value);
        this.value = value;
    }

    private void validatePhoneNumber(String phoneNumber) {
        Objects.requireNonNull(phoneNumber, "Phone number cannot be null");
        if (!PHONE_PATTERN.matcher(phoneNumber).matches()) {
            throw new InvalidPhoneNumberException("Invalid phone number format: " + phoneNumber);
        }
    }

    public static PhoneNumber of(String phoneNumber) {
        return new PhoneNumber(phoneNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o instanceof PhoneNumber phoneNumber) {
            return Objects.equals(this.value, phoneNumber.value);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.value;
    }

    public String value() {
        return this.value;
    }

    // Custom Exception for Invalid Phone Number
    public static class InvalidPhoneNumberException extends RuntimeException {
        public InvalidPhoneNumberException(String message) {
            super(message);
        }
    }
}

