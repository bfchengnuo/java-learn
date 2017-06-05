package cn.itcast.web.action;

import java.io.FileOutputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import cn.itcast.web.formbean.RegisterFormBean;

public class RegisterAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		if(!this.isTokenValid(request)){
			System.out.println("���ظ��ύ");
			return null;
		}
		this.resetToken(request);
		
		
		RegisterFormBean registerForm = (RegisterFormBean) form;
		FormFile file = registerForm.getFile();
		String filename = file.getFileName();
		InputStream in = file.getInputStream();
		int len = 0;
		byte buffer[] = new byte[1024];
		FileOutputStream out = new FileOutputStream("c:\\" + filename);
		while((len=in.read(buffer))>0){
			out.write(buffer, 0, len);
		}
		in.close();
		out.close();
		
		
		System.out.println("������ύ����");


		return null;
		
		/*RegisterFormBean registerForm= (RegisterFormBean) request.getAttribute("xxx");
		String username = registerForm.getUsername();
		String password = registerForm.getPassword();
		String email = registerForm.getEmail();
		
		
		System.out.println(mapping.getParameter());
		
		try{
			System.out.println("�����ݿ���ע��" + username + "�û�");
			request.setAttribute("message", "ע��ɹ�����");
		}catch (Exception e) {
			request.setAttribute("message", "ע��ʧ�ܣ���");
		}*/
		
		//request.getRequestDispatcher("/message.jsp").forward(request, response);
		//return mapping.findForward("message");
	}
}
