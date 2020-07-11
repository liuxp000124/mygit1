package com.leo.Tutorial.Students;
public class Student {
   private Integer age;
   private String name;
   private Integer id;
   private String post;
   public void setAge(Integer age) {
      this.age = age;
   }
   public Integer getAge() {
      return age;
   }
   public void setName(String name) {
      this.name = name;
   }
   public String getName() {
      return name;
   }
   public void setId(Integer id) {
      this.id = id;
   }
   public Integer getId() {
      return id;
   }
   public String getPost(){
      return this.post;
   }
   public void setPost(String post){
      this.post = post;
   }
}