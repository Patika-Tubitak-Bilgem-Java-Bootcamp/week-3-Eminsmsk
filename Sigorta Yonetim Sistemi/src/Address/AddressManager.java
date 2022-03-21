package Address;

import Account.User;

public class AddressManager {

    public static void addAddress(User user, Address address) {
        user.getAddressList().add(address);
    }

    public static void removeAddress(User user, Address address) {
        user.getAddressList().remove(address);
    }

}
