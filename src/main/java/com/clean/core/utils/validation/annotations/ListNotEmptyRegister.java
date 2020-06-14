package com.clean.core.utils.validation.annotations;

import com.clean.core.utils.validation.ValidationMessage;
import com.clean.core.utils.validation.ValidationResult;
import com.clean.core.utils.validation.checkables.Checkable;
import com.clean.core.utils.validation.checkables.CheckerFactory;
import java.util.List;

/**
 *
 * @author Jesús Hernández Barrios (jhernandezb96@gmail.com)
 */
public class ListNotEmptyRegister implements AnnotationRegister<ListNotEmpty, List> {

    @Override
    public void checkAnnotation(ListNotEmpty annotation, List source, ValidationResult validationResult) throws IllegalArgumentException, IllegalAccessException {
        Checkable ch = CheckerFactory.buildListNotEmptyCheckable(source);
        ValidationMessage msg = ValidationMessage.from(source, annotation.message(), annotation.detailMessage(), annotation.severity());
        validationResult.check(ch, msg);
    }

}
