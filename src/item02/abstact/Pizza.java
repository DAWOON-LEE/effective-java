package item02.abstact;

import item02.domain.Topping;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    final Set<Topping> toppings;

    protected abstract static class Builder<T extends Builder<T>> {
        private final EnumSet<Topping> toppings;

        public Builder() {
            this.toppings = EnumSet.noneOf(Topping.class);
        }

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        protected abstract T self();

        public abstract Pizza build();
    }

    protected Pizza(Builder<?> builder) {
        this.toppings = builder.toppings;
    }

    public Set<Topping> getToppings() {
        return toppings;
    }

}
