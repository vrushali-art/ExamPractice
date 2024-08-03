//package com.vlup.vlnidhibank.serviceImpl;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.vlup.vlnidhibank.entity.PaymentDetails;
//import com.vlup.vlnidhibank.exceptions.ResourceNotFoundException;
//import com.vlup.vlnidhibank.repository.PaymentDetailsRepository;
//import com.vlup.vlnidhibank.service.PaymentDetailsService;
//
//import java.util.List;
//
//@Service
//public class PaymentDetailsServiceImpl implements PaymentDetailsService {
//
//    @Autowired
//    private PaymentDetailsRepository  paymentDetailsRepository;
//
//    @Override
//    public PaymentDetails createPaymentDetails(PaymentDetails paymentDetails) {
//        return paymentDetailsRepository.save(paymentDetails);
//    }
//
//    @Override
//    public PaymentDetails updatePaymentDetails(PaymentDetails paymentDetails) {
//        // Check if payment details exists
//        getPaymentDetailsById(paymentDetails.getId());
//        return paymentDetailsRepository.save(paymentDetails);
//    }
//
//    @Override
//    public void deletePaymentDetails(Integer paymentDetailsId) {
//        paymentDetailsRepository.deleteById(paymentDetailsId);
//    }
//
//    @Override
//    public PaymentDetails getPaymentDetailsById(Integer paymentDetailsId) {
//        return paymentDetailsRepository.findById(paymentDetailsId)
//                .orElseThrow(() -> new ResourceNotFoundException("PaymentDetails", "id", paymentDetailsId));
//    }
//
//    @Override
//    public List<PaymentDetails> getAllPaymentDetails() {
//        return paymentDetailsRepository.findAll();
//    }
//}
