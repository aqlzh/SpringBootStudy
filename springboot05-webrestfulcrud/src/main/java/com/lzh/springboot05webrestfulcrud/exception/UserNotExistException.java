package com.lzh.springboot05webrestfulcrud.exception;

public class UserNotExistException extends  RuntimeException{
   public UserNotExistException(){
       super("用户不存在") ;
   }
}
