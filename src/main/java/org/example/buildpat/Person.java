package org.example.buildpat;

public class Person {
    private final String firstName;

    private Person(Builder builder) {
        this.firstName = builder.firstName;
    }

    public static Builder builder(String firstName) {
        return new Builder(firstName);
    }

    public static class Builder {
        private final String firstName;

        public Builder(String firstName) {
            this.firstName = firstName;
        }


        /*
        public Builder firstname(String firstName) {
            this.firstName = firstName;
            return this;
        }
         */

        public Person build() {
            if (firstName == null) {
                throw new IllegalStateException("firstName is required");
            }
            return new Person(this);
        }
    }
}
