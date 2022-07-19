package hello.itemservice.domain.item;

/**
 * FAST : 빠른배송
 * NORMAL : 일반배송
 * SLOW : 느린배송
 */
public class DeliveryCode {

    private String code;
    private String displayName;

    public String getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public DeliveryCode(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }
}
