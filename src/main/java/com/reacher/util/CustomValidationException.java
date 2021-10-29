package com.reacher.util;

import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomValidationException {

    @ExceptionHandler(value = {BindException.class, MethodArgumentNotValidException.class})
    public ResultVo catchValidationException(Exception e){
        BindingResult bindingResult = null;
        if(e instanceof BindException){
            bindingResult = ((BindException) e).getBindingResult();
        }else if(e instanceof MethodArgumentNotValidException){
            bindingResult = ((MethodArgumentNotValidException) e).getBindingResult();
        }else{
            return ResultVo.fail(ResultCode.PARAM_ERROR);
        }

        Map<String,String> errorMessage = new HashMap<>();
        bindingResult.getFieldErrors().forEach(fieldError -> errorMessage.put(fieldError.getField(),fieldError.getDefaultMessage()));
        return ResultVo.fail(ResultCode.PARAM_ERROR,errorMessage);
    }
}
