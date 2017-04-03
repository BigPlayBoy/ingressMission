package com.cui.Utils;


import java.io.*;


/**
 * Created by jarvis on 2016/10/29.
 * 文件读写工具
 */
public class FileTool {
//    static Logger logger = LoggerFactory.getLogger("FileTool.class");

    public static String readFile(File file, String code) {
        String string = null;
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), code));
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                string += s;
            }
        } catch (IOException e) {
            e.printStackTrace();
//            logger.error("读取文件失败！文件名：" + file);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        logger.info("读取文件成功");
        return string;
    }

    public boolean saveFile(String string, File filePath) {
        PrintWriter printWriter = null;
        if (string == null) {
//            logger.error("待写入信息为空，请确认后再次写入");
            return false;
        }
        try {
            printWriter = new PrintWriter(filePath);
            printWriter.print(string);
//            logger.info("写入文件成功！文件名：" + filePath);
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
//            logger.error("写入文件出错！文件名:" + filePath);
        }
        return true;
    }


    public static void main(String[] args) {
//        File file = new File("d:/1.html");
//        File file1 = new File("e:/798.html");
//        String result = readFile(file, "utf-8");
//        System.out.println(result);
//        FileTool.saveFile("12345", file1);
        getFileName();
    }

    public static File[] getFileName() {
        String path = "d:/coding"; // 路径
        File f = new File(path);
        if (!f.exists()) {
            System.out.println(path + " 不存在");
            return null;
        }

        File files[] = f.listFiles();
//        for (int i = 0; i < files.length; i++) {
//            File fs = files[i];
//            if (fs.isDirectory()) {
//                System.out.println(fs.getName() + " [目录]");
//            } else {
//                System.out.println(fs.getName());
//            }
//        }
        return  files;
    }
}
