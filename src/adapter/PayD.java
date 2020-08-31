package adapter;

public interface PayD {

    String getCustCardNo();
    String getCardOwnerName();
    String getCardExpMonthDate();
    Integer getcVVNo();
    Double getTotalAmount();

    void setCustCardNo(String custCardNo);
    void setCardOwnerName(String cardOwnerName);
    void setCardExpMonthDate(String cardExpMonthDate);
    void setcVVNo(Integer cVVNo);
    void setTotalAmount(Double totalAmount);
}
