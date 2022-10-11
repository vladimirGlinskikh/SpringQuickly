package kz.zhelezyaka.exceptions.service;

import kz.zhelezyaka.exceptions.exceptions.NotEnoughMoneyException;
import kz.zhelezyaka.exceptions.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
