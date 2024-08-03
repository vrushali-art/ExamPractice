//package com.vlup.vlnidhibank.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.vlup.vlnidhibank.entity.Payment;
//
//
//
//@RestController
//@RequestMapping("/payments")
//public class PaymentController {
//
//    @Autowired
//    private com.vlup.vlnidhibank.service.PaymentService paymentService;
//
//    @PostMapping
//    public com.vlup.vlnidhibank.entity.Payment createPayment(@RequestBody com.vlup.vlnidhibank.entity.Payment payment) {
//        return paymentService.createPayment(payment);
//    }
//
//    @GetMapping("/{receiptNo}")
//    public com.vlup.vlnidhibank.entity.Payment getPayment(@PathVariable Long receiptNo) {
//        return paymentService.getPayment(receiptNo);
//    }
//
//    @GetMapping
//    public List<com.vlup.vlnidhibank.entity.Payment> getAllPayments() {
//        return paymentService.getAllPayments();
//    }
//
//    @PutMapping("/{receiptNo}")
//    public Payment updatePayment(@PathVariable Long receiptNo, @RequestBody Payment payment) {
//        return paymentService.updatePayment(receiptNo, payment);
//    }
//
//    @DeleteMapping("/{receiptNo}")
//    public void deletePayment(@PathVariable Long receiptNo) {
//        paymentService.deletePayment(receiptNo);
//    }
//}
