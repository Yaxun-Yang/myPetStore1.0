package org.csu.myPetStore.persistence;

import org.csu.myPetStore.domain.Cart;
import org.csu.myPetStore.domain.CartItem;
import org.csu.myPetStore.domain.Item;

import java.math.BigDecimal;
import java.util.List;

public interface CartDAO {



    void insertCart(Cart cart);
    Cart getCart(String username);

}
