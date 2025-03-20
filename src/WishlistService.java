import java.util.ArrayList;
import java.util.List;

/**
 * A simple Wishlist Service component that manages a user's wishlist.
 */
public class WishlistService {

    // Attributes
    private final String wishlistId;
    private final List<String> wishlistItems;

    // Constructor
    public WishlistService(String wishlistId) {
        this.wishlistId = wishlistId;
        this.wishlistItems = new ArrayList<>();
    }

    /**
     * A more important method: add an item to the wishlist.
     *
     * @param item the name of the item to add
     */
    public void addItem(String item) {
        wishlistItems.add(item);
        System.out.println("Added item: " + item + " to wishlist ID: " + wishlistId);
    }

    /**
     * Display the current items in the wishlist.
     */
    public void showWishlist() {
        System.out.println("Wishlist (" + wishlistId + ") contains:");
        for (String item : wishlistItems) {
            System.out.println(" - " + item);
        }
    }

}