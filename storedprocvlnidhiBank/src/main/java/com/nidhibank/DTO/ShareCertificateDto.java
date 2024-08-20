package com.nidhibank.DTO;




import java.math.BigDecimal;

import com.nidhibank.Enums.Status;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ShareCertificateDto {
		private String memberCode;
		private String memberName;
		private BigDecimal shareValue;
		private long noOfShare;
		private String folioNo;
		private String dnoFrom;
	    private String dnoTo;
	    private Status status;
	    
	    public ShareCertificateDto(String memberCode, String memberName, BigDecimal shareValue, long noOfShare,
				String folioNo, String dno, Status status) {
			super();
			this.memberCode = memberCode;
			this.memberName = memberName;
			this.shareValue = shareValue;
			this.noOfShare = noOfShare;
			this.folioNo = folioNo;
			this.status = status;
}
}
