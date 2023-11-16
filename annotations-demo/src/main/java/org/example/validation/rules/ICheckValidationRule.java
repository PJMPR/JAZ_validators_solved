package org.example.validation.rules;

import org.example.validation.ValidationResult;

public interface ICheckValidationRule {
    void validate(ValidationResult<?> validationResult);
    // <T> void validate(ValidationResult<T> validationResult);
}
