package io.clofy.saas.libs.common.domain.exception;

public class InvalidLangException extends DomainException{
    public InvalidLangException(String message) {
        super(message);
    }

    public InvalidLangException(String message, Throwable cause) {
        super(message, cause);
    }
}
