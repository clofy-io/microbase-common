package io.clofy.saas.libs.common.domain.valueobject;

import io.clofy.saas.libs.common.domain.exception.InvalidLangException;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public record Lang(String value) implements Serializable {
    private static final Set<String> ALLOWED_LANGUAGES = Set.of(
            "en",  // English
            "fa",  // Persian
            "ar",  // Arabic
            "de",  // German
            "fr"   // French
    );

    public Lang {
        validateLang(value);
    }

    private void validateLang(String lang) {
        if (Objects.isNull(lang) || !ALLOWED_LANGUAGES.contains(lang)) {
            throw new InvalidLangException("Invalid language: " + lang + ". Allowed values: " + ALLOWED_LANGUAGES);
        }
    }

    public static Lang of(String value) {
        return new Lang(value);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lang lang)) return false;
        return Objects.equals(value, lang.value);
    }

}
