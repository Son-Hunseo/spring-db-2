package hello.itemservice.repository.mybatis;

import hello.itemservice.domain.Item;
import hello.itemservice.repository.ItemSearchCond;
import hello.itemservice.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {

    // 이렇게 파라미터가 하나만 넘어가면 해당 객체 안에있는 필드들 모두 마이바티스 xml에서 사용할 수 있다.
    void save(Item item);

    // 이렇게 특수하게 지정하면, 특수하게 지정한 것만 xml에서 사용할 수 있다.
    void update(@Param("id") Long id, @Param("updateParam") ItemUpdateDto updateParam);

    Optional<Item> findById(Long id);

    List<Item> findAll(ItemSearchCond itemSearch);

}
