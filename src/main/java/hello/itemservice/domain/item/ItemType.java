package hello.itemservice.domain.item;

public enum ItemType {

    // 상품 종류
    BOOK("도서"), FOOD("음식"), ETC("기타");

    // 상품 설명
    private final String description;

    ItemType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
