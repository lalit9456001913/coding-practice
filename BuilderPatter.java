//Builder Pattern:
//        The Builder pattern is used when you need to create complex objects step by step or when an object's construction involves multiple optional parameters.

public class BuilderPatter {
    private String username;
    private String email;
    private int age;

    private BuilderPatter(Builder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.age = builder.age;
    }

    // Getters

    public static class Builder {
        private String username;
        private String email;
        private int age;

        public Builder(String username, String email) {
            this.username = username;
            this.email = email;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public BuilderPatter build() {
            return new BuilderPatter(this);
        }
    }
    public static void main(String[] args){
        BuilderPatter user = new BuilderPatter.Builder("JohnDoe", "johndoe@example.com")
                .age(25)
                .build();
        System.out.println(user);
    }
}

