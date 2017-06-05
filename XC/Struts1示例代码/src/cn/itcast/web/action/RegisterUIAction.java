package cn.itcast.web.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class RegisterUIAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		saveToken(request);
		
		//request.getRequestDispatcher("/WEB-INF/jsp/register.jsp").forward(request, response);
		//��ת��һ����ͼ
		return mapping.findForward("registerUI");
	}
}

