

public class TextBlock {
    public static void main(String[] args) {
        String html = 
            """
            <!DOCTYPE html>
            <html lang="zh-tw">
            <head>
                <title>%s</title>
            </head>
            <body>
                %s
            </html>
            """;
        //"""表示每行都自動換行
    	String title = "Java Tutorial";
    	String content = "<b>Hello, World</b>";//<b></b>為變粗體字
        
    	
        System.out.println(html.formatted(title, content));
    }
}
