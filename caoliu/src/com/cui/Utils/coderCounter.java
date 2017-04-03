package com.cui.Utils;

/**
 * Created by 11517 on 2017/3/19.
 */

import java.io.*;


public class coderCounter {

    static int normalLines=0;
    static int commentLines=0;
    static int whiteLines=0;

    public static void main(String[] args) {
        //假设所有的.java文件都在这个目录下
//        File f=new File("D:\\coding\\JavaPrj_3\\src\\com\\tjnu\\action");
        File f1=new File("D:\\coding\\JavaPrj_3\\src\\com\\tjnu\\dao");
        File f2=new File("D:\\coding\\JavaPrj_3\\src\\com\\tjnu\\hibernate");
        File f3=new File("D:\\coding\\JavaPrj_3\\src\\com\\tjnu\\po");
        File f4=new File("D:\\coding\\JavaPrj_3\\src\\com\\tjnu\\service");
        File f5=new File("D:\\coding\\JavaPrj_3\\src\\com\\tjnu\\util");

        File[] codeFiles=f5.listFiles();
        for(File child:codeFiles){
            System.out.println("当前目录文件:"+child+"   ");
            //判断是否以.java结尾
            if(child.getName().matches(".*\\.java$")){
                parse(child);
            }
        }
        System.out.println("代码行数："+normalLines);
        System.out.println("注释行数："+commentLines);
        System.out.println("空白行数："+whiteLines);
    }

    private static void parse(File f) {
        BufferedReader br=null;
        boolean comment=false;
        try {
            br=new BufferedReader(new FileReader(f));
            String line;
            while((line=br.readLine())!=null){
                if(line.matches("^[\\s&&[^\\n]]*$")){
                    //判断空行   以空白且不是换行的开头，以换行的结尾
                    whiteLines++;
                }
                else if(line.startsWith("/*")&&!line.endsWith("/*")){
                    commentLines++;
                    comment=true;
                }
                else if(line.startsWith("/*")&&line.endsWith("/*")){
                    commentLines++;
                }
                else if(comment) {
                    commentLines++;
                    if(line.endsWith("/*"))
                        comment=false;
                }
                else {
                    normalLines++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            if(br!=null){
                try {
                    br.close();
                    br=null;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}