package shop.kkyochon.banban.order.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.kkyochon.common.Action;
import shop.kkyochon.common.ActionForward;

public class MenuOrderFormAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		forward.setPath("/views/order/menuOrderForm.jsp");
		return forward;
	}
 
}
