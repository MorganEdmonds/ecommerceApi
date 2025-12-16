package org.yearup.data;

import org.yearup.models.ShoppingCart;
import org.yearup.models.ShoppingCartItem;

public interface ShoppingCartDao
{
    ShoppingCart getByUserId(int userId);

    void addItem(ShoppingCartItem shoppingCartItem);

    void updateItem(ShoppingCartItem shoppingCartItem);

    void deleteAllItems(ShoppingCartItem shoppingCartItem);
    // add additional method signatures here
}
