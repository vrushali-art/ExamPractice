package com.vlup.vlnidhibank.service;

import java.util.List;

import com.vlup.vlnidhibank.dto.ContraVoucherDTO;



public interface ContraVoucherService {
   
  
    ContraVoucherDTO getContraVoucher(Long voucherId);
    List<ContraVoucherDTO> getAllContraVouchers();
    
    void deleteContraVoucher(Long voucherId);
	
	ContraVoucherDTO createContraVoucherDTO(ContraVoucherDTO contraVoucherDTO);
	ContraVoucherDTO updateContraVoucherDTO(Long voucherId, ContraVoucherDTO contraVoucherDTO);
	
	

    
}
