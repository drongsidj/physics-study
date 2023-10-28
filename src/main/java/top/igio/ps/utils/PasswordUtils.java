package top.igio.ps.utils;

import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.symmetric.SymmetricCrypto;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/10/28 10:26
 * @description
 */
public class PasswordUtils {

    private static final String AES_KEY = "[B@35ef439e";

    private PasswordUtils() {

    }

    public static String encrypt(String password) {
        SymmetricCrypto aes = new SymmetricCrypto("AES", AES_KEY.getBytes());
        byte[] encryptBytes = aes.encrypt(password);
        return StrUtil.str(encryptBytes, CharsetUtil.CHARSET_UTF_8);
    }

    public static String decrypt(String password) {
        SymmetricCrypto aes = new SymmetricCrypto("AES", AES_KEY.getBytes());
        byte[] decryptBytes = aes.decrypt(password);
        return StrUtil.str(decryptBytes, CharsetUtil.CHARSET_UTF_8);
    }
}
