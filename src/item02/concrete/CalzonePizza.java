package item02.concrete;

import item02.abstact.Pizza;
import java.util.Arrays;

public class CalzonePizza extends Pizza {

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder> {
        private boolean sauceInside;

        public Builder sauceInside(boolean sauceInside) {
            this.sauceInside = sauceInside;
            return this;
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public CalzonePizza build() {
            return new CalzonePizza(this);
        }
    }

    protected CalzonePizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    public boolean isSauceInside() {
        return sauceInside;
    }

}
