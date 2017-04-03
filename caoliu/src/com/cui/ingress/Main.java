package com.cui.ingress;

import com.cui.Utils.FileTool;
import com.cui.Utils.Page;
import com.cui.bean.Url;
import com.cui.dao.UrlDao;
import com.cui.dao.UrlDaoImpl;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by 11517 on 2017/4/2.
 */
public class Main {
    public static void main(String[] args) {
//       updataUrl();
        File file=new File("d:/url.txt");
        FileTool fileTool=new FileTool();
        String string ="";
        UrlDao urlDao=new UrlDaoImpl();

        for(int i=0;i<2334/100;i++){
            Page page=new Page();
            page.setEveryPage(100);
            page.setBeginIndex(1+i*100);
//            page.setTotalCount(2334);
            List<Url> urlList= urlDao.getUrlListByPage(page);
            for(int j=0;j<urlList.size();j++){
                string +=urlList.get(j).getHref()+"\r\n";
            }
            if(i%5==0){
                fileTool.saveFile(string,new File("d:/url"+i+".txt"));
                string="";
                System.out.println("生成一个文件");
            }
        }
        System.out.println(string);
        System.out.println("Success");
    }



    public static boolean updataUrl(){
        File file=new File("d:/1.html");
        String html= FileTool.readFile(file,"utf-8");
        Document document=null;
        String baseUrl="https://trello.com";
        UrlDao urlDao=new UrlDaoImpl();
        Url url=new Url();
        document= Jsoup.parse(html,"https://trello.com");
        Elements elements=document.getElementsByTag("div");
        for (int i=0;i<elements.size();i++){
            if (i>2){
                //跳过前面不是任务的界面
                if("http://schema.org/ItemList".equals(elements.get(i).attr("itemType"))){
                    String area=elements.get(i).getElementsByTag("h3").get(0).text();
                    url.setArea(area);
                    Elements elements1=elements.get(i).getElementsByTag("li");
                    for (int j=0;j<elements1.size();j++){
                        if ("http://schema.org/ListItem".equals(elements1.get(j).attr("itemtype"))){
                            String href=baseUrl+elements1.get(j).getElementsByTag("a").attr("href");
                            String urlName=elements1.get(j).getElementsByTag("span").text();
//                            System.out.println(j+"::::::"+href+":::::"+urlName);
                            url.setUrlName(urlName);
                            url.setHref(href);
                            System.out.println(url);
//                            urlDao.saveUrl(url);
                            try {
                                sleep(10);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                    }

                }
            }
        }
        return true;
    }

    public boolean fun2(){
        return true;
    }
}
