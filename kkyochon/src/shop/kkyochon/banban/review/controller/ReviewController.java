package shop.kkyochon.banban.review.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import shop.kkyochon.banban.home.action.HomeAction;
import shop.kkyochon.banban.review.action.ListReviewAction;
import shop.kkyochon.banban.review.action.RegisterReviewAction;
import shop.kkyochon.banban.review.action.UpdateReviewFormAction;
import shop.kkyochon.banban.review.action.UpdateReviewProcAction;
import shop.kkyochon.common.Action;
import shop.kkyochon.common.ActionForward;


@WebServlet("/review/*")
public class ReviewController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = requestURI.substring(contextPath.length()).replaceAll("/review", "");

		ActionForward forward = null;

		if (command.equals("/registerReview")) {
			Action action = new RegisterReviewAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/listReview")) {
			Action action = new ListReviewAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if (command.equals("/updateReviewForm")) {
			Action action = new UpdateReviewFormAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}  else if (command.equals("/updateReviewProc")) {
			Action action = new UpdateReviewProcAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}   

		if (forward != null) {
			if (forward.isRedirect()) {
				// 리다이렉트
				response.sendRedirect(forward.getPath());
			} else {
				// 디스패치
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}
