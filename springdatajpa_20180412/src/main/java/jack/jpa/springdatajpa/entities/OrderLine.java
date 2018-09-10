package jack.jpa.springdatajpa.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "order_line")
public class OrderLine {

    @OneToOne(optional = false)
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer amount;

    @Column(name = "purchase_price")
    private BigDecimal purchasePrice;

    public OrderLine() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
}
