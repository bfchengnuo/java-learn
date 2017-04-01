import java.security.MessageDigest;
import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;


public class Encrypt {
	
	public static void main(String[] args){
		try {
			String s1 = getEncrypt("123".getBytes(), "MD5");
			System.out.println(s1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * ���ݼ���
	 * @param data ���ܵ�����
	 * @param mode ����ģʽ
	 * @return ���ܺ���ִ�
	 * @throws Exception
	 *
	 * ���� MD5
	 * md5�ĳ��ȣ�Ĭ��Ϊ128bit��Ҳ����128��0��1�Ķ����ƴ���
	 * �����ı�ﲻ�Ǻ��Ѻ�
	 * ���Խ�������ת����16���ƣ�ÿ4��bit��ʾһ��16���ƣ�
	 * ����128/4 = 32 ����16���Ʊ�ʾ��Ϊ32λ�ˡ�
	 */
	public static String getEncrypt(byte[] data,String mode)throws Exception{
		//ʵ����-��ʼ��
		MessageDigest md = MessageDigest.getInstance(mode);
		//��������
		md.update(data);
		//��ɹ�ϣ���㣬���ؼ�������MessageDigest��������Ϊ��ʼ״̬
		byte[] digest = md.digest();
		//������תʮ������
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < digest.length; i++) {
			// ����ת��4λ�� int ֵ��Ȼ��λ������
			// һ���ֽ��ǰ�λ�������������16Ҫ��0������2��
			int temp = (int)digest[i] & 0xff;
			if (temp < 16) {
				sb.append("0");
			}
			sb.append(Integer.toHexString(temp));
		}
		return sb.toString();
		
	}
	
	/**
	 * AES����
	 * @param data
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public static byte[] aesEncrypt2bytes(String data,String key) throws Exception{
		//����AES��������
		KeyGenerator Kgen =KeyGenerator.getInstance("AES");
		//����ָ������Կ������128λ��key������
		Kgen.init(128,new SecureRandom(key.getBytes()));
		//����������
		Cipher cipher = Cipher.getInstance("AES");
		//��ʼ��Ϊ����ģʽ��������
		cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(Kgen.generateKey().getEncoded(), "AES"));
		//�������ݵļ��ܲ�����
		return cipher.doFinal(data.getBytes("UTF-8"));
	}
	
	/**
	 * AES����
	 * @param data
	 * @param key
	 * @return
	 */
	public static String aesDecryptBybytes(String data,String key)throws Exception{
		KeyGenerator Kgen = KeyGenerator.getInstance("AES");
		Kgen.init(128,new SecureRandom(key.getBytes()));
		Cipher cipher=Cipher.getInstance("AES");
		//����Ϊ����ģʽ
		cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(Kgen.generateKey().getEncoded(), "AES"));
		return new String(cipher.doFinal(),"UTF-8");
	}
}
