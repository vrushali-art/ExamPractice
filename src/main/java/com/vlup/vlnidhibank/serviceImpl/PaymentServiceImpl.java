//package com.vlup.vlnidhibank.serviceImpl;
//
//import java.util.List;
//import java.util.Optional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class PaymentServiceImpl implements com.vlup.vlnidhibank.service.PaymentService {
//
//    @Autowired
//    private com.vlup.vlnidhibank.repository.PaymentRepository paymentRepository;
//
//	@Override
//	public com.vlup.vlnidhibank.entity.Payment createPayment(com.vlup.vlnidhibank.entity.Payment payment) {
//		return paymentRepository.save(payment);
//	}
//
//    @Override
//    public com.vlup.vlnidhibank.entity.Payment getPayment(Long receiptNo) {
//    	
//        Optional<com.vlup.vlnidhibank.entity.Payment> payment = paymentRepository.findById(receiptNo);
//        return payment.orElse(null); 
//    }
//
//    @Override
//    public List<com.vlup.vlnidhibank.entity.Payment> getAllPayments() {
//        return paymentRepository.findAll();
//    }
//
//    @Override
//    public com.vlup.vlnidhibank.entity.Payment updatePayment(Long receiptNo, com.vlup.vlnidhibank.entity.Payment payment) {
//        if (paymentRepository.existsById(receiptNo)) {
//            payment.setReceiptNo(receiptNo);
//            return paymentRepository.save(payment);
//        }
//        return null; 
//    }
//
//    @Override
//    public void deletePayment(Long receiptNo) {
//        if (paymentRepository.existsById(receiptNo)) {
//            paymentRepository.deleteById(receiptNo);
//        }
//    }
//
//}
