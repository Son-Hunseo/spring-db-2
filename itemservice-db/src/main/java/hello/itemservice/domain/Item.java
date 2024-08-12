package hello.itemservice.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // primary key 라는것을 의미 + DB 에서 프라이머리 키 생성해주는 정책 설정
    private Long id;

    @Column(name = "item_name", length = 10) // 실제 DB 컬럼 명은 item_name이라는 뜻, 관례 생각해보면 된다! // 사실 없어도 된다. 관례 매핑 생각!
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
