//https://www.tutorialspoint.com/jsoup/index.htm
/**
 * Example program to list links and images  from a URL.
 */


import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class JsoupRun {
    public static void main(String[] args) throws IOException {



        //Scan00();
        //Scan01();
       // Scan02();
       // Scan03();
        //Scan04();//soup_extract_attribute
       // Scan05();// extract Text
        Scan06();// set_attributes.htm
    }




    private static void print(String msg, Object... args) {

        System.out.println(String.format(msg, args));
    }

    private static String trim(String s, int width) {
        if (s.length() > width)
            return s.substring(0, width - 1) + ".";
        else
            return s;
    }

    private static void Scan00() throws IOException {

        String html = "<html><head><title>Sample Title1</title></head>"
                + "<body>"
                + "<p>Sample Content</p>"
                + "<div id='sampleDiv'><a href='www.google.com'>Google</a></div>"
                + "</body></html>";

        Document doc = Jsoup.parse(html);
        //doc − document object represents the HTML DOM
        Elements t = doc.select("title");
        print("Title = %s...", t);//Title = <title>First parse</title>...
        System.out.println(doc.title());//First parse
        System.out.println("doc.body\n---------\n");
        Element body = doc.body();
        Elements paragraphs = doc.getElementsByTag("p");
        for (Element paragraph : paragraphs) {
            System.out.println(paragraph.text());
        }

    }//Scan00()






    private static void Scan01() {
        System.out.println("SimpleScan()\n-----------------\n ");
        String html = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<p>Sample Content</p>"
                + "<div id='sampleDiv'><a href='www.google.com'>Google</a></div>"
                + "</body></html>";
        Document document = Jsoup.parse(html);
        System.out.println(document.title());
        Elements paragraphs = document.getElementsByTag("p");
        for (Element paragraph : paragraphs) {
            System.out.println(paragraph.text());
        }

        Element sampleDiv = document.getElementById("sampleDiv");
        System.out.println("Data: " + sampleDiv.text());
        Elements links = sampleDiv.getElementsByTag("a");

        for (Element link : links) {
            System.out.println("Href: " + link.attr("href"));
            System.out.println("Text: " + link.text());
        }
    }//private static void  Scan01(){

    private static void Scan02() throws IOException {
        Document doc;

        String url = "http://www.walla.co.il";
        print("Fetching %s...", url);
        doc = Jsoup.connect(url).get();
        Elements paragraphs = doc.getElementsByTag("p");
        System.out.println("Title of [ " + url + " ] is " + doc.title());
        paragraphs = doc.getElementsByTag("p");
        System.out.println("paragraph.text()\n---------\n");
        for (Element paragraph : paragraphs) {
            System.out.println(paragraph.text());
        }


        Elements links = doc.select("a[href]");
        Elements media = doc.select("[src]");
        Elements imports = doc.select("link[href]");

        print("\nMedia: (%d)", media.size());
        for (Element src : media) {
            if (src.normalName().equals("img"))
                print(" * %s: <%s> %sx%s (%s)",
                        src.tagName(), src.attr("abs:src"), src.attr("width"), src.attr("height"),
                        trim(src.attr("alt"), 20));
            else
                print(" * %s: <%s>", src.tagName(), src.attr("abs:src"));
        }

        print("\nImports: (%d)", imports.size());
        for (Element link : imports) {
            print(" * %s <%s> (%s)", link.tagName(), link.attr("abs:href"), link.attr("rel"));
        }

        print("\nLinks: (%d)", links.size());
        for (Element link : links) {
            print(" * a: <%s>  (%s)", link.attr("abs:href"), trim(link.text(), 35));
        }
    }


//https://www.tutorialspoint.com/jsoup/jsoup_use_selector.htm
    private static void Scan03() throws IOException {
        String html = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<p>Sample Content</p>"
                + "<div id='sampleDiv'><a href='www.google.com'>Google</a>"
                + "<h3><a>Sample</a><h3>"
                +"</div>"
                + "<div id='imageDiv' class='header'><img name='google' src='google.png' />"
                + "<img name='yahoo' src='yahoo.jpg' />"
                +"</div>"
                +"</body></html>";
        Document document = Jsoup.parse(html);

        //a with href
        Elements links = document.select("a[href]");

        for (Element link : links) {
            System.out.println("Href: " + link.attr("href"));
            System.out.println("Text: " + link.text());
        }

        // img with src ending .png
        Elements pngs = document.select("img[src$=.png]");

        for (Element png : pngs) {
            System.out.println("Name (img[src$=.png]): " + png.attr("name"));
        }

        // div with class=header
        Element headerDiv = document.select("div.header").first();
        System.out.println("Id(div.header): " + headerDiv.id());

        // direct a after h3
        Elements sampleLinks = document.select("h3 > a");

        for (Element link : sampleLinks) {
            System.out.println("Text(direct a after h3): " + link.text());
        }
    }//Scan03


    //   Scan04();//soup_extract_attribute
    //https://www.tutorialspoint.com/jsoup/jsoup_extract_attribute.htm
    private static void Scan04() throws IOException {
        String html = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<p>Sample Content</p>"
                + "<div id='sampleDiv'><a href='www.google.com'>Google</a>"
                + "<h3><a>Sample</a><h3>"
                +"</div>"
                +"</body></html>";
        Document document = Jsoup.parse(html);
        //a with href
        Element link = document.select("a").first();
        System.out.println("Href: " + link.attr("href"));
        System.out.println("Text: " + link.text());
        System.out.println("Outer HTML: " + link.outerHtml());
        System.out.println("Inner HTML: " + link.html());
    }

//       Scan05()
//https://www.tutorialspoint.com/jsoup/jsoup_use_url.htm
/*
* link.attr("href") −   href present in anchor tag.
 link.attr("abs:href") −  absolute url after resolving against the document's
* base URI.

link.absUrl("href") −  absolute url after resolving against the document's
* base URI.
* */

private static void Scan05() throws IOException {
    String url = "http://www.tutorialspoint.com/";
    Document document = Jsoup.connect(url).get();

    Element link = document.select("a").first();
    System.out.println("Relative Link: " + link.attr("href"));
    System.out.println("Absolute Link: " + link.attr("abs:href"));
    System.out.println("Absolute Link: " + link.absUrl("href"));


}// Scan06()
//https://www.tutorialspoint.com/jsoup/jsoup_set_attributes.htm
    private static void Scan06() throws IOException {
        String html = "<html><head><title>Sample Title</title></head>"
                + "<body>"
                + "<p>Sample Content</p>"
                + "<div id='sampleDiv'><a id='googleA' href='www.google.com'>Google</a></div>"
                + "<div class='comments'><a href='www.sample1.com'>Sample1</a>"
                + "<a href='www.sample2.com'>Sample2</a>"
                + "<a href='www.sample3.com'>Sample3</a><div>"
                +"</div>"
                + "<div id='imageDiv' class='header'><img name='google' src='google.png' />"
                + "<img name='yahoo' src='yahoo.jpg' />"
                +"</div>"
                +"</body></html>";
        Document document = Jsoup.parse(html);

        //Example: set attribute
        Element link = document.getElementById("googleA");
        System.out.println("Outer HTML Before Modification :"  + link.outerHtml());
        link.attr("href","www.yahoo.com");
        System.out.println("Outer HTML After Modification :"  + link.outerHtml());
        System.out.println("---");

        //Example: add class
        Element div = document.getElementById("sampleDiv");
        System.out.println("Outer HTML Before Modification :"  + div.outerHtml());
        link.addClass("header");
        System.out.println("Outer HTML After Modification :"  + div.outerHtml());
        System.out.println("---");

        //Example: remove class
        Element div1 = document.getElementById("imageDiv");
        System.out.println("Outer HTML Before Modification :"  + div1.outerHtml());
        div1.removeClass("header");
        System.out.println("Outer HTML After Modification :"  + div1.outerHtml());
        System.out.println("---");

        //Example: bulk update
        Elements links = document.select("div.comments a");
        System.out.println("Outer HTML Before Modification :"  + links.outerHtml());
        links.attr("rel", "nofollow");
        System.out.println("Outer HTML Before Modification :"  + links.outerHtml());


    }// Scan06()



}//main