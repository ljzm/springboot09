package cn.kgc.springboot09.advisor;


import cn.kgc.springboot09.exception.DataValidationError4Rest;
import cn.kgc.springboot09.vo.R;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionAdvisor {


    @ExceptionHandler(DataValidationError4Rest.class)
    @ResponseBody
    public R validationHandler4Rest(DataValidationError4Rest error){
        BindingResult result = error.getBindingResult();
        Map<String,String> map = new HashMap<>();
        for (FieldError fieldError : result.getFieldErrors()) {
            map.put(fieldError.getField()+"Error",fieldError.getDefaultMessage());
        }
        return R.fail("数据校验失败",map);
    }



}
