package item02.concrete;

import item02.domain.Size;
import item02.abstact.Pizza;
import java.util.Objects;

public class SeoulPizza extends Pizza {

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public SeoulPizza build() {
            return new SeoulPizza(this);
        }
    }

    private SeoulPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }

    public Size getSize() {
        return size;
    }

}
