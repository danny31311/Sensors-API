package com.example.util;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;

public class ErrorUtil {
    public static void returnErrorsToClient(BindingResult bindingResult) {
        StringBuilder errMSG = new StringBuilder();
        List<FieldError> errors = bindingResult.getFieldErrors();
        for (FieldError error : errors) {
            errMSG.append(error.getField()).append(" - ").append(error.getDefaultMessage())
                    .append(";");
        }
        throw new MeasurementException(errMSG.toString());
    }

}
