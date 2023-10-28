package top.igio.ps.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.igio.ps.enums.ResultCodeEnum;
import top.igio.ps.exception.ResultVO;


import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * @author ljl
 * @version V1.0
 * @data 2023/8/13 16:35
 * @description
 */
@Api(value = "测试压缩文件")
@RestController
@RequestMapping("/file")
public class FileController {

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @ApiOperation("测试压缩文件")
    @PostMapping("/testZip")
    public ResultVO<?> testZip() {
        logger.info("测试压缩文件");
        ZipEntry entry = null;
        try (
                FileInputStream fis = new FileInputStream("D:\\test\\新建文本文档.zip");
                ZipInputStream zipIn = new ZipInputStream(fis);
        ) {
            entry = zipIn.getNextEntry();
            while (entry != null) {
                if (!entry.isDirectory()) {
                    System.out.println("Entry Name: " + entry.getName());

                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = zipIn.read(buffer)) > 0) {
                        System.out.write(buffer, 0, length);
                    }
                    System.out.println(); // New line after each entry
                }
                zipIn.closeEntry();
                entry = zipIn.getNextEntry();
            }
        } catch (FileNotFoundException e) {
            logger.error("文件未找到,错误信息为：{}", e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new ResultVO<>(ResultCodeEnum.SUCCESS, entry);
    }
}
