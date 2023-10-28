package top.igio.ps.utils;

import org.jasypt.properties.PropertyValueEncryptionUtils;
import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/10/28 15:45
 * @description
 */
public class JasyptEncryptorUtils {
    private static final String SALT = "";

    private static BasicTextEncryptor basicTextEncryptor = new BasicTextEncryptor();

    static {
        basicTextEncryptor.setPassword(SALT);
    }

    private JasyptEncryptorUtils(){}

    /**
     * 明文加密
     * @param plaintext
     * @return
     */
    public static String encode(String plaintext){
        System.out.println("明文字符串：" + plaintext);
        String ciphertext = basicTextEncryptor.encrypt(plaintext);
        System.out.println("加密后字符串：" + ciphertext);
        return ciphertext;
    }

    /**
     * 解密
     * @param ciphertext
     * @return
     */
    public static String decode(String ciphertext){
        System.out.println("加密字符串：" + ciphertext);
        ciphertext = "ENC(" + ciphertext + ")";
        if (PropertyValueEncryptionUtils.isEncryptedValue(ciphertext)){
            String plaintext = PropertyValueEncryptionUtils.decrypt(ciphertext,basicTextEncryptor);
            System.out.println("解密后的字符串：" + plaintext);
            return plaintext;
        }
        System.out.println("解密失败");
        return "";
    }
}
