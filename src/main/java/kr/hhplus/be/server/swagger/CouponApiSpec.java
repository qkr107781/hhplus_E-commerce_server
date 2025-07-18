package kr.hhplus.be.server.swagger;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.hhplus.be.server.presentation.coupon.CouponRequest;
import kr.hhplus.be.server.presentation.coupon.CouponResponse;
import org.springframework.http.ResponseEntity;

@Tag(name = "쿠폰", description = "쿠폰 관련 API")
public interface CouponApiSpec {

    @Operation(summary = "쿠폰 발급")
    ResponseEntity<CouponResponse.Issue> issue(CouponRequest.Issue request);

    @Operation(summary = "본인 쿠폰 조회")
    ResponseEntity<CouponResponse.SelectByUserId> selectByUserId(long user_id);

    @Operation(summary = "쿠폰 상태별 조회")
    ResponseEntity<CouponResponse.SelectByStatus> selectByStatus(String status);
}