package kr.hhplus.be.server.domain.coupon;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "coupon_issued_info")
@Getter
@NoArgsConstructor
public class CouponIssuedInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coupon_issued_id")
    private Long couponIssuedId;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "use_yn", length = 1, nullable = false)
    private String useYn;

    @Column(name = "issued_at", nullable = false)
    private LocalDateTime issuedAt;

    @Column(name = "end_date", nullable = false)
    private LocalDateTime endDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="coupon_id", nullable = false)
    private Coupon coupon;

    @Builder
    public CouponIssuedInfo(Long couponIssuedId, Long userId, String useYn, LocalDateTime issuedAt, LocalDateTime endDate, Coupon coupon) {
        this.couponIssuedId = couponIssuedId;
        this.userId = userId;
        this.useYn = useYn;
        this.issuedAt = issuedAt;
        this.endDate = endDate;
        this.coupon = coupon;
    }
}