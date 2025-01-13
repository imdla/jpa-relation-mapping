package com.example.relationprac.domain.user.dto;

import com.example.relationprac.domain.product.Product;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;


@Getter
@NoArgsConstructor
public class UserProductListRequestDto {

    @NotBlank(message = "제품명은 필수입력입니다.")
    private List<
            @NotBlank(message = "제품명은 필수입력입니다.")
            @Length(min = 3, max = 20, message = "제품명은 3자 이상 20자 이하입니다.") String> productNames;
}
