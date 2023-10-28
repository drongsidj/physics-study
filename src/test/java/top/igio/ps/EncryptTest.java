package top.igio.ps;

import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.SymmetricAlgorithm;
import org.junit.jupiter.api.Test;
import top.igio.ps.utils.PasswordUtils;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/10/28 10:20
 * @description
 */
public class EncryptTest {

    @Test
    void encryptTest() {
        String password = "123456";
        String encrypt = PasswordUtils.encrypt(password);
        System.out.println(encrypt);

        System.out.println(PasswordUtils.decrypt(password));
    }

}
