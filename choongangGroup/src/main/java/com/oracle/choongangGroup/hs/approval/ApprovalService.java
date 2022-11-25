package com.oracle.choongangGroup.hs.approval;

import java.util.List;

public interface ApprovalService {

	List<Approval> waitingListAll(String userid);

	List<Approval> processListAll(String userid);

	List<Approval> finishListAll(String userid);
	
	int waitTotal(String userid);

	int processTotal(String userid);

	int finishTotal(String userid);

	List<ApprovalSort> sortSelect();

	MemDept getApprInfo(MemDept memDept);

	List<MemDept> apprList(String userid);

	int saveAppr(Approval approval);

}
