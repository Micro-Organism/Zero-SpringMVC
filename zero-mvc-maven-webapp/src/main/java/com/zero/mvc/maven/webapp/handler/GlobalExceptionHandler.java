package com.zero.mvc.maven.webapp.handler;

import com.zero.mvc.maven.webapp.exception.UserAgeException;
import com.zero.mvc.maven.webapp.exception.UserNameException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice：控制器增强（也就是给控制器类增加异常处理功能）
@ControllerAdvice
public class GlobalExceptionHandler {
    //@ExceptionHandler(异常的class)：表示异常的类型，当发生此类型异常时，由当前方法处理
    @ExceptionHandler(value = UserNameException.class)
    public ModelAndView doNameException(Exception exception) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "姓名不能为空！");
        mv.addObject("ex", exception);
        mv.setViewName("error");
        return mv;
    }

    //@ExceptionHandler(异常的class)：表示异常的类型，当发生此类型异常时，由当前方法处理
    @ExceptionHandler(value = UserAgeException.class)
    public ModelAndView doAgeException(Exception exception) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "年龄必须在18-60岁之间！");
        mv.addObject("ex", exception);
        mv.setViewName("error");
        return mv;
    }

    //处理其它异常，UserNameException、UserAgeException之外的异常
    @ExceptionHandler
    public ModelAndView doOtherException(Exception exception) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "系统发生错误，请通知管理员！");
        mv.addObject("ex", exception);
        mv.setViewName("error");
        return mv;
    }
}
