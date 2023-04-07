package Homework21;
import Homework19.Standart;

class Shop {
    BaseItem[] itemsList;

    Shop (BaseItem[] itemsList) {
        this.itemsList = itemsList;
    }

    void payByCard(Standart card, int itemId) {
        card.buyOnline(itemsList[itemId].getSalePrice());
        itemsList[itemId] = null;
    }
}
