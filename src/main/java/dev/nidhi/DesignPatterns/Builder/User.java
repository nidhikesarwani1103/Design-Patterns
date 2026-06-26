package dev.nidhi.DesignPatterns.Builder;

public class User {
    private String name;
    private String email;
    private int age;

    private User(){

    }

    public static class Builder{
        private String name;
        private String email;
        private int age;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setAge(int age){
            this.age = age;
            return this;
        }

        public User build(){

            if(name==null || email==null){
                throw new IllegalStateException("Name and Email cannot be null");
            }
            User user = new User();
            user.name = this.name;
            user.email = this.email;
            user.age = this.age;
            return user;
        }

    }
}
