package shop.kkyochon.banban.home.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.kkyochon.common.Action;
import shop.kkyochon.common.ActionForward;

public class HomeAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		forward.setPath("/views/index.jsp");
		return forward;
	}
 
}
