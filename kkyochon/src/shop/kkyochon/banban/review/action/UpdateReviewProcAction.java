package shop.kkyochon.banban.review.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.kkyochon.common.Action;
import shop.kkyochon.common.ActionForward;

public class UpdateReviewProcAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		forward.setPath("/review/listReview");
		return forward;
	}
 
}